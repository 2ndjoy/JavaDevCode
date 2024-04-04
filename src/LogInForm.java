import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LogInForm {

     public static boolean checkData(String userName, String password){
         if (userName.equals("Java")&&password.equals("123")){
             return true;
         }
         return false;
     }

    public static void addComponentsToPanel(JPanel panel) {

        JLabel userLabel=new JLabel("User");
        JTextField userText=new JTextField();
        JLabel passwordLabel=new JLabel("Password");
        JTextField passwordText=new JTextField();


// button s
        JButton cancelButton= new JButton("Canel");
        JButton loginButton= new JButton("Log in");


//        Adding components
        panel.add(userLabel);
        panel.add(userText);
        panel.add(passwordLabel);
        panel.add(passwordText);
        panel.add(cancelButton);
        panel.add(loginButton);
   
//        action code of login
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (checkData(userText.getText(),passwordText.getText())){
                    JOptionPane.showMessageDialog(panel,"Hello "+userText.getText()+" Welcome to Swing","login message",JOptionPane.INFORMATION_MESSAGE);
                }
                else {
                    JOptionPane.showMessageDialog(panel,"Invalid user or pass","Login message",JOptionPane.ERROR_MESSAGE);
                }

            }
        });
        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });


    }

    public static void main(String[] args) {

        JFrame frame=new JFrame("Log in form demo");

        JPanel panel=new JPanel(new GridLayout(3,2,15,15));

        addComponentsToPanel(panel);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setLocationRelativeTo(null);

        frame.setSize(300,150);

        frame.getContentPane().add(panel);

        frame.setVisible(true);


    }
}
