
import java.lang.String;
import java.lang.System;
import java.util.*;
import java.util.Random;

public class Mainn {


    public static void main(String[] args) {

PreluareNume();

    }


    static void PreluareNume() {


        Scanner scan = new Scanner(System.in);
        //Decide the number of employees
        System.out.print("Introdu numarul angajatilor de saptamana asta : ");
        int numOfFriends = Integer.parseInt(scan.nextLine());


        //Create a string array to store the names of your employees
        String[] arrayOfNames = new String[numOfFriends];
        for (int i = 0; i < arrayOfNames.length; i++) {
            System.out.print("Introdu numele angajatilor, urmat de enter  " + (i + 1) + " : ");
            arrayOfNames[i] = scan.nextLine();
        }
        //Now show your employee's name one by one
        for (int i = 0; i < arrayOfNames.length; i++) {
            int OreMunca = 78;
            System.out.print("Nume angajati " + (i + 1) + " : ");
            System.out.print(arrayOfNames[i] + "\n");

        }

    }

    static void GenerareRandom() {

        Random rand = new Random();
        int rand_int1 = rand.nextInt(7);
        System.out.println(rand_int1);

    }


    static void stepbystep() {

        Scanner scan = new Scanner(System.in);

        int numOfFriends = Integer.parseInt(scan.nextLine());

        int[] arrayOfNames = new int[numOfFriends];


    }


    public class HashMapPutExample {


    }
}

