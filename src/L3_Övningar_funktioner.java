import java.util.Scanner;
import java.util.concurrent.ExecutionException;

public class L3_Övningar_funktioner {
    public static void main(String[] args) {
        /*greeting();
        System.out.println("Hej");
        greeting("Andreas");
        double area = areaOfRectangle(3.0,4.0);
        System.out.println("Arean är " + area);
        area = areaOfRectangle(8.0,2.0);
        System.out.println("Arean är " + area);
        area = areaOfTriangle(5.0,4.0);
        System.out.println("Arean är " + area);
    }

    static void greeting() {
        System.out.println("Hej David");
    }

    static void greeting(String name) {
        System.out.println("Hej " + name);
    }

    static double areaOfRectangle(double height, double width) {
        double area = height * width;
        return area;
    }

    static double areaOfTriangle (double height, double width)  {
        double area = areaOfRectangle(height, width) / 2;
        return area;

        //Skapa scanner
        Scanner sc = new Scanner(System.in);

        //Läs in från användare
        System.out.println("Skriv in ett ord eller mening:");
        String input = sc.nextLine();


        //Räkna ut
        boolean answer = isPlaindromAlternative(input);

        //Presentera
        if(!answer){
            System.out.println("NEJ! Inget palindrom!");
        } else {
            System.out.println("JA! Ett palindrom!");
        }
    }

    static boolean isPalindrom(String text) {
        StringBuilder builder = new StringBuilder();
        builder.append(text);
        String rText = builder.reverse().toString();
        boolean answer = rText.equals(text);
        return answer;
    }

    static boolean isPlaindromAlternative(String text){
        int lastPos = text.length() - 1;
        for(int i = 0; i < text.length(); i++){
            if(text.charAt(i) != text.charAt(lastPos - i)) {
                return false;
            }
        }
        return true;*/
        boolean exit = false;
        while(!exit) {
            System.out.println("Vad vill du göra?");
            System.out.println("1. Addera två tal");
            System.out.println("2. Räkna bokstäver i en sträng");
            System.out.println("3. Spegelvänd en sträng");
            System.out.println("4. Summera alla tal i en sträng");
            System.out.println("e. Avsluta");
            Scanner sc = new Scanner(System.in);
            String input = sc.nextLine();
            switch (input) {
                case "1": {
                    Sum(sc);
                    break;
                }
                case "2": {
                    Count(sc);
                    break;
                }
                case "3": {
                    Reverse(sc);
                    break;
                }
                case "4": {
                    CountNumbers(sc);
                    break;
                }
                case "e": {
                    exit = true;
                    System.out.println("Hej då!");
                    break;
                }
                default: {
                    break;
                }
            }

        }
    }
    static void Sum(Scanner sc) {
        System.out.print("Första talet: ");
        int firstNumber = sc.nextInt();
        System.out.print("Andra talet: ");
        int secondNumber = sc.nextInt();
        int sum = firstNumber+secondNumber;
        System.out.println("Summan är " + sum);
        System.out.println("");
        sc.nextLine();
    }
    static void Count(Scanner sc) {
        System.out.print("Ange ordet du vill leta i: ");
        String word = sc.nextLine();
        System.out.print("Ange bokstaven du vill leta efter: ");
        char letter = sc.nextLine().charAt(0);
        int count = 0;
        for (int i = 0; i < word.length()-1; i++) {
            if(word.charAt(i) == letter){
                count++;
            }
        }
        System.out.println("Det finns " + count + " " + letter + " i ordet " + word);
        System.out.println("");

    }
    static void Reverse(Scanner sc) {
        System.out.print("Skriv in en sträng: ");
        String word = sc.nextLine();
        char ch;
        String newWord = "";
        for(int i = 0; i < word.length(); i++){
            ch = word.charAt(i);
            newWord = ch + newWord;
        }
        System.out.println(newWord);
        System.out.println("");
    }

    static void CountNumbers(Scanner sc) {
        boolean exit = false;
        String number = "";
        //while(!exit) {
            System.out.print("Skriv in ett antal siffror att summera: ");
                number = sc.nextLine();
                //exit = true;
                //System.out.println("Felaktig input! Ange BARA siffror");

        //}
        System.out.println("Inmatat värde: " + number);
        int sum = 0;
        for (int i = 0; i < number.length(); i++) {
            sum += (int)number.charAt(i);
        }
        System.out.println("Summa: " + sum);
    }
}
