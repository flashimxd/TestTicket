/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ie.ticket.view.ticket;

import ie.ticket.models.entity.RoleType;
import ie.ticket.models.service.UserService;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import ie.ticket.models.entity.User;
import javax.swing.JOptionPane;

/**
 *
 * @author Vanessa
 */
public class UserActionListener implements ActionListener, ListSelectionListener {

    private UserFrm frm;
    private UserService service;
    private UserTableModel tableModel;

    public UserActionListener(UserFrm frm) {
        this.frm = frm;
        this.service = new UserService();
        addListeners();
        disableTextFields(false);
        enableOrDisableButtonsToEdit(false);
        setTableModel();
    }

    public void setTableModel() {
        tableModel = new UserTableModel(service.getUsers());
        frm.getJtUsers().setModel(tableModel);
        frm.getJtUsers().getSelectionModel()
                .addListSelectionListener(new ListSelectionListener() {
                    @Override
                    public void valueChanged(ListSelectionEvent e) {
                        User user = tableModel.getUsers().get(frm.getJtUsers().getSelectedRow());
                        UserToForm(user);
                    }
                });
    }

    public void addListeners() {
        frm.getJbAdd().addActionListener(this);
        frm.getJbCancel().addActionListener(this);
        frm.getJbDelete().addActionListener(this);
        frm.getJbEdit().addActionListener(this);
        frm.getJbExit().addActionListener(this);
        frm.getJbSave().addActionListener(this);
    }

    private void enableButtonsToSaveAction() {
        enableOrDisableButtonsToEdit(true);
    }

    private void disableButtonsToSaveAction() {
        enableOrDisableButtonsToEdit(false);
    }

    private void enableOrDisableButtonsToEdit(Boolean enable) {
        frm.getJbAdd().setEnabled(!enable);
        frm.getJbEdit().setEnabled(!enable);
        frm.getJbDelete().setEnabled(!enable);
        frm.getJbSave().setEnabled(enable);
        frm.getJbCancel().setEnabled(enable);
    }

    private void disableTextFields(Boolean enable) {
        frm.getJtUsername().setEnabled(enable);
        frm.getJtPassword().setEnabled(enable);
        frm.getJcRole().setEnabled(enable);
    }

    private void cleanInputFields() {
        frm.getLblIdUser().setText("");
        frm.getJtUsername().setText("");
        frm.getJtPassword().setText("");
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        if (event.getActionCommand().equals("Add")) {
            add();
        } else if (event.getActionCommand().equals("Edit")) {
            disableTextFields(true);
            enableButtonsToSaveAction();
        } else if (event.getActionCommand().equals("Delete")) {

        } else if (event.getActionCommand().equals("Save")) {
            save();
        } else if (event.getActionCommand().equals("Cancel")) {
            disableButtonsToSaveAction();
            disableTextFields(false);
            cleanInputFields();
        }

    }

    public void save() {
        service.save(FormToUser());
        JOptionPane.showMessageDialog(frm, "User added", "Save", JOptionPane.INFORMATION_MESSAGE);
        disableButtonsToSaveAction();
    }

    public void add() {
        cleanInputFields();
        disableTextFields(true);
        enableButtonsToSaveAction();
    }

    private User FormToUser() {

        User user = new User();
        if (!"".equals(frm.getLblIdUser().getText())) {
            user.setId(Long.parseLong(frm.getLblIdUser().getText()));
        }

        RoleType role;

        int selectedIndex = frm.getJcRole().getSelectedIndex();

        if (selectedIndex == 0) {
            role = RoleType.S;
        } else if (selectedIndex == 1) {
            role = RoleType.A;
        } else {
            role = RoleType.M;
        }

        user.setName(frm.getJtUsername().getText());
        user.setPassword(frm.getJtPassword().getText());
        user.setRole(role);
        return user;
    }

    private void UserToForm(User user) {
        frm.getLblIdUser().setText(Long.toString(user.getId()));
        frm.getJtUsername().setText(user.getName());
        frm.getJtPassword().setText(user.getPassword());

        if ("S".equals(user.getRole().toString())) {
            frm.getJcRole().setSelectedIndex(0);
        } else if ("A".equals(user.getRole().toString())) {
            frm.getJcRole().setSelectedIndex(1);
        } else {
            frm.getJcRole().setSelectedIndex(2);
        }
    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
    }

}
