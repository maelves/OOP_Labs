import java.util.*;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        List<Persona> persoane = new ArrayList<>();

        Scanner scan = new Scanner(System.in);
        System.out.println("Introduceti nr de persoane: ");
        int nr = scan.nextInt();
        String n = new String();
        String p = new String();
        int v;
        Persona pers;

        for (int i = 0; i < nr; i++) {
            System.out.println("Persoana " + i + ": ");
            System.out.println("Nume: ");
            scan.nextLine();
            n = scan.nextLine();
            System.out.println("Prenume: ");
            p = scan.nextLine();
            System.out.println("varsta: ");
            v = scan.nextInt();
            pers = new Persona(n, p, v);
            persoane.add(pers);
        }

        for (Persona pe : persoane) {
            System.out.println(pe.toString());
        }
        persoane.sort(Persona::compareToNume);

        System.out.println("Persoane sortate după nume: ");
        for (Persona pe : persoane) {
            System.out.println(pe.toString());
        }
        persoane.sort(Persona::compareToPrenume);

        System.out.println("Persoane sortate după prenume: ");
        for (Persona pe : persoane) {
            System.out.println(pe.toString());
        }

        persoane.sort(Persona::compareToVarsta);

        System.out.println("Persoane sortate după varsta: ");
        for (Persona pe : persoane) {
            System.out.println(pe.toString());
        }

    }
}
