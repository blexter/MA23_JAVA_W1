import java.util.Scanner;

public class L2_Övningar_loopar {
    public static void main(String[] args) {

        /*Scanner sc = new Scanner(System.in);
        String again;

        do  {
            System.out.println("Välj en multiplikationstabell: ");
            int choosenNumber = sc.nextInt();
            sc.nextLine();

            for (int i = 0; i <= 10; i++) {
                int answer = i * choosenNumber;
                System.out.println(i + " * " + choosenNumber + " = " + answer);
            }

            System.out.println("Vill du se en tabell till? (j/n) ");
            again = sc.nextLine();
        } while (again.equals("j"));*/

        // Övning 1
        /*Scanner sc = new Scanner(System.in);
        double aln;
        double famn;
        double fot;
        double tum;
        double total;
        System.out.println("Ange längd i Aln: ");
        aln = sc.nextDouble();
        System.out.println("Ange längd i Famn: ");
        famn = sc.nextDouble();
        System.out.println("Ange längd i Fot: ");
        fot = sc.nextDouble();
        System.out.println("Ange längd i Tum: ");
        tum = sc.nextDouble();

        famn *= 178;
        aln *= 59.4;
        fot *= 29.69;
        tum *= 2.54;
        total = famn + aln + fot + tum;

        System.out.println("Total längd: " + total);*/

        // Övning 2
        /*Scanner sc = new Scanner(System.in);
        double sek;
        double eur;
        double usd;
        System.out.println("Ange belopp att konvertera: ");
        sek = sc.nextDouble();
        eur = sek * 0.08396;
        usd = sek * 0.09;
        System.out.println("Värdet i EUR: " + eur);
        System.out.println("Värdet i USD: " + usd);*/

        //Övning 3
        /*Scanner sc = new Scanner(System.in);
        int year;
        System.out.println("Ange årtal: ");
        year = sc.nextInt();
        if((year % 4) == 0){
            System.out.println("Det är ett skottår!");
        }else {
            System.out.println("Det är INTE ett skottår!");
        }*/

        //Övning 4
        /*for (int i = 1; i <= 100; i++) {
            if ((i % 3) == 0) {
                if ((i % 5) == 0) {
                    System.out.println("FizzBuzz");
                } else {
                    System.out.println("Fizz");
                }
            } else {
                if ((i % 5) == 0) {
                    System.out.println("Buzz");
                }
                else {
                    System.out.println(i);
                }
            }
        }*/

        //Övning 5
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Välj svårtighetgrad: (lätt, mellan, svårt)");
        String level = sc.nextLine();
        int guess = 0;
        int cnt = 0;
        int tries = 0;
        if (level.equals("lätt")) {
            cnt = (int)(Math.random() * 10) + 1;
        } else if (level.equals("mellan")) {
            cnt = (int)(Math.random() * 100) + 1;
        } else if (level.equals("svårt")) {
            cnt = (int)(Math.random() * 1000) + 1;
        }


        while (guess != cnt){
            System.out.println("Ange din gissning: ");
            guess = sc.nextInt();

            if(guess > cnt) {
                System.out.println("Gissning för hög!");
            } else if (guess < cnt) {
                System.out.println("Gissning för låg!");
            }
            tries++;

        }
        System.out.println("Du gissade rätt! Antal försök: " + tries);
        */

        //Övning 6
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int j = 2;
        int tmpValue = 0;

        System.out.println("Ange personnummer i siffror: ");
        String pnr = sc.nextLine();
        String regex = "\\d+";
        if(pnr.matches(regex)) {
            if (pnr.length() == 10) {

                for (int i = 0; i < 10; i++) {

                    tmpValue = Integer.valueOf(pnr.substring(i, i + 1)) * j;

                    if (tmpValue > 9) {
                        sum += (tmpValue) - 9;
                    } else {
                        sum += (tmpValue);
                    }

                    if ((i % 2) == 0) {
                        j--;
                    } else {
                        j++;
                    }

                }

            }

            if(sum != 0) {
                if ((sum % 10) == 0) {
                    System.out.println("Korrekt personnummer!");
                } else {
                    System.out.println("Felaktigt personnummer!");
                }
            } else {
                System.out.printf("Felaktigt inmatat personnummer, programmet avbryts.");
            }
        } else {
            System.out.printf("Felaktigt inmatat personnummer, programmet avbryts.");
        }
    }
}