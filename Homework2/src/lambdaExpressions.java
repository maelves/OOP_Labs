import java.util.*;

public class lambdaExpressions {

    public static void main(String[] args){
        List<String> list = new ArrayList<>();
        list.add("PASARE");
        list.add("iac");
        list.add("sarpe");
        list.add("iepure");
        list.add("caine");
        list.add("albatros");

        StringBuilder ex1 = new StringBuilder();
        list.forEach(s -> ex1.append(s.charAt(0)));
        System.out.println("ex1:");
        System.out.println(ex1);

        System.out.println("\nex2:");
        list.removeIf(s -> s.length() % 2 != 0);
        list.forEach(s -> {
            System.out.println(s);
        });

        System.out.println("\nex3:");
        list.forEach(s -> {
            s = s.toUpperCase();
            System.out.println(s);
        });

        System.out.println("\nex4:");
        Map<String, String> mapSS = new HashMap<String, String>();
        mapSS.put("Raluca", "Manole");
        mapSS.put("Petru", "Pop");
        mapSS.put("Maria", "Ionescu");
        mapSS.put("Alex", "Marinescu");
        StringBuilder ex4 = new StringBuilder();
        mapSS.forEach((key, value) -> ex4.append(key).append(value));
        System.out.println(ex4);

        System.out.println("\nex5:");
        List<String> list2 = new ArrayList<>();
        list.add("defectuos");
        list.forEach(l -> list2.add(l.toLowerCase()));
        System.out.println(list2);

        System.out.println("\nex6:");
        list2.removeIf(l -> l.length() % 2 == 0);
        System.out.println(list2);

        System.out.println("\nex7:");
        list.add("stabil");
        list.add("negru");
        list.add("ascuns");
        list.add("frig");
        System.out.println(list);
        StringBuilder ex7 = new StringBuilder();

        System.out.println("\nex8:");

        System.out.println("\nex9:");

        System.out.println("\nex10:");

        System.out.println("\nex11:");

        System.out.println("\nex12:");

        System.out.println("\nex13:");
    }
}
