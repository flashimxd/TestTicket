/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ie.ticket.view.ticket;

import ie.ticket.models.service.TicketService;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Vanessa
 */
public class ManagerActionListener implements ActionListener{
    private ManagerFrm frm;
    private TicketService service;
    
    public ManagerActionListener(ManagerFrm frm) {
        this.frm = frm;
        this.service = new TicketService();
        getNumber();
    }
    
    public void getNumber(){
        
        int openeds = service.getOpenedTickets().size();
        int closeds = service.getClosedTickets().size();
        
        frm.getjLtkOpen().setText(Long.toString(openeds));
        frm.getjLtClose().setText(Long.toString(closeds));
        
        int expendOpen = openeds*50;
        int expendClosed = closeds*50;
        
        frm.getjLTotalOpen().setText(Long.toString(expendOpen)+" EUR");
        frm.getjLTotalClose().setText(Long.toString(expendClosed)+" EUR");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
}
