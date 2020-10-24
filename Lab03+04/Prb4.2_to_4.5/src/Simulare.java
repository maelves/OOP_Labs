import java.awt.*;
import java.util.Scanner;

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
        v2.getSofer().setNume("Catrina");
        v2.getSofer().setPrenume("Marian");
        v2.getSofer().setVarsta(26);
        v2.getSofer().setNrPermis("212609");
        v2.getTalon().setMarcaModel("Fiat 500");
        v2.getTalon().setPutere(55);
        v2.getTalon().setNrInmatriculare("CJ-01-MMM");
        v2.getTalon().setAnulInmastricularii("2018");
        v2.getTalon().setCombustibil("benzina");
        v2.getAsigurare().setNrAsigurare("213409121");
        v2.getAsigurare().setFirma("Omiasig");
        v2.getAsigurare().setAnEmitere(2020);
        v2.getAsigurare().setAnExpirare(2023);

        System.out.println(v2.getMarca() + " de culoarea " + v2.getColor() + " cu capacitatea cilindrică " + v2.capacitateCilindrica + " \nsi viteza curenta de " + v2.getVitezaCurenta() + " km/h, ea ruland in treapta de viteza " + v2.getTreaptaViteza() + " si cu viteza maxima " + v2.getVitezaMaxima() + " km/h vă stă la dispozitie." +
                "\nAceasta este condusă de catre " + v2.getSofer().getNume() + " " + v2.getSofer().getPrenume() + " varsta de " + v2.getSofer().getVarsta() + " ani si permisul de conducere cu nr. " + v2.getSofer().getNrPermis()
                + "\nTalonul masinii prezinta detalii legate de: numarul de imnatriculare " + v2.getTalon().getNrInmatriculare() + ", combustibilul utilizat: " + v2.getTalon().getCombustibil() + ", puterea motorului: " + v2.getTalon().getPutere() + " si anul primei inmatriculari: " + v2.getTalon().getAnulInmastricularii()
         + "\nAsigurarea se afla in torpedoul masinii, ea a fost incheiata cu firma " + v2.getAsigurare().getFirma() + ", avand numarul de contract: " + v2.getAsigurare().getNrAsigurare());
        v2.getAsigurare().valabilitate(v2.getAsigurare().getAnEmitere(), v2.getAsigurare().getAnExpirare());
    }

}
