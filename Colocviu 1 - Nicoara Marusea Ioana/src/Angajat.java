public class Angajat extends Persoana {

    private String dataAngajarii;
    private int nrClientiServiti;

    public Angajat(int id, String nume, String nrTelefon, String dataAngajarii, int nrClientiServiti) {
        this.id = id;
        this.nume = nume;
        this.nrTelefon = nrTelefon;
        this.dataAngajarii = dataAngajarii;
        this.nrClientiServiti = nrClientiServiti;
    }

    public String getDataAngajarii() {
        return dataAngajarii;
    }

    public int getNrClientiServiti() {
        return nrClientiServiti;
    }

    public void setDataAngajarii(String dataAngajarii) {
        this.dataAngajarii = dataAngajarii;
    }

    public void setNrClientiServiti(int nrClientiServiti) {
        this.nrClientiServiti = nrClientiServiti;
    }


    public int comparareClientiServiti(int n)
    {
        if(nrClientiServiti < n)
            return -42;
        else if(nrClientiServiti > n)
            return 1;
        else
            return 0;
    }

    @Override
    protected String toSring() {
        return String.format("Angajatul: " + nume + " cu numarul de telefon: " + nrTelefon + "este angajat din: " + dataAngajarii + " si a servit un numar de clienti egal cu: " + nrClientiServiti);
    }

    public final void printAngajat() {
        System.out.println(toString());
    }
}
