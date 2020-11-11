public class TestHotel {
    public static void main(String[] args) {
        Client c = new Client(1, "Ionel", "076546251",321,"11.11.2020", "13.11.2020");
        c.printClient();
        Angajat a = new Angajat(2, "Adriana", "083736337", "12.04.2000",2345);
        a.printAngajat();

    }
}
