public class TestGhiozdan {
   public static void main(String[] args) {
       Ghiozdan g = new Ghiozdan();
       Caiet c1 = new Caiet("Teme");
       Caiet c2 = new Caiet("Engleza");
       Caiet c3 = new Caiet("Franceza");
       Caiet c4 = new Caiet("Matematica");
       Caiet c5 = new Caiet("Chimie");
       Manual m1 = new Manual("TIC");
       Manual m2 = new Manual("Matematica");
       Manual m3 = new Manual("Biologie");
       Manual m4 = new Manual("Filosofie");

       g.add(m1);
       g.add(m2);
       g.add(c1);
       g.add(c2);
       g.add(m3);
       g.add(c3);
       g.add(c4);
       g.add(c5);
       g.add(m4);
       System.out.println("Numarul total de rechizite: ");
       System.out.println(g.getNrRechizite());
       System.out.println("Numarul total de caiete: ");
       System.out.println(g.getNrCaiete());
       System.out.println("Numarul total de manuale: ");
       System.out.println(g.getNrManuale());
       System.out.println("\nGhiozdanul tau contine: ");
       g.listItems();
       System.out.println("\ndintre care Manuale: ");
       g.listManual();
       System.out.println("\ndintre care Caiete: ");
       g.listCaiet();
    }
}
