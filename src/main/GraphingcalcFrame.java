package main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;

import javax.swing.event.*;
import javax.imageio.ImageIO;
import javax.swing.*;

public class GraphingcalcFrame extends JFrame implements ActionListener, ChangeListener {
	
	public JButton button1;
	public JButton button2;
	public JButton button3;
	public JButton button4;
	public JButton button5;
	public JButton button6;
	public JButton button7;
	public JButton button8;
	public JButton button9;
	public JButton button10;
	public JButton button11;
	
	public JTextField name1;
	public JTextField name2;
	public JTextField name3;
	public JTextField name4;
	public JTextField name5;
	public JTextField name6;
	public JTextField name7;
	public JTextField name8;
	public JTextField name9;
	public JTextField name10;
	public JTextField name11;
	public JTextField name12;
	public JTextField name13;
	public JTextField name14;
	public JTextField name15;
	public JTextField name16;
	public JTextField name17;
	public JTextField name18;
	public JTextField name19;
	public JTextField name20;
	public JTextField name21;
	public JTextField name22;
	public JTextField name23;
	public JTextField name24;
	public JTextField name25;
	public JTextField name26;
	public JTextField name27;
	public JTextField name28;
	public JTextField name29;
	public JTextField name30;
	public JTextField name31;
	public JTextField name32;
	public JTextField name33;
	public JTextField name34;
	public JTextField name35;
	
	public Color pink = Color.decode("#FF00F7");
	public Color orange = Color.decode("#FF8900");
	
	{
	JFrame F = new JFrame("a");
	
	try{
	    setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File(("dank.jpg"))))));
		}catch(IOException e)
		{
			System.out.println("poo");
		}
	
	F.setResizable(false);
	F.pack();
	F.setVisible(true);}

	public GraphingcalcFrame (String title) {
		super(title);
		
		setLayout(new FlowLayout());
		
		button1 = new JButton("Polynomial");
		button1.setPreferredSize(new Dimension (300,250));
		button1.setBackground(orange);
		button1.addActionListener(this);
		button1.setActionCommand("button1");
		
		button2 = new JButton("Trigonometric");
		button2.setPreferredSize(new Dimension (300,250));
		button2.setBackground(pink);
		button2.addActionListener(this);
		button2.setActionCommand("button2");
		
		button3 = new JButton("Exponential");
		button3.setPreferredSize(new Dimension (300,250));
		button3.setBackground(Color.cyan);
		button3.addActionListener(this);
		button3.setActionCommand("button3");
		
		button4 = new JButton("Logarithmic");
		button4.setPreferredSize(new Dimension (300,250));
		button4.setBackground(Color.green);
		button4.addActionListener(this);
		button4.setActionCommand("button4");
		
		add (button1);
		add (button2);
		add (button3);
		add (button4);
		
		validate();
		repaint();
	}
	
