public class Main {
    public static void main(String[] args) {

        Clasa c = new Clasa("ban");

        try {
            c.f();
        }
        catch(Exception2 e) {
            System.out.println(e.getMessage());
        }
    }

}