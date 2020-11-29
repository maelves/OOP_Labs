public class B extends  A {
    @Override
    public void exA(String msg) throws RuntimeException{
        throw new RuntimeException(msg);
    }
}
