public class Test {
    public static void main(String[] args) {
        ClasaM obj = new ClasaM("super", 42);
        obj.m1(new Interfata1() {
            @Override
            public void metoda11() {
                System.out.println("metoda11");
            }

            @Override
            public void metoda12() {
                System.out.println("metoda12");
            }
        });
        System.out.println();
        obj.m2(new Interfata2() {
            @Override
            public void metoda21() {
                System.out.println("metoda21");
            }

            @Override
            public void metoda22() {
                System.out.println("metoda22");
            }
        });
        System.out.println();
        obj.m3(new Interfata3() {
            @Override
            public void metoda31() {
                System.out.println("metoda31");
            }

            @Override
            public void metoda32() {
                System.out.println("metoda32");
            }
        });
        System.out.println();
        obj.m4(new InterfataM() {
            @Override
            public void metodaM41() {
                System.out.println("metodaM41");
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
        });
    }
}
