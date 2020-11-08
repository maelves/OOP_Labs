import java.util.ArrayList;
import java.util.List;

public class Ghiozdan {
    private List<Rechizita> rechizite;

    public Ghiozdan() {
        rechizite = new ArrayList<>();
    }

    public void add(Rechizita rechizita) {
        rechizite.add(rechizita);
    }

    public void addCaiet(Caiet c)
    {
        rechizite.add(c);
    }

    public void addManual(Manual m)
    {
        rechizite.add(m);
    }

    public void listItems() {
        for(Rechizita rechizita : rechizite) {
            System.out.println(rechizita.getNume());
        }
    }

    public void listManual()
    {
        for(Rechizita rechizita : rechizite) {
            if(rechizita instanceof  Manual)
             System.out.println(rechizita.getNume());
        }
    }

    public void listCaiet()
    {
        for(Rechizita rechizita : rechizite) {
            if(rechizita instanceof Caiet)
                System.out.println(rechizita.getNume());
        }
    }

    public int getNrRechizite(){
        return rechizite.size();
    }

    public int getNrCaiete(){
        int count = 0;
        for(Rechizita rechizita : rechizite) {
            if (rechizita instanceof Caiet)
                count++;
        }
        return count;
    }

    public int getNrManuale(){
        int count = 0;
        for(Rechizita rechizita : rechizite) {
            if (rechizita instanceof Manual)
                count++;
        }
        return count;
    }
}
