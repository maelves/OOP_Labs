import java.awt.*;

public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Masina masina = new Masina("Audi",Color.yellow);
        Student stud = new Student("Pop","Ioan", masina);

        Student deep = (Student) stud.deepClone();
        Student shallow = (Student) stud.cloneShallow();

        stud.getMasina().vopsire(Color.blue);

        System.out.println(deep);
        System.out.println(shallow);
    }
}
