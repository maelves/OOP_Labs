import java.util.List;

public class Camera {
    private int nrDeIndetificare;
    private int capacitate;
    private int pretPerNoapte;
    private int pretRegimSingle;
    private List<Client> oaspeti;

    public void setNrDeIndetificare(int nrDeIndetificare) {
        this.nrDeIndetificare = nrDeIndetificare;
    }

    public void setCapacitate(int capacitate) {
        this.capacitate = capacitate;
    }

    public void setPretPerNoapte(int pretPerNoapte) {
        this.pretPerNoapte = pretPerNoapte;
    }

    public void setPretRegimSingle(int pretRegimSingle) {
        this.pretRegimSingle = pretRegimSingle;
    }

    public void setOaspeti(List<Client> oaspeti) {
        this.oaspeti = oaspeti;
    }

    public int getNrDeIndetificare() {
        return nrDeIndetificare;
    }

    public int getCapacitate() {
        return capacitate;
    }

    public int getPretPerNoapte() {
        return pretPerNoapte;
    }

    public int getPretRegimSingle() {
        return pretRegimSingle;
    }

    public List<Client> getOaspeti() {
        return oaspeti;
    }

    public Camera(int nrDeIndetificare, int capacitate, int pretPerNoapte) {
        this.nrDeIndetificare = nrDeIndetificare;
        this.capacitate = capacitate;
        if(capacitate > 1)
            this.pretPerNoapte = pretPerNoapte;
        else
            this.pretRegimSingle = pretPerNoapte;
    }

    public int pretDeAchitat(int pretONoapte, int nrNopti, int discount)
    {
        return pretONoapte * nrNopti - discount;
    }

    public boolean cameraPlina(int nrPersoane)
    {
        if(nrPersoane >= capacitate)
            return true;
        return false;
    }

    public boolean cameraGoala()
    {
        if(capacitate == 0)
            return true;
        return false;
    }


}
