import javax.swing.*;

public class SwingExample {
    public static void main(String[] args) {

        JFrame frame=new JFrame("My first gui");
        frame.setSize(380,300);

        JLabel label=new JLabel("Hello");
        JTextField textField=new JTextField();

        JButton button1=new JButton("1. Button1");
        JButton button2=new JButton("2. Button1");
        JButton button3=new JButton("3. Button1");

        JPanel panel=new JPanel();

        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(label);
        panel.add(textField);

        frame.add(panel);
        frame.show();

    }
}