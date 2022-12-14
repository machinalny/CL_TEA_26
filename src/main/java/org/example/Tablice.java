package org.example;

import java.util.Arrays;
import java.util.Random;

public class Tablice {

    public static void create50elementArray() {
        //stwórz 50-elementową tablicę o nazwie mainTab z kolejnymi liczbami całkowitymi od 0 do 49,
        int[] mainTab = new int[50];
        for (int i = 0; i < 50; i++) {
            mainTab[i] = i;
        }
//        String result = "";
        int counter = 0;
        for (int j = 0; j < 50; j++) {
            int value = mainTab[j];
            if (value < 10) {
                System.out.print("0" + value + ", ");
//                result = result + "0" + value + ", ";
            } else {
                System.out.print(value + ", ");
//                result = result + value + ", ";
            }
            counter++;
            if (counter > 9) {
                //                result = result + "\n";
                System.out.println();
                counter = 0;
            }
        }

//        System.out.println(result);
    }

    public static void create50ElementArray2(){

        int[] mainTab = new int[50];
        for(int i = 0; i < 50; i++){
            mainTab[i] = i;
        }

        for (int j = 0; j < mainTab.length; j++){
            if (j < 10){
                System.out.print("0");
            }

            System.out.print(mainTab[j] + ", ");

            if ((j + 1) % 10 == 0){
                System.out.println();
            }

        }

    }

    public static void randomNumbersArray() {
        int[] randNumbers = new int[20];

        for (int i = 0; i < 20; i++) {
            randNumbers[i] = new Random().nextInt(101);
        }

        int minimum = 101;

        for (int randNumber : randNumbers) {
            if (randNumber < minimum) {
                minimum = randNumber;
            }
        }

        System.out.println(Arrays.toString(randNumbers));
        System.out.println(minimum);

    }

    public static void randomNumbersArray2() {
        int[] randNumbers = new int[20];

        for (int i = 0; i < 20; i++) {
            randNumbers[i] = new Random().nextInt(101);
        }

        System.out.println(Arrays.toString(randNumbers));

        Arrays.sort(randNumbers);

        System.out.println(randNumbers[0]);

    }

}