private void LogarithmicGUI() {
	//alog k(x-d)+c
	//    b
	name19 = new JTextField("Enter your 'A' Value");
	name19.setBounds(100,100,200,40);
	name19.addActionListener(this);
	name19.setActionCommand("name19");
	
	name20 = new JTextField("Enter your 'B' Value");
	name20.setBounds(500,100,200,40);
	name20.addActionListener(this);
	name20.setActionCommand("name20");
	
	name21 = new JTextField("Enter your 'K' Value");
	name21.setBounds(300,250,200,40);
	name21.addActionListener(this);
	name21.setActionCommand("name21");
	
	name22 = new JTextField("Enter your 'D' Value");
	name22.setBounds(100,400,200,40);
	name22.addActionListener(this);
	name22.setActionCommand("name22");
	
	name23 = new JTextField("Enter your 'C' Value");
	name23.setBounds(500,400,200,40);
	name23.addActionListener(this);
	name23.setActionCommand("name23");
		
	add(name19);
	add(name20);
	add(name21);
	add(name22);
	add(name23);
	
	
		
	}

	private void ExponentialGUI() {
		//ab^x
		name1 = new JTextField("Enter your 'A' Value");
		name1.setBounds(100,250,200,40);
		name1.addActionListener(this);
		name1.setActionCommand("name1");
		
		name2 = new JTextField("Enter your 'B' value");
		name2.setBounds(450,250,200,40);
		name2.addActionListener(this);
		name2.setActionCommand("name2");
		
		add (name1);
		add (name2);
		
	}

	private void TrigonometricGUI() {
		
		button9 = new JButton("Sine");
		button9.setPreferredSize(new Dimension (299,250));
		button9.setBackground(pink);
		button9.addActionListener(this);
		button9.setActionCommand("button9");
		
		button10 = new JButton("Cosine");
		button10.setPreferredSize(new Dimension (299,250));
		button10.setBackground(pink);
		button10.addActionListener(this);
		button10.setActionCommand("button10");
		
		button11 = new JButton("Tangent");
		button11.setPreferredSize(new Dimension (299,250));
		button11.setBackground(pink);
		button11.addActionListener(this);
		button11.setActionCommand("button11");
		
		add (button9);
		add (button10);
		add (button11);
		
		validate();
		repaint();
		
	}

	private void PolynomialGUI() {
		
		
		
		button5 = new JButton("Linear");
		button5.setPreferredSize(new Dimension (299,250));
		button5.setBackground(orange);
		button5.addActionListener(this);
		button5.setActionCommand("button5");
		
		button6 = new JButton("Quadratic");
		button6.setPreferredSize(new Dimension (299,250));
		button6.setBackground(orange);
		button6.addActionListener(this);
		button6.setActionCommand("button6");
		
		button7 = new JButton("Cubic");
		button7.setPreferredSize(new Dimension (299,250));
		button7.setBackground(orange);
		button7.addActionListener(this);
		button7.setActionCommand("button7");
		
		button8 = new JButton("Quartic");
		button8.setPreferredSize(new Dimension (299,250));
		button8.setBackground(orange);
		button8.addActionListener(this);
		button8.setActionCommand("button8");
		
		add (button5);
		add (button6);
		add (button7);
		add (button8);
		
		validate();
		repaint();
	}

	public void actionPerformed(ActionEvent event) {
		if (event.getActionCommand().equals("button1")) {
			getContentPane().removeAll();
			validate();
			repaint();
			PolynomialGUI();
		}
		else if (event.getActionCommand().equals("button2")){
			getContentPane().removeAll();
			validate();
			repaint();
			TrigonometricGUI();
		}
		else if (event.getActionCommand().equals("button3")) {
			getContentPane().removeAll();
			validate();
			repaint();
			ExponentialGUI();
		}
		else if (event.getActionCommand().equals("button4")) {
			getContentPane().removeAll();
			validate();
			repaint();
			LogarithmicGUI();
		}
		else if (event.getActionCommand().equals("button5")) {
			getContentPane().removeAll();
			validate();
			repaint();
			PolyLinear();
		}
		else if (event.getActionCommand().equals("button6")) {
			getContentPane().removeAll();
			validate();
			repaint();
			PolyQuadratic();
		}
		else if (event.getActionCommand().equals("button7")) {
			getContentPane().removeAll();
			validate();
			repaint();
			PolyCubic();
		}
		else if (event.getActionCommand().equals("button8")) {
			getContentPane().removeAll();
			validate();
			repaint();
			PolyQuartic();
		}
		else if (event.getActionCommand().equals("button9")) {
			getContentPane().removeAll();
			validate();
			repaint();
			TrigSin();
		}
		else if (event.getActionCommand().equals("button10")) {
			getContentPane().removeAll();
			validate();
			repaint();
			TrigCos();
		}
		else if (event.getActionCommand().equals("button11")) {
			getContentPane().removeAll();
			validate();
			repaint();
			TrigTan();
		}
	}
	

	private void TrigTan() {
		//atan(k(x-d))+c
		name32 = new JTextField("Enter your 'A' Value");
		name32.setBounds(100,100,200,40);
		name32.addActionListener(this);
		name32.setActionCommand("name32");
		
		name33 = new JTextField("Enter your 'K' Value");
		name33.setBounds(500,100,200,40);
		name33.addActionListener(this);
		name33.setActionCommand("name33");
		
		name34 = new JTextField("Enter your 'D' Value");
		name34.setBounds(100,400,200,40);
		name34.addActionListener(this);
		name34.setActionCommand("name34");
		
		name35 = new JTextField("Enter your 'C' Value");
		name35.setBounds(500,400,200,40);
		name35.addActionListener(this);
		name35.setActionCommand("name35");
		
		add(name32);
		add(name33);
		add(name34);
		add(name35);
		
		
		
	}

	private void TrigCos() {
		//acos(k(x-d))+c
		name28 = new JTextField("Enter your 'A' Value");
		name28.setBounds(100,100,200,40);
		name28.addActionListener(this);
		name28.setActionCommand("name28");
		
		name29 = new JTextField("Enter your 'K' Value");
		name29.setBounds(500,100,200,40);
		name29.addActionListener(this);
		name29.setActionCommand("name29");
		
		name30 = new JTextField("Enter your 'D' Value");
		name30.setBounds(100,400,200,40);
		name30.addActionListener(this);
		name30.setActionCommand("name30");
		
		name31 = new JTextField("Enter your 'C' Value");
		name31.setBounds(500,400,200,40);
		name31.addActionListener(this);
		name31.setActionCommand("name31");
		
		add(name28);
		add(name29);
		add(name30);
		add(name31);
		
		
	}

	private void TrigSin() {
		//asin(k(x-d))+c
		name24 = new JTextField("Enter your 'A' Value");
		name24.setBounds(100,100,200,40);
		name24.addActionListener(this);
		name24.setActionCommand("name24");
		
		name25 = new JTextField("Enter your 'K' Value");
		name25.setBounds(500,100,200,40);
		name25.addActionListener(this);
		name25.setActionCommand("name25");
		
		name26 = new JTextField("Enter your 'D' Value");
		name26.setBounds(100,400,200,40);
		name26.addActionListener(this);
		name26.setActionCommand("name26");
		
		name27 = new JTextField("Enter your 'C' Value");
		name27.setBounds(500,400,200,40);
		name27.addActionListener(this);
		name27.setActionCommand("name27");
		
		add(name24);
		add(name25);
		add(name26);
		add(name27);
		
		
		
	}

	private void PolyQuartic() {
		//ax^4+bx^3+cx^2+dx+e
		name14 = new JTextField("Enter your 'A' Value");
		name14.setBounds(100,100,200,40);
		name14.addActionListener(this);
		name14.setActionCommand("name14");
		
		name15 = new JTextField("Enter your 'B' Value");
		name15.setBounds(500,100,200,40);
		name15.addActionListener(this);
		name15.setActionCommand("name15");
		
		name16 = new JTextField("Enter your 'C' Value");
		name16.setBounds(300,250,200,40);
		name16.addActionListener(this);
		name16.setActionCommand("name16");
		
		name17 = new JTextField("Enter your 'D' Value");
		name17.setBounds(100,400,200,40);
		name17.addActionListener(this);
		name17.setActionCommand("name17");
		
		name18 = new JTextField("Enter your 'E' Value");
		name18.setBounds(500,400,200,40);
		name18.addActionListener(this);
		name18.setActionCommand("name18");
		
		add(name14);
		add(name15);
		add(name16);
		add(name17);
		add(name18);
		
		
		
	}

	private void PolyCubic() {
		//ax^3+bx^2+cx+d
		name10 = new JTextField("Enter your 'A' Value");
		name10.setBounds(100,100,200,40);
		name10.addActionListener(this);
		name10.setActionCommand("name10");
		
		name11 = new JTextField("Enter your 'B' Value");
		name11.setBounds(500,100,200,40);
		name11.addActionListener(this);
		name11.setActionCommand("name11");
		
		name12 = new JTextField("Enter your 'C' Value");
		name12.setBounds(100,400,200,40);
		name12.addActionListener(this);
		name12.setActionCommand("name12");
		
		name13 = new JTextField("Enter your 'D' Value");
		name13.setBounds(500,400,200,40);
		name13.addActionListener(this);
		name13.setActionCommand("name13");
		
		add(name10);
		add(name11);
		add(name12);
		add(name13);
		
		
		
	}

	private void PolyQuadratic() {
		//ax^2+bx+c
		name7 = new JTextField("Enter your 'A' Value");
		name7.setBounds(100,200,200,40);
		name7.addActionListener(this);
		name7.setActionCommand("name7");
		
		name8 = new JTextField("Enter your 'B' Value");
		name8.setBounds(500,200,200,40);
		name8.addActionListener(this);
		name8.setActionCommand("name8");
		
		name9 = new JTextField("Enter your 'C' Value");
		name9.setBounds(295,350,200,40);
		name9.addActionListener(this);
		name9.setActionCommand("name9");
		
		add(name7);
		add(name8);
		add(name9);
		
		
	}

	private void PolyLinear() {
		//mx+b
		name5 = new JTextField("Enter your 'M' Value");
		name5.setBounds(100,250,200,40);
		name5.addActionListener(this);
		name5.setActionCommand("name5");
		
		name6 = new JTextField("Enter your 'B' Value");
		name6.setBounds(450,250,200,40);
		name6.addActionListener(this);
		name6.setActionCommand("name6");
		
		add (name5);
		add (name6);
		
		
		
	}

	public void stateChanged(ChangeEvent event) {
		
		
	}
	
	
}






