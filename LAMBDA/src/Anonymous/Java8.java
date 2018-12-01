package Anonymous;


	import javax.swing.*;
	import java.awt.*;
	class Java8 extends JFrame
	{
	    JButton button;
	    public Java8()
	    {
		setTitle("Button Action Example using Lambda Expression");
		setSize(400,300);
		setVisible(true);
		setLayout(new FlowLayout());
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		button = new JButton("Button");
		button.setBounds(100,100,90,40);
		//Lambda expression
		button.addActionListener(e-> 
		   System.out.println("You clicked the button.")); 
		
		add(button);
	    }
	    public static void main(String args[])
	    {
		new Java8();
	    }   
	}

