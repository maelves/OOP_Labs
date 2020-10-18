import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.trim;

public class NameInverter {
    public static void main(String []args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        name = Alter(name);
        System.out.println(name);
    }

    public static String Alter(String name) {
        if(name.isBlank())
            return name;
        if(!name.contains(" "))
            return name;
        else{
            if(name.startsWith(" ") && name.endsWith(" ")) {
                String n = trim(name);
                if(!n.contains(" "))
                    return n;
                else
                    {
                        String[] splitedName = n.split(" ");
                        name = splitedName[1] + ", " + splitedName[0];
                        return name;
                    }
            }
            else
            {
                String[] splitedName = name.split(" ");
                if (name.startsWith("Mr.") || name.startsWith("Mrs."))
                {
                    if(name.contains("Phd.")) {
                        name = splitedName[3] + ", " + splitedName[2] + " " + splitedName[0] + " " + splitedName[1];
                    }
                    else
                    {
                        name = splitedName[2] + ", " + splitedName[1] + " " + splitedName[0];
                    }
                }
                else
                {
                    name = splitedName[1] + ", " + splitedName[0];
                }
                return name;
            }
        }
    }
}
