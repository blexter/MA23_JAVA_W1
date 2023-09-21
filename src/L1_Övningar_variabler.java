public class L1_Övningar_variabler {
    public static void main(String[] args) {

        // Övning 1
        /*int A = 1;
        double B = 2.4;
        String C = "A";
        Boolean D = false;

        System.out.println("Variabel A, B, C & D: ");
        System.out.println(A + " " + B + " " +  C + " " + D);*/

        //Övning 2
        /*String name;
        int age;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ange ditt namn: ");
        name = sc.next();
        System.out.println("Ange din ålder: ");
        age = sc.nextInt();
        System.out.println(("Du heter: " + name + " och är " + age + "år gammal"));*/

        //Övning 3
        /*double radie;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ange cirkeln radie: ");
        radie = sc.nextDouble();
        double omkrets = (radie + radie) * Math.PI;
        double area = radie * radie * Math.PI;
        System.out.println("Arean är :" + area + " och omkretsen :" + omkrets);*/

        //Övning 4
        /*int age;
        double month;
        double days;
        double minutes;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ange din ålder: ");
        age = sc.nextInt();
        month = age * 12;
        days = month * 31;
        minutes = days * (24*60);
        System.out.println(age);
        System.out.println(month);
        System.out.println(days);
        System.out.println(minutes);*/

        //Övning 5
        /*Boolean loggedIn;
        loggedIn = true;
        System.out.println("Är användaren inloggad? " + loggedIn);*/

        //Övning 6
        /*String text = "En Massa Tecken";

        System.out.println("Längden är: " + text.length());
        System.out.println(text.toUpperCase());
        System.out.println(text.toLowerCase());*/

        //ÖVning 7
        int a = 1;
        double b;

        System.out.println(a);
        b = a;
        System.out.println(b);
        a = (int) b;
        System.out.println(a);
        b = a;
        System.out.println(b);
    }
}
