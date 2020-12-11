import javax.swing.*;
public class JTextfield {
    public static void main(String args[]){
        JFrame f=new JFrame("Textfield Example");
        JTextField t1=new JTextField("First text");
        t1.setBounds(50,50,100,30);
        JTextField t2=new JTextField("Secound text");
        t2.setBounds(50,100,100,30);



        f.add(t1);
        f.add(t2);
        f.setSize(500,500);
        f.setLayout(null);
        f.setVisible(true);
    }
}