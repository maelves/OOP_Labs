public class Fractie implements Numeric {
    int numitor;
    int numarator;

    public Fractie(int numarator, int numitor) {
        this.numitor = numitor;
        this.numarator = numarator;
    }

    @Override
    public void adunare(Numeric x) {
        if(x instanceof  Fractie)
        {
            this.numarator = this.numarator * ((Fractie) x).numitor + this.numitor * ((Fractie) x).numarator;
            this.numitor = this.numitor * ((Fractie) x).numitor;
        }

    }

    @Override
    public void scadere(Numeric x) {
        if(x instanceof  Fractie)
        {
            this.numarator = this.numarator * ((Fractie) x).numitor - this.numitor * ((Fractie) x).numarator;
            this.numitor = this.numitor * ((Fractie) x).numitor;
        }

    }

    @Override
    public void inmultire(int x) {
        this.numarator = this.numarator * x;

    }

    @Override
    public String toString() {
        return numarator + "/" + numitor;
    }
}
