public class Clasa {
    public String s;

    public Clasa(String s) {
    }

    public static void g() throws Exception1{
        throw new Exception1("FUNCTIE G");
    }
    public static void f() throws Exception2{
        try {
            g();
        }
        catch(Exception1 e) {
            throw new Exception2("FUNCTIE F");
        }
    }
}
