public class Matrice {

    Complex[][] mat;
    int linii;
    int coloane;

    public Matrice(int x, int y){
        mat = new Complex[x][y];
        this.linii = x;
        this.coloane = y;
    }

    public Complex[][] getMatrice(){
        return mat;
    }
    public Complex getValues(int i,int j){
        return mat[i][j];
    }
    public void setValues(int i, int j, Complex z){
        this.mat[i][j] = z;
    }

    public void adunare(Matrice a){
        for(int i = 0; i < a.linii ; i++) {
            for (int j = 0; j < a.coloane; j++)
                mat[i][j].suma(a.getValues(i, j));
        }
    }

    public void scadere(Matrice a){
        for(int i = 0; i < a.linii; i++) {
            for (int j = 0; j < a.coloane; j++)
                mat[i][j].diferenta(a.getValues(i, j));
        }
    }

    public void inmultireScalar(int a){
        for(int i = 0; i < linii; i++) {
            for (int j = 0; j < coloane; j++)
                mat[i][j].scalar(a);
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
                    z2.suma(z1);
                }
                rez.setValues(i, j, z2);
            }
        }
        return rez;
    }

    public void afisare(){
        for(int i = 0; i < linii; i++) {
            for (int j = 0; j < coloane; j++)
                System.out.print(mat[i][j] + " ");
            System.out.println();
        }
    }
}


