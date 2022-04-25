import java.awt.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

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
        	//String text1 = input.getText();	
        	//output.setText(data);      				
            //input.setText(""); 
            //frame.pack();
        String inputForTest;
        try 
        {
            inputForTest = input.getText();
            ProcessBuilder   ps=new ProcessBuilder("Test.out");
            ps.redirectErrorStream(true);
            Process pr = Runtime.getRuntime().exec("Test.out" + inputForTest);
            BufferedReader in = new BufferedReader(new InputStreamReader(pr.getInputStream()));
                    
            String line;
            while ((line = in.readLine()) != null)
            {
                output.setText(line); 
            }

                    
            Thread.sleep(5000);
            pr.destroy();
        
        } 
        catch (Exception ex) 
        {
            ex.printStackTrace();
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
