import java.awt.*;

public class Autovehicul {
    private String marca;
    private Color culoare;
    private int vitezaCurenta;
    private int treaptaViteza;
    private int vitezaMaxima;
    final float capacitateCilindrica = (float)1.2;
    Sofer sofer;

    public void setMarca(String newMarca) {
        this.marca = newMarca;
    }
    public void setCuloare(Color newColor) {
        this.culoare = newColor;
    }
    public void setVitezaCurenta(int newCurent) {
        this.vitezaCurenta = newCurent;
    }
    public void setTreaptaViteza(int newTreapta) {
        this.treaptaViteza = newTreapta;
    }
    public void setVitezaMaxima(int newMaxim) {
        this.vitezaMaxima = newMaxim;
    }


    public String getMarca() {
        return marca;
    }
    public Color getColor() {
        return culoare;
    }
    public int getVitezaCurenta() {
        return vitezaCurenta;
    }
    public int getTreaptaViteza() {
        return treaptaViteza;
    }
    public int getVitezaMaxima() {
        return vitezaMaxima;
    }

    public int accelerare(int acceleratie, Autovehicul v)
    {
        v.vitezaCurenta = acceleratie + vitezaCurenta;
        if(v.vitezaCurenta > v.vitezaMaxima)
        {
            System.out.println("Ati depasit viteza maxima a masinii!");
            return v.vitezaMaxima;
        }
        System.out.println("După accelerare viteaza, mașinii este: " + v.vitezaCurenta + "km/h");
        return v.vitezaCurenta;
    }

    public int decelerare(int decelerare, Autovehicul v)
    {
        v.vitezaCurenta = vitezaCurenta - decelerare;
        if(v.vitezaCurenta <= 0)
        {
            System.out.println("Ati oprit!");
            return 0;
        }
        System.out.println("După decelerare viteaza, mașinii este: " + v.vitezaCurenta + "km/h");
        return v.vitezaCurenta;
    }

    public int schimbaTreapta(int treapta, Autovehicul v)
    {
        v.treaptaViteza = treapta;
        if(v.treaptaViteza >= 5 || v.treaptaViteza < 1)
        {
            System.out.println("N-am carnet, nu stiu ce se intampla in acest caz, dar ai doar 5 viteze, limiteaza-te la alea.");
            return 1;
        }
        System.out.println("După schimbarea treptei de viteza aceasta este: " + v.treaptaViteza);
        return v.treaptaViteza;
    }

    public int oprire(Autovehicul v)
    {
        v.vitezaCurenta = 0;
        System.out.println("Ati oprit!");
        return v.vitezaCurenta;

    }

    public int oprire(Autovehicul v, int vitezaCurenta)
    {
        v.vitezaCurenta = v.vitezaCurenta - vitezaCurenta;
        System.out.println("Ati oprit!");
        return v.vitezaCurenta;

    }
}

