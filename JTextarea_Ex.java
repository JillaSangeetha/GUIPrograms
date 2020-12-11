import javax.swing.*;
public class JTextarea_Ex {
    public static void main(String args[]){
        JFrame f=new JFrame("TextArea Example");
        JTextArea t1=new JTextArea("First text");
        t1.setBounds(10,30,200,200);
        f.add(t1);
        f.setSize(500,500);
        f.setLayout(null);
        f.setVisible(true);
    }
}