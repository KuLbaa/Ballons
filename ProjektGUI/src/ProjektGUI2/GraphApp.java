package ProjektGUI2;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.*;

public class GraphApp extends JFrame {
	

	int x=1;
	int y=(int) Math.pow(x,2);
	int ax,by;
	String polynomial;
	JTextField textfield;

	public GraphApp(){ 
		textfield = new JTextField();
		textfield.setBounds(700, 50, 150, 30);
		add(textfield);
		setTitle("Graph App");
		setSize(900,700);
		
		setLayout(null); 		
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		x = 30; 
		y = 300;
		
		
		
	}
	
	
	public void paint(Graphics g){
		g.setColor(Color.BLACK);
		g.drawString("Y", 305, 60);
		g.drawString("Y", 305, 600);
		g.drawString("X", 50, 314);
		g.drawString("X", 595, 314);
		g.drawString("Center(0,0)", 310, 314);
		g.drawLine(300, 50, 300, 600);
		g.drawLine(50,300,600,300);
	   }
	public void run() {
		try {
			Thread.sleep(10);
			
			if(x<600&&y>30&&y!=600){
				
				 ax = x-300;
				 by = y-300;
			      ax++;
				
			      by=ax*ax/500; // parabola 
				x=300+ax;
				y=300-by;
			}
			
		}catch (Exception e) {
			System.out.println("Error");
		}
	}


	public static void main(String[] args){
		new GraphApp();
		

	}
}

