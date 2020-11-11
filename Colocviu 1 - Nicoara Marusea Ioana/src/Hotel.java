import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private List<Angajat> angajati;
    private List<Client> clienti;
    private List<Camera> camere;

    public Hotel() {
        angajati = new ArrayList<>();
        clienti = new ArrayList<>();
        camere = new ArrayList<>();
    }

    public void addClient(Client c)
    {
        clienti.add(c);
    }

    public void addAngajat(Angajat a)
    {
        angajati.add(a);
    }

    public void addACamera(Camera cam)
    {
        camere.add(cam);
    }

    public List<Angajat> sortareClientiserviti()
    {
        int aux = angajati.get(0).getNrClientiServiti();
        List<Angajat> angajatiSortati = new ArrayList<>();

        for(Angajat c : angajati)
        {
            if(c.comparareClientiServiti(aux) == -42)
            {
                angajatiSortati.add(c);
            }
        }

        return angajatiSortati;
    }

    public int nrCamereLibere()
    {
        int count = 0;
        for(Camera cam : camere)
            if(cam.cameraGoala() == true){
                count++;}
        return count;

    }

    public int nrCamereOcupate()
    {

        int count = 0;
        for(Camera cam : camere)
            if(cam.cameraGoala() == true){
                count++;}
        return count;
    }

    public int Factura(Client c, Camera cam, int discount)
    {
        if(cam.getCapacitate() > 1)
            return cam.pretDeAchitat(cam.getPretPerNoapte(), c.nrNoptiSejur(), discount);
        return cam.pretDeAchitat(cam.getPretRegimSingle(), c.nrNoptiSejur(), discount);
    }

}
