public class Main {
    public static void main(String[] args) {
        C c = new C();
        try
        {
            c.exA("lvl 3");
        }
        catch (StringIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
        try
        {
            ((A)c).exA("lvl 2");
        }
        catch (IndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
    }
}

