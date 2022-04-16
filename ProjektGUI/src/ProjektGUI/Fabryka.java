package ProjektGUI;


public class Fabryka
	extends Thread{


private int y;
Colors color;
static boolean q ; //zmienna pomocnicza aby tylko jededn balon naraz by³ pepisywany do tablicy dowypuszczenia

static Storage storage;
static Storage dowypuszczenia;

public Fabryka(Colors color, Storage storage, Storage dowypuszczenia, int y) {
    this.color = color;
    this.y = y;
    this.storage = storage;
    this.dowypuszczenia = dowypuszczenia;
    this.q = true;
}


public void run()
{
        try 
        {
                while (true) 
                {
                    if (storage.ilosc() >= 99) { // jezeli osiagnie limit 99 balonow
                        synchronized (this) 
                        {
                            if(q) 
                            {
                                q = false;
                                for (Balon balon : storage) { // dla kazdego obiektu typu Balon ze storage przypisz do dowypuszczenia
                                    dowypuszczenia.dodaj(balon);
                                }
                            }
                            this.wait();
                        }
                    }
                    storage.dodaj(new Balon (color, y - 100));
                    System.out.println("watek: " + color + " , " + "nr balonu: " + storage.ilosc());
                    Thread.sleep(50);//Thread.sleep((int) (Math.random() *5000+3000));
                }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
}

}
