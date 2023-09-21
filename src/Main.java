import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double fahrenhiet;

        Scanner sc = new Scanner(System.in);

        System.out.println("Skriv in temperaturen i fahernheit ");
        fahrenhiet = sc.nextDouble();

        double celcius = (fahrenhiet - 32) / 1.8;

        System.out.println("Temperaturen i celcius är: " + celcius);

        if(celcius > 25){
            System.out.println("Det är varmt");
        } else if (celcius < 0){
            System.out.println("Det är kallt");
        } else {
            System.out.println("Det är lagom");
        }

    }
}