package ProjektGUI;
import java.util.Iterator;

public class Storage
implements Iterable<Balon>{ 
    private final int rozmiar = 99; //rozmiar storage
    private int ilosc = 0; // ilosc jaka moze pomiescic
    private Balon[] tab = new Balon[rozmiar]; // tworze tablice obiektow

    public void dodaj(Balon balon)
    { // dodaje balon do tablicy balonow
        tab[ilosc++] = balon;
    }

    public int ilosc()
    {
        return ilosc;
    }

    public Balon get(int id)
    {
        return tab[id];
    }
    public Iterator<Balon> iterator()
    {
        // Iterator from Back
        return new Iterator<Balon>()
        {
            int ilosc = 0;

            @Override
            public boolean hasNext()
            {
                return ilosc <  Storage.this.ilosc;
            }

            @Override
            public Balon next()
            {
                return tab[ilosc++];
            }
        };
    }

}
