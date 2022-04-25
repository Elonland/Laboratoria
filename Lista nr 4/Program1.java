import java.awt.*;
import java.awt.event.*;

class MyWindowAdapter extends WindowAdapter
{
	public void windowClosing(WindowEvent e) 
	{
		System.exit(0);
	}
}

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
    TextField input;
    Label output;
    MyFrame()
    {
        super("Pascal Triangle");
        setBounds(100,100,640,480);
        //pack();
        addWindowListener(new MyWindowAdapter());
        setFont(new Font(Font.SANS_SERIF,Font.PLAIN,40));
        setLayout(new GridLayout(6,1));
        
        MyButton buttonCal = new MyButton(this);
        input = new TextField(40);
        output = new Label();
        
        input.addKeyListener(new KeyAdapter()
        {
            public void keyPressed(KeyEvent e)
            {
                //int ch = e.getKeyChar();
                //String str = output.getText();
                //output.setText(str+ch);
            }
        });

        add(buttonCal);
        add(input);
        add(output);
        setResizable(true);
    }
    public void action()
    {	
        try
        {
        	
        	String text1 = input.getText();
        	int limit = Integer.parseInt(text1);
        	int count = 0;
        	String data = "";
        	for(int i = 1; i <= limit; i++)
        	{
        		Object = new WierszTrojkataPascala(i);
        		while(count < i)
        		{
        				
        			String text2;
        			long number3 = Object.wspolczynnik(count);
        			text2 = Long.toString(number3);
        			data = data + " " + text2;
        			count++;
        			output.setText(data);
        			
        		}       		
        		output = new Label();
        		data = "";
        		add(output);
        		
        		count = 0;
        		
        	}
            input.setText(""); 
            //frame.pack();
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
        frame.pack();
        frame.setVisible(true);
    }
}
