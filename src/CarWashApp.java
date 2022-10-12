import java.util.Scanner;

public class CarWashApp {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to our Car Wash! ");
        System.out.println("Enter the package code: ");

        String s = sc.next();
        char p = s.charAt(0);

        String details = switch (p)
        {
            case 'A', 'a' -> packageA();
            case 'B', 'b' -> packageB();
            case 'C', 'c' -> packageC();
            case 'D', 'd' -> packageD();
            default -> "There is no such package!";
        };

        System.out.println("\nThis package includes: \n");
        System.out.println(details);
    }
        public static String packageA() {
            return "\tJust a wash.\n";
        }

        public static String packageB() {
            return "\tWash and vacuum.\n";
        }

        public static String packageC() {
            return "\tWash, vacuum and hand dry.\n";
        }

        public static String packageD() {
            return "\tWash, vacuum, hand dry and vax..\n";
        }

    }


