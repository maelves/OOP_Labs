public class Matrice {
    private Numeric [][] mat;
    int linii;
    int coloane;

    public Matrice(int n, int m) {
        mat = new Numeric[n][m];
        this.linii = n;
        this.coloane = m;
    }


    public Numeric getValues(int i,int j){

        return mat[i][j];

    }

    public void setValues(int i, int j, Numeric x){

        this.mat[i][j] = x;

    }
    public void adunareMatrice(Matrice a){

        for(int i = 0; i < a.linii ; i++) {

            for (int j = 0; j < a.coloane; j++)

                mat[i][j].adunare(a.getValues(i, j));

        }

    }


    public void scadereMatrice(Matrice a){

        for(int i = 0; i < a.linii; i++) {

            for (int j = 0; j < a.coloane; j++)

                mat[i][j].scadere(a.getValues(i, j));

        }

    }


    public void inmultireScalar(int a){

        for(int i = 0; i < linii; i++) {

            for (int j = 0; j < coloane; j++)

                mat[i][j].inmultire(a);

        }

    }

    public void afisare(){

        for(int i = 0; i < linii; i++) {

            for (int j = 0; j < coloane; j++)

                System.out.print(mat[i][j] + " ");

            System.out.println();

        }

    }

    public Matrice produsMatrice(Matrice a){

        Matrice rez = new Matrice(a.linii, a.coloane);

        for(int i = 0; i < a.linii; i++) {

            for (int j = 0; j < a.coloane; j++)

                rez.setValues(i, j, new Complex(0, 0));

        }

        Complex z1 = new Complex(0, 0);

        Complex z2 = new Complex(0, 0);

        for(int i = 0; i < a.linii; i++) {

            for(int j = 0; j < a.coloane; j++) {

                for(int k = 0; k < a.linii; k++) {

                    z1.produs(a.getValues(i, k), mat[k][j]);

                    z2.adunare(z1);

                }

                rez.setValues(i, j, z2);

            }

        }

        return rez;

    }

}
