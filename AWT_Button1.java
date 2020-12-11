import javax.swing.*;
import java.awt.*;

public class AWT_Button1 extends Frame {
    AWT_Button1(){
        Button b=new Button("Click me");
        b.setBounds(30,100,80,30);
        add(b);
        setSize(300,300);
        setLayout(null);
        setVisible(true);
    }
    public static void main(String [] args) {
        AWT_Button1 a = new AWT_Button1();

    }}

