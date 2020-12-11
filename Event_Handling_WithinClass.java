import java.awt.*;
import java.awt.event.*;
class Event_Handling_WithinClass extends Frame implements ActionListener{
    TextField tf;
    Event_Handling_WithinClass(){
        tf=new TextField();
        tf.setBounds(60,50,170,20);
        Button b=new Button("click me");
        b.setBounds(100,120,80,30);
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tf.setText("Welcome");
                setVisible(false);
            }
        });


        add(b);
        add(tf);
        setSize(300,300);
        setLayout(null);

        setVisible(true);

    }


    public void actionPerformed(ActionEvent e)
    {
        tf.setText("Welcome");
    }
    public static void main(String args[]) {
        new Event_Handling_WithinClass();
    }
    }
