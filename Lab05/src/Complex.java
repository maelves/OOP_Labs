public class Complex {

    private int parteReala;

    private int parteImaginara;




    public Complex(int pReala, int pImaginara){

        this.parteReala = pReala;

        this.parteImaginara = pImaginara;

    }




    public int getParteReala() {

        return parteReala;

    }

    public int getParteImaginara() {

        return parteImaginara;

    }




    public void setParteReala(int pReala) {

        this.parteReala = pReala;

    }

    public void setParteImaginara(int pImaginara) {

        this.parteImaginara = pImaginara;

    }




    public void suma(Complex z){

        this.parteReala += z.parteReala;

        this.parteImaginara += z.parteImaginara;

    }




    public void diferenta(Complex z){

        this.parteReala -= z.parteReala;

        this.parteImaginara -= z.parteImaginara;

    }




    public void produs(Complex z1, Complex z2){

        this.parteReala = (z1.parteReala * z2.parteReala) - (z1.parteImaginara * z2.parteImaginara);

        this.parteImaginara=(z1.parteReala * z2.parteImaginara)+(z2.parteReala * z1.parteImaginara);

    }




    public void scalar(int a){

        this.parteReala *= a;

        this.parteImaginara *= a;

    }




    @Override

    public String toString() {

        String str = "" + parteReala;

        if(parteImaginara > 0)

            return str + " + " + parteImaginara + "i";

        else

            return str + parteImaginara + "i";

    }

}