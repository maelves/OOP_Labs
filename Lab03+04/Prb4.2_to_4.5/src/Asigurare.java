public class Asigurare {
    private String nrAsigurare;
    private String firma;
    private int anEmitere;
    private int anExpirare;

    public void setNrAsigurare(String nrAsigurare) {
        this.nrAsigurare = nrAsigurare;
    }

    public void setFirma(String firma) {
        this.firma = firma;
    }

    public void setAnEmitere(int anEmitere) {
        this.anEmitere = anEmitere;
    }

    public void setAnExpirare(int anExpirare) {
        this.anExpirare = anExpirare;
    }

    public String getNrAsigurare() {
        return nrAsigurare;
    }

    public String getFirma() {
        return firma;
    }

    public int getAnEmitere() {
        return anEmitere;
    }

    public int getAnExpirare() {
        return anExpirare;
    }

    public void valabilitate(int anEmitere, int anExpirare)
    {
        if(anExpirare - anEmitere > 0)
            System.out.println("Asigurare valabilă");
        else
            System.out.println("Asigurare expirată");
    }
}

