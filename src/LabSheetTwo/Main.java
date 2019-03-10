package LabSheetTwo;

/**
 * @author Callum Anderson
 * @version 1.0
 */

public class Main {

    /*
    Output varying results of rolling dices and triangle numbers given parameters. Using loops and random.
     */

    private static void rollDiceTenTimes(){

        for(int i = 0; i < 10; i++){

            int result = (int)(6 * Math.random() + 1);
            System.out.println(result);

        }

    }

    private static void rollTillTwenty(){

        int result;

        do{

            result = (int)(20 * Math.random() + 1);
            System.out.println(result);

        }while(result != 20);

    }

    private static void fiftyTriangularNumbers(){

        int result = 0;

        for(int i = 0; i <= 50; i++){

            result = result + i;
            System.out.println(result);

        }

    }

    private static void evenTriangularNumbers(){

        int result = 0;
        int counter = 0;

        do{

            result = result + counter;
            counter++;

            if(result % 2 == 0){

                System.out.println(result);

            }

        }while(counter + result < 2000);

    }

    public static void main(String[] args) {

        rollDiceTenTimes();

        rollTillTwenty();

        fiftyTriangularNumbers();

        evenTriangularNumbers();

    }

}
