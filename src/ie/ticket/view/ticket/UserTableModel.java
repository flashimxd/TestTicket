/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ie.ticket.view.ticket;

import ie.ticket.models.entity.Ticket;
import ie.ticket.models.entity.User;
import java.util.Arrays;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Vanessa
 */
public class UserTableModel extends AbstractTableModel {

    private List<User> users;
    private List<String> columnModel;

    public UserTableModel(List<User> users) {
        this.users = users;
        this.columnModel = Arrays.asList("id", "Name", "Password", "Role");
    }

    @Override
    public String getColumnName(int column) {
        return columnModel.get(column);
    }

    @Override
    public int getRowCount() {
        return users.size();
    }

    @Override
    public int getColumnCount() {
        return columnModel.size();
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        User user = users.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return user.getId();
            case 1:
                return user.getName();
            case 2:
                return user.getPassword();
            case 3:
                String label;
                if ("S".equals(user.getRole().toString())) {
                    label = "Tech Support";
                } else if ("A".equals(user.getRole().toString())) {
                    label = "System Admin";
                } else {
                    label = "Manager";
                }

                return label;
        }

        return null;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

}
