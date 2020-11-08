public class Caiet extends  Rechizita{

    public Caiet(String denumireCaiet){
        eticheta = denumireCaiet;
    }

    @Override
    public String getNume() {
        return eticheta + " - caiet";
    }
}
