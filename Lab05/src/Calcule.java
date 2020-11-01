public class Calcule {

    public static void main(String[] args){

        Complex z1 = new Complex(4, -4);

        Complex z2 = new Complex(1, 23);

        z1.suma(z2);

        System.out.println("Suma primelor 2 numere este: " + z1.toString());

        Complex z3 = new Complex(1,1);

        z1.diferenta(z3);

        System.out.println("Diferenta este: " + z1.toString());




        Complex z4 = new Complex(2,1);

        Complex z5 = new Complex(1,2);

        Complex rez = new Complex(0,0);

        rez.produs(z4, z5);

        System.out.println("Produsul este: " + rez.toString());




        System.out.println();

        Matrice a = new Matrice(3,3);

        a.afisare();

        a.setValues(1,0, z5);

        System.out.println();

        a.afisare();

        for(int i = 0 ; i < a.linii; i++) {

            for (int j = 0; j < a.coloane; j++)

                a.setValues(i, j, new Complex(1,2));

        }

        System.out.println("\nA este");

        a.afisare();




        Matrice b = new Matrice(3,3);

        for(int i = 0; i < b.linii; i++) {

            for (int j = 0; j < b.coloane; j++)

                b.setValues(i, j, new Complex(1,1));

        }

        System.out.println("\nB este");

        b.afisare();

        a.adunare(b);

        System.out.println("\nSuma A+B este");

        a.afisare();




        a.scadere(b);

        a.scadere(b);

        System.out.println("\nDiferenta A-B este");

        a.afisare();




        a.inmultireScalar(-3);

        System.out.println("\nProdusul cu un scalar al lui A este");

        a.afisare();




        Matrice m1 = new Matrice(3,3);

        Matrice m2 = new Matrice(3,3);







        for(int i = 0; i < m1.linii; i++) {

            for (int j = 0; j < m1.coloane; j++)

                m1.setValues(i, j, new Complex(2,4));

        }

        for(int i = 0; i < m2.linii; i++) {

            for (int j = 0; j < m1.coloane; j++)

                m2.setValues(i, j, new Complex(1,1));

        }




        m1.produsMatrice(m2);

        System.out.println("\nProdusul este: ");

        m1.afisare();

    }

}