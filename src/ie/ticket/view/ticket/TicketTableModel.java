/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ie.ticket.view.ticket;

import ie.ticket.models.entity.Ticket;
import java.util.Arrays;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Vanessa
 */
public class TicketTableModel extends AbstractTableModel{
    
    private List<Ticket> tickets;
    private List<String> columnModel;
    private String type;

    public TicketTableModel(List<Ticket> tickets, String type) {
        this.tickets = tickets;
        this.type = type;
        
        if("open".equals(type)){
            this.columnModel = Arrays.asList("id", "Created AT", "Issue","Classification", "Responsable" );
        }else{
            this.columnModel = Arrays.asList("id", "Closed AT", "Issue","Classification", "Responsable" );
        }
    }

    @Override
    public String getColumnName(int column) {
        return columnModel.get(column);
    }
    
    @Override
    public int getRowCount() {
        return tickets.size();
    }

    @Override
    public int getColumnCount() {
        return columnModel.size();
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Ticket ticket = tickets.get(rowIndex);
        switch(columnIndex){
            case 0: return ticket.getId();
            case 1: 
                if(this.type.equals("open")){
                    return ticket.getCreated();
                }else{
                    return ticket.getClosed();
                }
            case 2: return ticket.getDescription();
            case 3:
                String label;
                if("L".equals(ticket.getClassification().toString())){
                    label = "Longterm";
                }else if("N".equals(ticket.getClassification().toString())){
                    label = "Normal";
                }else{
                    label = "Urgente";
                }
                
                return label;
            case 4: return ticket.getUser().getId();
        }
        
        return null;
    }

    public List<Ticket> getTickets() {
        return tickets;
    }

    public void setTickets(List<Ticket> tickets) {
        this.tickets = tickets;
    }
    
}
