import java.awt.*;

public class Masina  implements Cloneable {
    private String marca;
    private Color culoare;

    public Masina(String marca, Color culoare) {
        this.marca = marca;
        this.culoare = culoare;
    }

    public String getMarca() {
        return marca;
    }

    public Color getCuloare() {
        return culoare;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setCuloare(Color culoare) {
        this.culoare = culoare;
    }

    public void vopsire(Color culoare){
        this.culoare = culoare;
    }

    @Override
    public String toString() {
        return "Marca masinii " +  marca +  " si culoarea " + culoare;
    }

    protected Masina clone() {
        try {
            Masina m = (Masina)super.clone();
            return m;
        }
        catch(CloneNotSupportedException e){
            return null;
        }
    }

}
