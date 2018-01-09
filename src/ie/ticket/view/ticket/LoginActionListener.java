/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ie.ticket.view.ticket;

import ie.ticket.models.service.UserService;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Vanessa
 */
public class LoginActionListener implements ActionListener {
    
    private LoginFrm frm;
    private UserService service;
    
    public LoginActionListener(LoginFrm frm) {
        this.frm = frm;
        this.service = new UserService();
        addListeners();
    }
    
    public void addListeners(){
        frm.getJbLogin().addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent event) {
        if(event.getActionCommand().equals("Login")){
            String username = frm.getJtUsername().getText();
            String password = frm.getJtPassword().getText();
            login(username,password);
        }
        
    }
    
    public void login(String username, String password){
        int result = service.login(username, password);
        if(result > 0){
            frm.setVisible(false);
            if(result == 1){
                new TicketFrm().setVisible(true);
            }else if(result == 2){
                new UserFrm().setVisible(true);
            }else if(result == 3){
                new ManagerFrm().setVisible(true);
            }
            
        }else{
            JOptionPane.showMessageDialog(frm, "Login Failed", "Login", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    
}
