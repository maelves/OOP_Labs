public class Complex implements Numeric{
    private int parteReala;
    private int parteImaginara;

    public Complex(int parteReala, int parteImaginara) {
        this.parteReala = parteReala;
        this.parteImaginara = parteImaginara;
    }

    @Override
    public void adunare(Numeric x) {
        if(x instanceof Complex)
        {
            this.parteReala = ((Complex) x).parteReala + this.parteReala;
            this.parteImaginara = ((Complex) x).parteImaginara + this.parteImaginara;
        }

    }

    @Override
    public void scadere(Numeric x) {
        if(x instanceof Complex)
        {
            this.parteReala = this.parteReala - ((Complex) x).parteReala;
            this.parteImaginara = this.parteImaginara - ((Complex) x).parteImaginara;
        }

    }

    @Override
    public void inmultire(int x) {
        this.parteReala = x * this.parteReala;
        this.parteImaginara = x * this.parteImaginara;
    }

    @Override
    public String toString() {
        if(parteImaginara > 0)
            return parteReala + " + " + parteImaginara + "i";
        else
        {
            return parteReala + " " + parteImaginara + "i";
        }
    }

    public void produs(Numeric z1, Numeric z2){
        if(z1 instanceof Complex && z2 instanceof Complex) {
            this.parteReala = (((Complex) z1).parteReala * ((Complex) z2).parteReala) - (((Complex) z1).parteImaginara * ((Complex) z2).parteImaginara);

            this.parteImaginara=(((Complex) z1).parteReala * ((Complex) z2).parteImaginara)+(((Complex) z2).parteReala * ((Complex) z1).parteImaginara);
        }

    }
}
