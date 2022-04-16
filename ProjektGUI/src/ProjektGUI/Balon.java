package ProjektGUI;

import java.awt.*;

import javax.swing.ImageIcon;

public class Balon 
{

	private ImageIcon imageIcon; //tworze zmienna ktora przechowuje obrazek
    private Colors color;
    private int x, y; // x i y obrazka

    public Balon(Colors color, int y){
        this.x = (int)(Math.random() *750-100);
        this.y = y;
        this.color = color;
        
        this.imageIcon = new ImageIcon(color + ".png"); // przypisuje obrazek do zmiennej na podstawie koloru
    }

    public int getY(){
        return y;
    }

    public void setY(int y){
        this.y = y;
    }

    public Colors getColor(){
        return color;
    }

    public void Rysuj(Graphics g){
    	g.drawImage(imageIcon.getImage(),x,y,null ); // wyswietla obrazek przypisany wczesniej
    }

}
