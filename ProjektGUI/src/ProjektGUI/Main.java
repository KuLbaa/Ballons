package ProjektGUI;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;


public class Main
    extends Frame {
	
    
	static Storage storage; 
    static Storage dowypuszczenia;
    static int w = 840; // szerokosc okienka
    static int h = 640; //wysokosc okienka
    static int licznik = 98; // zmienna informacyjna


    public static void main(String[] args)
    {

        storage = new Storage();
        dowypuszczenia = new Storage();
        new Main();

        Thread fabryka = new Fabryka(Colors.lime, storage, dowypuszczenia, h);
        Thread fabryka1 = new Fabryka(Colors.grey, storage, dowypuszczenia, h);
        Thread fabryka2 = new Fabryka(Colors.yellow, storage, dowypuszczenia, h);
        fabryka.start();
        fabryka1.start();
        fabryka2.start();
    }

    public Main() {
    	
        this.setSize(w, h);
        this.setVisible(true);
        this.setBackground(new Color(65, 105, 180));

        new Thread(
                ()-> 
                {
                	
                        while (true) 
                        {
                        	
                            repaint();
                            try 
                            {
                            
                                Thread.sleep(500);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                }
        ).start();
    }

    public void paint(Graphics g) 
    {
       
        if(licznik > 0 && dowypuszczenia.ilosc() > 1) 
        { //
            licznik--;
        }
        if(licznik<98) 
        {
        	System.out.println(licznik);
        }
        for (int i = dowypuszczenia.ilosc() - 1; i >= licznik; i--) //wypuszcza balon i przesuwa wypuszczone juz balony
        {
            int wysokosc = dowypuszczenia.get(i).getY(); //dostaje aktualna wysokosc balona
            int pom = wysokosc - 2; // zmniejsza y
            dowypuszczenia.get(i).setY(pom); //ustawia pozycje y na pom
            dowypuszczenia.get(i).Rysuj(g); // rysuje balon

        }
    }
}
