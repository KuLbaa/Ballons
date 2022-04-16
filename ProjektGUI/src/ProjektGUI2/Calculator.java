package ProjektGUI2;

import javax.swing.*;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.*;
import javax.swing.border.LineBorder;



public class Calculator extends JFrame  implements ActionListener {
	
	String[] functions = {};
	int way = 0;
	
	JTextField textfield;
	JLabel CalculatorText, Function_chart;
	JButton b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, bdiv, bmul, bsub, badd, bdec, beq, bmin, bclr, bper, decimal, binary, hexadecimal, octal, ba, bb, bc, bd, be, bf;
	
	double n1=0, n2=0, result=0; 
	String num, num2;
	int nu1, nu2;
	int resultBin;
	int resultNonDecimal;
	int operator;
	int minplus = 0;
	double number;
	boolean isDouble;
	
	
		
	
	public Calculator() {
		
		textfield = new JTextField();
		CalculatorText = new JLabel("CALCULATOR", JLabel.CENTER);
		Function_chart = new JLabel("GRAPH OF A FUNCTION", JLabel.CENTER);
		
		Font font = new Font("SanSerif", Font.BOLD, 20);
		Font font1 = new Font("SanSerif", Font.BOLD, 35);
		Font font2 = new Font("SanSerif", Font.BOLD, 30);

		textfield.setFont(font2);
		textfield.setHorizontalAlignment(JTextField.RIGHT);
		textfield.setBackground(Color.darkGray);
		textfield.setForeground(Color.white);
		textfield.setBorder(new LineBorder(Color.DARK_GRAY));
		
		CalculatorText.setBounds(30, 20, 296, 40);
		CalculatorText.setForeground(Color.orange);
		CalculatorText.setFont(font1);
		
		Function_chart.setBounds(490, 20, 450, 40);
		Function_chart.setForeground(Color.red);
		Function_chart.setFont(font1);
		
		decimal=new JButton("Decimal");
		decimal.setBackground(Color.gray);
		decimal.setForeground(Color.green);
		decimal.setBorder(new LineBorder(Color.gray));
		decimal.setFont(font);
		
		octal=new JButton("Octal");
		octal.setBackground(Color.gray);
		octal.setForeground(Color.white);
		octal.setBorder(new LineBorder(Color.gray));
		octal.setFont(font);
		
		binary=new JButton("Binary");
		binary.setBackground(Color.gray);
		binary.setForeground(Color.white);
		binary.setBorder(new LineBorder(Color.gray));
		binary.setFont(font);
		
		hexadecimal=new JButton("Hexadecimal");
		hexadecimal.setBackground(Color.gray);
		hexadecimal.setForeground(Color.white);
		hexadecimal.setBorder(new LineBorder(Color.gray));
		hexadecimal.setFont(font);
		
		ba=new JButton("A");
		ba.setBackground(Color.gray);
		ba.setForeground(Color.white);
		ba.setBorder(new LineBorder(Color.gray));
		ba.setFont(font);
		
		bb=new JButton("B");
		bb.setBackground(Color.gray);
		bb.setForeground(Color.white);
		bb.setBorder(new LineBorder(Color.gray));
		bb.setFont(font);
		
		bc=new JButton("C");
		bc.setBackground(Color.gray);
		bc.setForeground(Color.white);
		bc.setBorder(new LineBorder(Color.gray));
		bc.setFont(font);
		
		bd=new JButton("D");
		bd.setBackground(Color.gray);
		bd.setForeground(Color.white);
		bd.setBorder(new LineBorder(Color.gray));
		bd.setFont(font);
		
		be=new JButton("E");
		be.setBackground(Color.gray);
		be.setForeground(Color.white);
		be.setBorder(new LineBorder(Color.gray));
		be.setFont(font);
		
		bf=new JButton("F");
		bf.setBackground(Color.gray);
		bf.setForeground(Color.white);
		bf.setBorder(new LineBorder(Color.gray));
		bf.setFont(font);

		b0=new JButton("0");
		b0.setBackground(Color.gray);
		b0.setForeground(Color.white);
		b0.setBorder(new LineBorder(Color.gray));
		b0.setFont(font);
		
		b1=new JButton("1");
		b1.setBackground(Color.gray);
		b1.setForeground(Color.white);
		b1.setBorder(new LineBorder(Color.gray));
		b1.setFont(font);
		
		b2=new JButton("2");
		b2.setBackground(Color.gray);
		b2.setForeground(Color.white);
		b2.setBorder(new LineBorder(Color.gray));
		b2.setFont(font);
		
		b3=new JButton("3");
		b3.setBackground(Color.gray);
		b3.setForeground(Color.white);
		b3.setBorder(new LineBorder(Color.gray));
		b3.setFont(font);
		
		b4=new JButton("4");
		b4.setBackground(Color.gray);
		b4.setForeground(Color.white);
		b4.setBorder(new LineBorder(Color.gray));
		b4.setFont(font);
		
		b5=new JButton("5");
		b5.setBackground(Color.gray);
		b5.setForeground(Color.white);
		b5.setBorder(new LineBorder(Color.gray));
		b5.setFont(font);
		
		b6=new JButton("6");
		b6.setBackground(Color.gray);
		b6.setForeground(Color.white);
		b6.setBorder(new LineBorder(Color.gray));
		b6.setFont(font);
		
		b7=new JButton("7");
		b7.setBackground(Color.gray);
		b7.setForeground(Color.white);
		b7.setBorder(new LineBorder(Color.gray));
		b7.setFont(font);
		
		b8=new JButton("8");
		b8.setBackground(Color.gray);
		b8.setForeground(Color.white);
		b8.setBorder(new LineBorder(Color.gray));
		b8.setFont(font);
		
		b9=new JButton("9");
		b9.setBackground(Color.gray);
		b9.setForeground(Color.white);
		b9.setBorder(new LineBorder(Color.gray));
		b9.setFont(font);
		
		bdec=new JButton(".");
		bdec.setBackground(Color.gray);
		bdec.setForeground(Color.white);
		bdec.setBorder(new LineBorder(Color.gray));
		bdec.setFont(font);
		
		bdiv=new JButton(":");
		bdiv.setBackground(Color.orange);
		bdiv.setForeground(Color.white);
		bdiv.setBorder(new LineBorder(Color.orange));
		bdiv.setFont(font);
		
		bmul=new JButton("*");
		bmul.setBackground(Color.orange);
		bmul.setForeground(Color.white);
		bmul.setBorder(new LineBorder(Color.orange));
		bmul.setFont(font);
		
		bsub=new JButton("-");
		bsub.setBackground(Color.orange);
		bsub.setForeground(Color.white);
		bsub.setBorder(new LineBorder(Color.orange));
		bsub.setFont(font);
		
		badd=new JButton("+");
		badd.setBackground(Color.orange);
		badd.setForeground(Color.white);
		badd.setBorder(new LineBorder(Color.orange));
		badd.setFont(font);
		
		beq=new JButton("=");
		beq.setBackground(Color.orange);
		beq.setForeground(Color.white);
		beq.setBorder(new LineBorder(Color.orange));
		beq.setFont(font);
		
		bmin=new JButton("+/-");
		bmin.setBackground(Color.LIGHT_GRAY);
		bmin.setForeground(Color.white);
		bmin.setBorder(new LineBorder(Color.LIGHT_GRAY));
		bmin.setFont(font);
		
		bclr=new JButton("C");
		bclr.setBackground(Color.LIGHT_GRAY);
		bclr.setForeground(Color.white);
		bclr.setBorder(new LineBorder(Color.LIGHT_GRAY));
		bclr.setFont(font);
		
		bper=new JButton("%");
		bper.setBackground(Color.LIGHT_GRAY);
		bper.setForeground(Color.white);
		bper.setBorder(new LineBorder(Color.LIGHT_GRAY));
		bper.setFont(font);
		
		setLayout(null);
		setVisible(true);
		setSize(1000,480);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		
		textfield.setBounds(30, 80, 296, 30);
		bclr.setBounds(30, 115, 70, 30);
		bmin.setBounds(105, 115, 70, 30 );
		bper.setBounds(180, 115, 70, 30);
		bdiv.setBounds(255, 115, 70, 30);
		b7.setBounds(30, 150, 70, 30);
		b8.setBounds(105, 150, 70, 30);
		b9.setBounds(180, 150, 70, 30);
		bmul.setBounds(255, 150, 70, 30);
		b4.setBounds(30, 185, 70, 30);
		b5.setBounds(105, 185, 70, 30);
		b6.setBounds(180, 185, 70, 30);
		bsub.setBounds(255, 185, 70, 30);
		b1.setBounds(30, 220, 70, 30);
		b2.setBounds(105, 220, 70, 30);
		b3.setBounds(180, 220, 70, 30);
		badd.setBounds(255, 220, 70, 30);
		b0.setBounds(30, 255, 145, 30);
		bdec.setBounds(180, 255, 70, 30);
		beq.setBounds(255, 255, 70, 30);
		decimal.setBounds(30,360,145,30);
		hexadecimal.setBounds(30, 400, 145, 30);
		binary.setBounds(180, 360, 145, 30);
		octal.setBounds(180, 400, 145, 30);
		ba.setBounds(30, 290, 70, 30);
		bb.setBounds(105, 290, 70, 30);
		bc.setBounds(180, 290, 70, 30);
		bd.setBounds(30, 325, 70, 30);
		be.setBounds(105, 325, 70, 30);
		bf.setBounds(180, 325, 70, 30);
		
		ba.setVisible(false);
		bb.setVisible(false);
		bc.setVisible(false);
		bd.setVisible(false);
		be.setVisible(false);
		bf.setVisible(false);
		
		add(textfield);
		add(bclr);
		add(bmin);
		add(bper);
		add(bdiv);
		add(b7);
		add(b8);
		add(b9);
		add(bmul);
		add(b4);
		add(b5);
		add(b6);
		add(bsub);
		add(b1);
		add(b2);
		add(b3);
		add(badd);
		add(b0);
		add(bdec);
		add(beq);
		add(CalculatorText);
		add(Function_chart);
		add(decimal);
		add(hexadecimal);
		add(binary);
		add(octal);
		add(ba);
		add(bb);
		add(bc);
		add(bd);
		add(be);
		add(bf);
		
		bclr.addActionListener(this);
		bmin.addActionListener(this);
		bper.addActionListener(this);
		bdiv.addActionListener(this);
		
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		bmul.addActionListener(this);
		
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		bsub.addActionListener(this);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		badd.addActionListener(this);
		
		b0.addActionListener(this);
		bdec.addActionListener(this);
		beq.addActionListener(this);
		
		decimal.addActionListener(this);
		binary.addActionListener(this);
		hexadecimal.addActionListener(this);
		octal.addActionListener(this);
		
		ba.addActionListener(this);
		bb.addActionListener(this);
		bc.addActionListener(this);
		bd.addActionListener(this);
		be.addActionListener(this);
		bf.addActionListener(this);
		
		
		
	}
	

