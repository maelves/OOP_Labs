public class Client extends Persoana {
    private int nrCamera;
    private String dataCheckIn; //dd.mm.yyyy
    private String dataCheckOut; //dd.mm.yyy

    public Client(int id, String nume, String nrTelefon, int nrCamera, String dataCheckIn, String dataCheckOut) {
        this.id = id;
        this.nume = nume;
        this.nrTelefon = nrTelefon;
        this.nrCamera = nrCamera;
        this.dataCheckIn = dataCheckIn;
        this.dataCheckOut = dataCheckOut;
    }

    public int getNrCamera() {
        return nrCamera;
    }

    public String getDataCheckIn() {
        return dataCheckIn;
    }

    public String getDataCheckOut() {
        return dataCheckOut;
    }

    public void setNrCamera(int nrCamera) {
        this.nrCamera = nrCamera;
    }

    public void setDataCheckIn(String dataCheckIn) {
        this.dataCheckIn = dataCheckIn;
    }

    public void setDataCheckOut(String dataCheckOut) {
        this.dataCheckOut = dataCheckOut;
    }

    public int nrNoptiSejur()
    {
        /*char[] yearDataIn = new char[4];
        char[] yearDataOut = new char[4];
        dataCheckIn.getChars(6, 9, yearDataIn, 0);
        dataCheckOut.getChars(6, 9, yearDataOut, 0);

        char[] monthDataIn = new char[4];
        char[] monthDataOut = new char[4];
        dataCheckIn.getChars(6, 9, yearDataIn, 0);
        dataCheckOut.getChars(6, 9, yearDataOut, 0);

        char[] dayDataIn = new char[4];
        char[] dayDataOut = new char[4];
        dataCheckIn.getChars(6, 9, yearDataIn, 0);
        dataCheckOut.getChars(6, 9, yearDataOut, 0);*/
        return  1;
    }

    @Override
    protected String toSring() {
        return String.format("Clientul: " + nume + " cu numarul de telefon: " + nrTelefon + "este cazat in camera cu numarul: " + nrCamera + " data de check-in: " + dataCheckIn + " si data de check-out: " + dataCheckOut );
    }

    public final void printClient() {
        System.out.println(toString());
    }
}
