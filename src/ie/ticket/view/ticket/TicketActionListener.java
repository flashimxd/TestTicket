/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ie.ticket.view.ticket;

import ie.ticket.models.entity.ClassType;
import ie.ticket.models.entity.RoleType;
import ie.ticket.models.entity.StatusType;
import ie.ticket.models.entity.Ticket;
import ie.ticket.models.entity.User;
import ie.ticket.models.service.TicketService;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author Vanessa
 */
public class TicketActionListener implements ActionListener, ListSelectionListener{
    
    private TicketFrm frm;
    private TicketService service;
    private TicketTableModel tableModel;
    
    public TicketActionListener(TicketFrm frm) {
        this.frm = frm;
        this.service = new TicketService();
        addListeners();
        enableOrDisableButtonsToEdit(false);
        setTableModelOpen();
        setTableModelClosed();
    }
    
    
    public void setTableModelOpen(){
        tableModel = new TicketTableModel(service.getOpenedTickets(), "open");
        frm.getJtOpen().setModel(tableModel);
        frm.getJtOpen().getSelectionModel()
                .addListSelectionListener(this);
    }
    
    public void setTableModelClosed(){
        tableModel = new TicketTableModel(service.getClosedTickets(), "closed");
        frm.getJtClosed().setModel(tableModel);
        frm.getJtClosed().getSelectionModel()
                .addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                Ticket ticket = tableModel.getTickets().get(frm.getJtClosed().getSelectedRow() );
                TicketToForm(ticket);
            }
        });
    }
    
    public void addListeners(){
        frm.getJbAdd().addActionListener(this);
        frm.getJbCancel().addActionListener(this);
        frm.getJbDelete().addActionListener(this);
        frm.getJbEdit().addActionListener(this);
        frm.getJbExit().addActionListener(this);
        frm.getJbSave().addActionListener(this);
    }
    
    private void enableButtonsToSaveAction(){
        enableOrDisableButtonsToEdit(true);
    }
    
    private void disableButtonsToSaveAction(){
        enableOrDisableButtonsToEdit(false);
    }
    
    private void enableOrDisableButtonsToEdit(Boolean enable){
        frm.getJbAdd().setEnabled(!enable);
        frm.getJbEdit().setEnabled(!enable);
        frm.getJbDelete().setEnabled(!enable);
        frm.getJbSave().setEnabled(enable);
        frm.getJbCancel().setEnabled(enable);
    }
    
    @Override
    public void actionPerformed(ActionEvent event) {
        if(event.getActionCommand().equals("Add")){
            add();
        }else if(event.getActionCommand().equals("Edit")){
            
        }else if(event.getActionCommand().equals("Delete")){
            
        }else if(event.getActionCommand().equals("Save")){
            save();
        }else if(event.getActionCommand().equals("Cancel")){
            
        }
        
    }
    
    public void add(){
        
        enableButtonsToSaveAction();
    }
    
    public void save(){
        service.save(FormToTicket());
        JOptionPane.showMessageDialog(frm, "Ticket added", "Save", JOptionPane.INFORMATION_MESSAGE);
        disableButtonsToSaveAction();
    }
    
    private Ticket FormToTicket(){
        
        Ticket ticket = new Ticket();
        if(!"".equals(frm.getLblIdTicket().getText())){
            ticket.setId(Long.parseLong(frm.getLblIdTicket().getText()));
        }
       
        Date created = new Date();
        StatusType status = StatusType.O;
        ClassType  classification;
        
        int selectedIndex = frm.getCbClass().getSelectedIndex();
        
        if(selectedIndex == 0){
            classification = ClassType.L;
        }else if(selectedIndex == 1){
            classification = ClassType.N;
        }else{
            classification = ClassType.U;
        }
        
        ticket.setDescription(frm.getTxtDescription().getText());
        ticket.setCreated(created);
        ticket.setStatus(status);
        ticket.setClassification(classification);
        User user = new User(4,"Muie gata", "1234", RoleType.A);
        ticket.setUser(user);
        return ticket;
    }
    
    private void TicketToForm(Ticket ticket){
        frm.getLblIdTicket().setText(Long.toString(ticket.getId()));
        frm.getTxtDescription().setText(ticket.getDescription());
         
        if("L".equals(ticket.getClassification().toString())){
            frm.getCbClass().setSelectedIndex(0);
        } else if("N".equals(ticket.getClassification().toString())) {
            frm.getCbClass().setSelectedIndex(1);
        } else{
            frm.getCbClass().setSelectedIndex(2);
        }
    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
        //System.out.println(e.);
        Ticket ticket = tableModel.getTickets().get(frm.getJtOpen().getSelectedRow() );
        TicketToForm(ticket);
    }
    
}
