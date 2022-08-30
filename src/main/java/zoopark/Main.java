package zoopark;

import java.util.Scanner;

//first com
//first commit number two
public class Main extends Fish {
    public static void main(String[] args) {
        Animals tiger = new Animals();
        Animals.getLivingCreatures();
        Fish okyn = new Fish();
        Fish.getLivingCreatures();
        Birds galka = new Birds();
        Birds.getLivingCreatures();

        String[] myArray = new String[9];
        myArray[0] = tiger.getLion();
        myArray[1] = tiger.getCat();
        myArray[2] = tiger.getDog();
        myArray[3] = galka.getSolovey();
        myArray[4] = galka.getStrays();
        myArray[5] = galka.getPetuh();
        myArray[6] = getAkyla();
        myArray[7] = getKit();
        myArray[8] = getOsminog();
        System.out.println("1 - lion\n2 - cat\n3 - dog\n4 - solovey\n5 - straus\n6 - petuh\n7 - akyla\n8 - kit\n9 - osminog");

        System.out.println("Enter the animal number to get detailed information about it (number 0 - exit)");

        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        while (number != 0) {
            if (number >= 1 && number <= 3) {
                System.out.println(myArray[number - 1] + ", breathe " + tiger.getBreathe() + ", move around " + tiger.getMoveAround());
            } else if (number >= 4 && number <= 6) {
                System.out.println(myArray[number - 1] + ", breathe " + galka.getBreathe() + ", move around " + galka.getMoveAround());
            } else if (number >= 7 && number <= 9) {
                System.out.println(myArray[number - 1] + ", breathe " + okyn.getBreathe() + ", move around " + okyn.getMoveAround());
            }
            System.out.println("Enter the animal number to get detailed information about it (number 1 - 9, 0 - exit)");
            number = scan.nextInt();
        }
    }
}