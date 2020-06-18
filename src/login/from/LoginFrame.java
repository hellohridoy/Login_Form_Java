
package login.from;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JOptionPane;



public class LoginFrame extends JFrame {
    JTextField txt = new JTextField(20);
    JPasswordField pass = new JPasswordField(20);
    
    public LoginFrame(){
    
        creatLoginFrame();
    }

    private void creatLoginFrame() {
        setTitle("Login Form");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(creatMainPanel());
        setVisible(true);
        setSize(300,180);
    }

    private JPanel creatMainPanel() {
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout(10,10));
        panel.add(creatTitle(),BorderLayout.NORTH);
        panel.add(creatNamePanel(),BorderLayout.WEST);
        panel.add(creatInputPanel(),BorderLayout.CENTER);
        panel.add(creatStatusPanel(),BorderLayout.EAST);
        panel.add(creatSubmitPanel(),BorderLayout.SOUTH);
        return panel;
    }
    public JPanel creatTitle(){
        JPanel panel = new JPanel();
        JLabel label = new JLabel("Login");
        panel.add(label); 
        return panel;
    }

    private Component creatNamePanel() {
        JPanel panel = new JPanel();
        JLabel label1 = new JLabel("UserName");
        JLabel label2 = new JLabel("Password");
        panel.setLayout(new GridLayout(2,1,5,5));
        panel.add(label1);
        panel.add(label2);
        return panel;
    }

    private Component creatInputPanel() {
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(2,1,5,5));
        panel.add(txt);
        panel.add(pass);
        return panel;
    }

    private Component creatStatusPanel() {
        JPanel panel = new JPanel();
        JLabel label1 = new JLabel("TextField");
        JLabel label2 = new JLabel("Password");
        panel.setLayout(new GridLayout(2,1,5,5));
        panel.add(label1);
        panel.add(label2);
        return panel;
    }

    private Component creatSubmitPanel() {
        
        JPanel panel = new JPanel();
        JButton btn = new JButton("Login");
        JButton btn2 = new JButton("Reset");
        JButton btn3 = new JButton("Exit");
        panel.add(btn);
        panel.add(btn2);
        panel.add(btn3);

        btn.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                String password = pass.getText();
                String userName = txt.getText();
                

                if(userName.equals("admin") && password.equals("1234")){
                    JOptionPane.showMessageDialog(null, "LogIn success");
                }else{
                    JOptionPane.showMessageDialog(null, "Invalid Password / "
                            + "Username");
                    }
            }
        });
        
        btn2.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                txt.setText(null);
                pass.setText(null);
            }
        });
        
         btn3.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                System.exit(0);
            }
        });
         
        panel.add(btn);
        panel.add(btn2);
        panel.add(btn3);
        return panel;
    }
}
