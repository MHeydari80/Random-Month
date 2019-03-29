package random.month;

import java.util.Random;

public class RandomMonth {

    public static void main(String[] args) {

        Random random = new Random();
        int randomNumber;

        while (true) {

            randomNumber = random.nextInt(13);

            if (randomNumber == 0) {

                continue;

            }

            switch (randomNumber) {

                case 1:
                    System.out.println(randomNumber + "\tJanuary");
                    break;
                case 2:
                    System.out.println(randomNumber + "\tFebruary");
                    break;
                case 3:
                    System.out.println(randomNumber + "\tMarch");
                    break;
                case 4:
                    System.out.println(randomNumber + "\tApril");
                    break;
                case 5:
                    System.out.println(randomNumber + "\tMay");
                    break;
                case 6:
                    System.out.println(randomNumber + "\tJune");
                    break;
                case 7:
                    System.out.println(randomNumber + "\tJuly");
                    break;
                case 8:
                    System.out.println(randomNumber + "\tAugust");
                    break;
                case 9:
                    System.out.println(randomNumber + "\tSeptember");
                    break;
                case 10:
                    System.out.println(randomNumber + "\tOcrober");
                    break;
                case 11:
                    System.out.println(randomNumber + "\tNovember");
                    break;
                case 12:
                    System.out.println(randomNumber + "\tDecember");
                    break;

            }

            break;

        }

    }

}
