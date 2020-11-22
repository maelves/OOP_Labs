public class Persona {
    private String nume;
    private String prenume;
    private int varsta;

    public Persona(String nume, String prenume, int varsta) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
    }

    public String getNume() {
        return nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public static int compareToNume(Persona p1, Persona p2) {
        return p1.getNume().compareTo(p2.getNume());
    }
    public static int compareToPrenume(Persona p1, Persona p2) {
        return p1.getPrenume().compareTo(p2.getPrenume());
    }
    public static int compareToVarsta(Persona p1, Persona p2) {
        return (p1.getVarsta() - p2.getVarsta());
    }

    @Override
    public String toString() {
        return nume  + " " + prenume + " " + varsta + '\n';
    }
}
