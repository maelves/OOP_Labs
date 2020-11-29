public class C extends B {
    @Override
    public void exA(String msg) throws StringIndexOutOfBoundsException{
        throw new StringIndexOutOfBoundsException(msg);
    }
}
