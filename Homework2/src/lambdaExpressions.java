import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class lambdaExpressions {

    public static Optional<Integer> palindrom(int nr)
    {
        int pali = 0, c;
        int copy = nr;
        while(nr != 0 ) {
            c = nr % 10;
            pali = pali * 10 + c;
            nr /= 10;
        }

        if (copy == pali)
            return Optional.of(pali);
        else
            return Optional.empty();
    }

    public static void ex10(){
        System.out.println("\nex10:");
        List<Employee> list4 = new ArrayList<>();

        Employee e1 = new Employee("Maria", 23, (double) 2300.90);
        Employee e2 = new Employee("Richard", 26, (double) 4500.22);
        Employee e3 = new Employee("Bobi", 30, (double) 6000.12);

        list4.add(e1);
        list4.add(e2);
        list4.add(e3);

        System.out.println(list4.stream().mapToDouble(Employee::getSalary).sum() / list4.size());
    }

    public static void ex11(){
    System.out.println("\nex11:");
    ArrayList<String> s1 = new ArrayList<String>() {{
        add("Math");
        add("History");
        add("POO");
        add("Music");
    }};

    ArrayList<String> s2 = new ArrayList<String>() {{
        add("Math");
        add("History");
        add("POO");

    }};

    ArrayList<String> s3 = new ArrayList<String>() {{
        add("Math");
        add("History");
        add("POO");
        add("Music");
        add("Drawing");
    }};

    ArrayList<Student> students = new ArrayList<Student>()
    {
        {
            add(new Student("Ted",(double)7.3, s1));
            add(new Student("Jacob",(double) 8.9, s2));
            add(new Student("Dan",(double)10, s3 ));
        }
    };
        Map<String, Integer> numOfCourses = students.stream().collect(Collectors.toMap(Student::getName, s -> s.getCourses().size()));
        System.out.println(numOfCourses.toString());
    }

    public static void ex12() {
        System.out.println("\nex12:");
        List<Car> list6 = new ArrayList<>();
        list6.add(new Car("Ford", 2020, "Copper", 21000));
        list6.add(new Car("Tesla", 2020, "Dark Blue", 42000));
        list6.add(new Car("Volvo", 2019, "Light Gray", 32000));

        list6.sort(Car::compareTo);
        System.out.println(list6.stream().map(Car::getBrand).collect(Collectors.toList()));
    }

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
        list.forEach(s -> System.out.println(s));

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
        //System.out.println(list);
        String ex7 = IntStream.range(1, 4).mapToObj(list :: get).collect(Collectors.joining("-"));
        System.out.println(ex7);

        System.out.println("\nex8:");
        IntStream.iterate(1, n -> n*2).limit(10).forEach(System.out::println);

        System.out.println("\nex9:");
        List<Integer> list3 = new ArrayList<>();
        list3.add(11);
        list3.add(20);
        list3.add(1331);
        list3.add(49);
        list3.add(545567);

        int k = (int) list3.stream().filter(s -> palindrom(Integer.valueOf(s)).isPresent()).count();
        System.out.println(k);

        ex10();

        ex11();

        ex12();

        System.out.println("\nex13:");
        int limit = 20;

        Stream<long[]> stream = Stream.iterate(new long[]{0, 1}, number -> new long[]{number[1], number[0] + number[1]});
        System.out.println(stream.limit(limit).mapToLong(number -> number[0]).sum());
    }
}
