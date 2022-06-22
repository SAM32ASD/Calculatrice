import java.awt.*;
import java.awt.event.*;

public class Main implements ActionListener {
    int c,n;
    String s1,s2,s3,s4,s5;
    Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,badd,bsub,bmul,bdiv,bclr,bequal;
    Frame f;
    Panel  p;
    TextField t;
    GridLayout g;

    Main (){
        f = new Frame("Calculatrice");
        f.setLayout(new FlowLayout());
        p = new Panel();

        b0 = new Button("0");
        b0.addActionListener(this);

        b1 = new Button("1");
        b1.addActionListener(this);

        b2 = new Button("2");
        b2.addActionListener(this);

        b3 = new Button("3");
        b3.addActionListener(this);

        b4 = new Button("4");
        b4.addActionListener(this);

        b5 = new Button("5");
        b5.addActionListener(this);

        b6 = new Button("6");
        b6.addActionListener(this);

        b7 = new Button("7");
        b7.addActionListener(this);

        b8 = new Button("8");
        b8.addActionListener(this);

        b9 = new Button("9");
        b9.addActionListener(this);

        badd = new Button("+");
        badd.addActionListener(this);

        bsub = new Button("-");
        bsub.addActionListener(this);

        bmul = new Button("*");
        bmul.addActionListener(this);

        bdiv = new Button("/");
        bdiv.addActionListener(this);

        bequal = new Button("=");
        bequal.addActionListener(this);

        bclr = new Button("AC");
        bclr.addActionListener(this);

        t = new TextField(20);
        f.add(t);

        g = new GridLayout(4,4);
        p.setLayout(g);

        p.add(b0);
        p.add(b1);
        p.add(b2);
        p.add(b3);
        p.add(b4);
        p.add(b5);
        p.add(b6);
        p.add(b7);
        p.add(b8);
        p.add(b9);
        p.add(badd);
        p.add(bsub);
        p.add(bmul);
        p.add(bdiv);
        p.add(bequal);
        p.add(bclr);

        f.add(p);
        f.setSize(200,180);
        f.setVisible(true);
        f.setBackground(Color.lightGray);
        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowOpened(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==b0){
            s3 = t.getText();
            s4 = "0";
            s5 = s3 + s4;
            t.setText(s5);
        }
        if (e.getSource()==b1){
            s3 = t.getText();
            s4 = "1";
            s5 = s3 + s4;
            t.setText(s5);
        }
        if (e.getSource()==b2){
            s3 = t.getText();
            s4 = "2";
            s5 = s3 + s4;
            t.setText(s5);
        }
        if (e.getSource()==b3){
            s3 = t.getText();
            s4 = "3";
            s5 = s3 + s4;
            t.setText(s5);
        }
        if (e.getSource()==b4){
            s3 = t.getText();
            s4 = "4";
            s5 = s3 + s4;
            t.setText(s5);
        }
        if (e.getSource()==b5){
            s3 = t.getText();
            s4 = "5";
            s5 = s3 + s4;
            t.setText(s5);
        }
        if (e.getSource()==b6){
            s3 = t.getText();
            s4 = "6";
            s5 = s3 + s4;
            t.setText(s5);
        }
        if (e.getSource()==b7){
            s3 = t.getText();
            s4 = "7";
            s5 = s3 + s4;
            t.setText(s5);
        }
        if (e.getSource()==b8){
            s3 = t.getText();
            s4 = "8";
            s5 = s3 + s4;
            t.setText(s5);
        }
        if (e.getSource()==b9){
            s3 = t.getText();
            s4 = "9";
            s5 = s3 + s4;
            t.setText(s5);
        }
        if (e.getSource()==badd){
            s1 = t.getText();
            t.setText("");
            c = 1;
        }
        if (e.getSource()==bsub){
            s1 = t.getText();
            t.setText("");
            c = 2;
        }
        if (e.getSource()==bmul){
            s1 = t.getText();
            t.setText("");
            c = 3;
        }
        if (e.getSource()==bdiv){
            s1 = t.getText();
            t.setText("");
            c = 4;
        }
        if (e.getSource()==bequal){
            s2 = t.getText();
            if(c == 1){
                n = Integer.parseInt(s1) + Integer.parseInt(s2);
                t.setText(String.valueOf(n));
            }
            if(c == 2){
                n = Integer.parseInt(s1) - Integer.parseInt(s2);
                t.setText(String.valueOf(n));
            }
            if(c == 3){
                n = Integer.parseInt(s1) * Integer.parseInt(s2);
                t.setText(String.valueOf(n));
            }
            if(c == 4){
                n = Integer.parseInt(s1) / Integer.parseInt(s2);
                t.setText(String.valueOf(n));
            }
        }
        if (e.getSource()==bclr){
            t.setText("");
        }
    }
    public static void main (String [] args) {
        Main calc = new Main();
    }
}
