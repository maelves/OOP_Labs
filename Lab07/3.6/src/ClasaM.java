public class ClasaM extends Clasa implements InterfataM {

    public ClasaM(String s, float nr) {
        super(s, nr);
    }

    @Override
    public void metodaM41() {
    }

    @Override
    public void metoda11() {
    }

    @Override
    public void metoda12() {
    }

    @Override
    public void metoda21() {
    }

    @Override
    public void metoda22() {
    }

    @Override
    public void metoda31() {
    }

    @Override
    public void metoda32() {
    }

    public void m1(Interfata1 o) {
        o.metoda11();
        o.metoda12();
    }

    public void m2(Interfata2 o) {
        o.metoda21();
        o.metoda22();
    }

    public void m3(Interfata3 o) {
        o.metoda31();
        o.metoda32();
    }

    public void m4(InterfataM o) {
        o.metodaM41();
    }
}
