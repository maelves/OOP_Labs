import java.awt.*;
import java.util.Set;

public class Simulare {
    public static void main(String []args) {
        Autovehicul v1 = new Autovehicul();
        v1.setMarca("Skoda Fabia");
        v1.setCuloare(Color.black);
        v1.setTreaptaViteza(2);
        v1.setVitezaCurenta(50);
        v1.setVitezaMaxima(220);

        System.out.println(v1.getMarca() + " de culoarea " + v1.getColor() + " cu capacitatea cilindrică " + v1.capacitateCilindrica + " si viteza curenta de " + v1.getVitezaCurenta() + " km/h, ea ruland in treapta de viteza " + v1.getTreaptaViteza() + " si cu viteza maxima " + v1.getVitezaMaxima() + " km/h vă stă la dispozitie.");
        v1.schimbaTreapta(3, v1);
        v1.accelerare(30, v1);
        v1.decelerare(10, v1);
        v1.oprire(v1);
        v1.accelerare(30, v1);
        v1.oprire(v1, 30);

        Autovehicul v2 = new Autovehicul();
        v2.setMarca("Fiat 500");
        v2.setCuloare(Color.white);
        v2.setTreaptaViteza(3);
        v2.setVitezaCurenta(30);
        v2.setVitezaMaxima(200);
        v2.sofer.setNume("Catrina");
        v2.sofer.setPrenume("Marian");
        v2.sofer.setVarsta(26);
        v2.sofer.setNrPermis("212609");

        System.out.println(v2.getMarca() + " de culoarea " + v2.getColor() + " cu capacitatea cilindrică " + v2.capacitateCilindrica + " si viteza curenta de " + v2.getVitezaCurenta() + " km/h, ea ruland in treapta de viteza " + v2.getTreaptaViteza() + " si cu viteza maxima " + v2.getVitezaMaxima() + " km/h vă stă la dispozitie. Aceasta este condusă de catre " + v2.sofer.getNume() + " " + v2.sofer.getPrenume() + " varsta de " + v2.sofer.getVarsta() + " ani si permisul de conducere cu nr. " + v2.sofer.getNrPermis());

    }

}
