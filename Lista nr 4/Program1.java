import java.awt.*;
import java.awt.event.*;
import java.util.logging.Formatter;

import javax.swing.plaf.basic.BasicOptionPaneUI.ButtonActionListener;
import javax.swing.plaf.metal.MetalBorders.TextFieldBorder;

class MyButton extends Button 
{
    MyButton(MyFrame f) { 
        // Wywolanie konstruktora klasy bazowej Button
      super("Calculate"); 
      // Zeby mogl dzialac trzeba dodac obsluge zadan
      // Metoda addActionListener pobiera obiekt typu ActionListener  
      // jako parametr
      addActionListener(new MyButtonAdapter(f));
    }
}

class MyButtonAdapter implements ActionListener 
{
    MyFrame f;
    MyButtonAdapter(MyFrame f) { this.f = f; }  
    public void actionPerformed(ActionEvent e) { f.action(); }
}

class MyFrame extends Frame
{
    WierszTrojkataPascala Object;
    Button buttonCal;
    TextField input;
    Label output;
    MyFrame()
    {
        super("Pascal Triangle");
        
        pack();
        addWindowListener(new MyWindowAdapter());
        setFont(new Font(Font.SANS_SERIF,Font.PLAIN,40));
        setLayout(new GridLayout(1,3));
        buttonCal = new MyButton(this);
        input = new TextField(40);
        output = new Label();
        input.addKeyListener(new KeyAdapter()
        {
            public void keyPressed(KeyEvent e)
            {
                //int ch = e.getKeyChar();//Trzeba jakoś to do Pascala podbiąć
                //String str = output.getText();
                //output.setText(str+ch);
            }
        });

        add(buttonCal);
        add(input);
        add(output);
    }
    public void action()
    {
        try
        {
           String text1 = input.getText();
            int number2 = Integer.parseInt(text1);
            Object = new WierszTrojkataPascala(number2);
            long number3 = Object.wspolczynnik(3);
            String text2 = Long.toString(number3);
            output.setText(text2);
            input.setText(""); 
        }
        catch(MyException e)
        {
            System.out.println(e);
        }
        
    }
}

public class Program1
{
    public static void main(String[] args)
    {
        MyFrame frame = new MyFrame();
        frame.setVisible(true);
    }
}
