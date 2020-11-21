public class Test {
    public static void main(String[] args) {

        Complex z1 = new Complex(4, -4);
        Complex z2 = new Complex(1, 23);
        z1.adunare(z2);
        System.out.println("Suma primelor 2 numere este: " + z1.toString());

        Complex z3 = new Complex(1,1);
        z1.scadere(z3);
        System.out.println("Diferenta este: " + z1.toString());


        Complex z4 = new Complex(2,1);
        z4.inmultire(5);
        System.out.println("Produsul este: " + z4.toString());

        Fractie f1 = new Fractie(1, 2);
        Fractie f2 = new Fractie(1, 3);
        f1.adunare(f2);
        System.out.println("Suma celor 2 fractii este: " + f1.toString());

        Fractie f3 = new Fractie(1, 2);
        f1.scadere(f3);
        System.out.println("Diferenta celor 2 fractii este: " + f1.toString());


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

        Matrice a = new Matrice(3,3);
        a.setValues(1,0, z2);

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

        a.adunareMatrice(b);

        System.out.println("\nSuma A+B este");

        a.afisare();




        a.scadereMatrice(b);

        System.out.println("\nDiferenta A-B este");

        a.afisare();




        a.inmultireScalar(-3);

        System.out.println("\nProdusul cu un scalar al lui A este");

        a.afisare();

    }
}