	@Override
	public void actionPerformed(ActionEvent a) {
		
		
		Object source = a.getSource();
		if(source==decimal) {
			way=0;
			decimal.setForeground(Color.green);
			binary.setForeground(Color.white);
			hexadecimal.setForeground(Color.white);
			octal.setForeground(Color.white);
			bmin.setForeground(Color.white);
			bper.setForeground(Color.white);
			bdec.setForeground(Color.white);
			b9.setForeground(Color.white);
			b8.setForeground(Color.white);
			b1.setForeground(Color.white);
			b2.setForeground(Color.white);
			b3.setForeground(Color.white);
			b4.setForeground(Color.white);
			b5.setForeground(Color.white);
			b6.setForeground(Color.white);
			b7.setForeground(Color.white);
			ba.setVisible(false);
			bb.setVisible(false);
			bc.setVisible(false);
			bd.setVisible(false);
			be.setVisible(false);
			bf.setVisible(false);
			
		}
		if(source==binary) {
			way=2;
			binary.setForeground(Color.green);
			decimal.setForeground(Color.white);
			hexadecimal.setForeground(Color.white);
			octal.setForeground(Color.white);
			bmin.setForeground(Color.red);
			bper.setForeground(Color.red);
			bdec.setForeground(Color.red);
			b9.setForeground(Color.red);
			b8.setForeground(Color.red);
			b9.setForeground(Color.red);
			b8.setForeground(Color.red);
			b1.setForeground(Color.white);
			b2.setForeground(Color.red);
			b3.setForeground(Color.red);
			b4.setForeground(Color.red);
			b5.setForeground(Color.red);
			b6.setForeground(Color.red);
			b7.setForeground(Color.red);
			ba.setVisible(false);
			bb.setVisible(false);
			bc.setVisible(false);
			bd.setVisible(false);
			be.setVisible(false);
			bf.setVisible(false);
			
		}
		if(source==hexadecimal) {
			way=1;
			binary.setForeground(Color.white);
			decimal.setForeground(Color.white);
			hexadecimal.setForeground(Color.green);
			octal.setForeground(Color.white);
			bmin.setForeground(Color.white);
			bper.setForeground(Color.red);
			bdec.setForeground(Color.red);
			b9.setForeground(Color.white);
			b8.setForeground(Color.white);
			b9.setForeground(Color.white);
			b8.setForeground(Color.white);
			b1.setForeground(Color.white);
			b2.setForeground(Color.white);
			b3.setForeground(Color.white);
			b4.setForeground(Color.white);
			b5.setForeground(Color.white);
			b6.setForeground(Color.white);
			b7.setForeground(Color.white);
			ba.setVisible(true);
			bb.setVisible(true);
			bc.setVisible(true);
			bd.setVisible(true);
			be.setVisible(true);
			bf.setVisible(true);
		}
		if(source==octal) {
			way=3;
			binary.setForeground(Color.white);
			decimal.setForeground(Color.white);
			hexadecimal.setForeground(Color.white);
			octal.setForeground(Color.green);
			b9.setForeground(Color.red);
			b8.setForeground(Color.red);
			bdec.setForeground(Color.red);
			b9.setForeground(Color.white);
			b8.setForeground(Color.white);
			b1.setForeground(Color.white);
			b2.setForeground(Color.white);
			b3.setForeground(Color.white);
			b4.setForeground(Color.white);
			b5.setForeground(Color.white);
			b6.setForeground(Color.white);
			b7.setForeground(Color.white);
			ba.setVisible(false);
			bb.setVisible(false);
			bc.setVisible(false);
			bd.setVisible(false);
			be.setVisible(false);
			bf.setVisible(false);
		}
		
		if(way==0) {
		if(source==bdec)
			textfield.setText(textfield.getText().concat("."));
		if(source==bmin) {
			if(minplus==0) {
				textfield.setText(""+"-");
				minplus=1;
			}
			else {
				textfield.setText("");	
				minplus=0;
			}
		}
		if(source == bclr) {
			textfield.setText("");
		}
		if(source == badd) {
			n1=Double.parseDouble(textfield.getText());
			operator=1;
			minplus=0;
			textfield.setText("");
		}
		if(source==bsub)
		{
			n1=Double.parseDouble(textfield.getText());
			operator=2;
			minplus=0;
			textfield.setText("");
		}
		
		if(source==bmul)
		{
			n1=Double.parseDouble(textfield.getText());
			operator=3;
			minplus=0;
			textfield.setText("");
		}
		
		if(source==bdiv)
		{
			n1=Double.parseDouble(textfield.getText());
			operator=4;
			minplus=0;
			textfield.setText("");
		}
		if(source==bper) {
			if(minplus==1) {
				minplus=0;
				textfield.setText("ERROR");
			}
			else {
			n1=Double.parseDouble(textfield.getText())/100;
			textfield.setText(""+n1);
			}
		}
		
		if(source==beq) {
			n2=Double.parseDouble(textfield.getText());
			switch(operator) {
			case 1:
				result=n1+n2;
				break;
				
			case 2: result=n1-n2;
				break;

			case 3: result=n1*n2;
				break;

			case 4: result=n1/n2;
				break;
			

			default: result=0;
			}
			minplus=0;
			if((result-(int)result)==0) {
				resultNonDecimal = (int)result;
				textfield.setText(""+resultNonDecimal);
			}
			else {
				textfield.setText(""+result);
			};
		}
		if(source==b1) 
			textfield.setText(textfield.getText().concat("1"));
		if(source==b2) 
			textfield.setText(textfield.getText().concat("2")); 
		if(source==b3) 
			textfield.setText(textfield.getText().concat("3"));
		if(source==b4) 
			textfield.setText(textfield.getText().concat("4"));
		if(source==b5) 
			textfield.setText(textfield.getText().concat("5"));
		if(source==b6) 
			textfield.setText(textfield.getText().concat("6"));
		if(source==b7) 
			textfield.setText(textfield.getText().concat("7"));
		if(source==b8) 
			textfield.setText(textfield.getText().concat("8"));
		if(source==b9) 
			textfield.setText(textfield.getText().concat("9"));
		if(source==b0) 
			textfield.setText(textfield.getText().concat("0"));

		}
		if(way==2) {
			if(source==b1) 
				textfield.setText(textfield.getText().concat("1"));
			if(source==b0) 
				textfield.setText(textfield.getText().concat("0"));
			if(source == badd) {
				nu1=Integer.parseInt(textfield.getText(),2);
				operator=1;
				textfield.setText("");
			}
			if(source==bsub)
			{
				nu1=Integer.parseInt(textfield.getText(),2);
				operator=2;
				textfield.setText("");
			}
			if(source==bmul)
			{
				nu1=Integer.parseInt(textfield.getText(),2);
				operator=3;
				textfield.setText("");
			}
			if(source==bdiv)
			{
				nu1=Integer.parseInt(textfield.getText(),2);
				operator=4;
				textfield.setText("");
			}
			if(source == bclr) {
				textfield.setText("");
			}
			
			if(source==beq) {
				nu2=Integer.parseInt(textfield.getText(),2);
				switch(operator) {
				case 1:
					resultBin=nu1+nu2;
					break;
				case 2: 
					resultBin=nu1-nu2;
					break;	
				case 3: 
					resultBin=nu1*nu2;
					break;
				case 4: 
					resultBin=nu1/nu2;
					break;
				
				}
				textfield.setText(Integer.toBinaryString(resultBin));
			}
		}
		if(way==1) {
			
			if(source==ba) 
				textfield.setText(textfield.getText().concat("A"));
			if(source==bb) 
				textfield.setText(textfield.getText().concat("B"));
			if(source==bc) 
				textfield.setText(textfield.getText().concat("C")); 
			if(source==bd) 
				textfield.setText(textfield.getText().concat("D"));
			if(source==be) 
				textfield.setText(textfield.getText().concat("E"));
			if(source==bf) 
				textfield.setText(textfield.getText().concat("F"));
			if(source==b1) 
				textfield.setText(textfield.getText().concat("1"));
			if(source==b0) 
				textfield.setText(textfield.getText().concat("0"));
			if(source==b2) 
				textfield.setText(textfield.getText().concat("2")); 
			if(source==b3) 
				textfield.setText(textfield.getText().concat("3"));
			if(source==b4) 
				textfield.setText(textfield.getText().concat("4"));
			if(source==b5) 
				textfield.setText(textfield.getText().concat("5"));
			if(source==b6) 
				textfield.setText(textfield.getText().concat("6"));
			if(source==b7) 
				textfield.setText(textfield.getText().concat("7"));
			if(source==b8) 
				textfield.setText(textfield.getText().concat("8"));
			if(source==b9) 
				textfield.setText(textfield.getText().concat("9"));
			if(source == badd) {
				num=textfield.getText();
				nu1=Integer.parseInt(num, 16);
				operator=1;
				minplus=0;
				textfield.setText("");
			}
			if(source==bsub)
			{
				num=textfield.getText();
				nu1=Integer.parseInt(num, 16);
				operator=2;
				minplus=0;
				textfield.setText("");
			}
			if(source==bmul)
			{
				num=textfield.getText();
				nu1=Integer.parseInt(num, 16);
				operator=3;
				minplus=0;
				textfield.setText("");
			}
			if(source==bdiv)
			{
				num=textfield.getText();
				nu1=Integer.parseInt(num, 16);
				operator=4;
				minplus=0;
				textfield.setText("");
			}
			if(source == bclr) {
				textfield.setText("");
			}
			if(source==bmin) {
				if(minplus==0) {
					textfield.setText(""+"-");
					minplus=1;
				}
				else {
					textfield.setText("");	
					minplus=0;
				}
			}
			
			if(source==beq) {
				num2=textfield.getText();
				nu2=Integer.parseInt(num2, 16);
				switch(operator) {
				case 1:
					resultBin=nu1+nu2;
					break;
				case 2: 
					resultBin=nu1-nu2;
					break;	
				case 3: 
					resultBin=nu1*nu2;
					break;
				case 4: 
					resultBin=nu1/nu2;
					break;
				
				}
				minplus=0;
				textfield.setText(Integer.toHexString(resultBin));
			}
		}
		if(way==3) {
			if(source==b1) 
				textfield.setText(textfield.getText().concat("1"));
			if(source==b0) 
				textfield.setText(textfield.getText().concat("0"));
			if(source==b2) 
				textfield.setText(textfield.getText().concat("2")); 
			if(source==b3) 
				textfield.setText(textfield.getText().concat("3"));
			if(source==b4) 
				textfield.setText(textfield.getText().concat("4"));
			if(source==b5) 
				textfield.setText(textfield.getText().concat("5"));
			if(source==b6) 
				textfield.setText(textfield.getText().concat("6"));
			if(source==b7) 
				textfield.setText(textfield.getText().concat("7"));
			if(source == badd) {
				nu1=Integer.parseInt(textfield.getText());
				operator=1;

				textfield.setText("");
			}
			if(source==bsub)
			{
				nu1=Integer.parseInt(textfield.getText(),8);
				operator=2;

				textfield.setText("");
			}
			if(source==bmul)
			{
				nu1=Integer.parseInt(textfield.getText(),8);
				operator=3;

				textfield.setText("");
			}
			if(source==bdiv)
			{
				nu1=Integer.parseInt(textfield.getText(),8);
				operator=4;

				textfield.setText("");
			}
			if(source == bclr) {
				textfield.setText("");
			}
			if(source==bper) {
				if(minplus==1) {
					textfield.setText("ERROR");
				}
				else {
				n1=Double.parseDouble(textfield.getText())/100;
				textfield.setText(""+n1);
				}
			}
			if(source==beq) {
				nu2=Integer.parseInt(textfield.getText());
				switch(operator) {
				case 1:
					resultBin=nu1+nu2;
					break;
				case 2: 
					resultBin=nu1-nu2;
					break;	
				case 3: 
					resultBin=nu1*nu2;
					break;
				case 4: 
					resultBin=nu1/nu2;
					break;
				
				}

				textfield.setText(Integer.toOctalString(resultBin));
			}
		}
	}
	public static void main(String[] args)
	{
		new Calculator();
	}

}
