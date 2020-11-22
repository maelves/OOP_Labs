public class Student implements Cloneable {
    private String nume;
    private String prenume;
    private Masina masina;

    public Student(String nume, String prenume, Masina masina) {
        this.nume = nume;
        this.prenume = prenume;
        this.masina = masina;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public void setMasina(Masina masina) {
        this.masina = masina;
    }

    public String getNume() {
        return nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public Masina getMasina() {
        return masina;
    }

    @Override
    public String toString() {
        return "Studentul " + nume + " " + prenume + " conduce masina " + masina;
    }

    public Object cloneShallow() throws CloneNotSupportedException {
        return super.clone();
    }

    public Object deepClone() throws CloneNotSupportedException {
        Student stud = (Student) super.clone();
        stud.masina = (Masina) stud.masina.clone();
        return stud;
    }
}
