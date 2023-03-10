import java.util.Scanner;

public class Rome {
    public static void main(String[] args) {
        String enterNumber; // M CM XC IV 1994
        char[] rome = {'I', 'V', 'X', 'L', 'C', 'D', 'M'};
        int[] arabic = {1, 5, 10, 50, 100, 500, 1000};

        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter the rome number");
            enterNumber = scanner.nextLine();
        } while (enterNumber.length() == 0);

        char[] sArray = enterNumber.toCharArray();
        int [] sArrayForInt = new int [sArray.length];

        for (int i = 0; i < 7; i++) {
            for (int ii = 0; ii < sArray.length; ii++) {
                if (sArray [ii] == rome [i]) {
                    sArrayForInt[ii] = arabic [i];
                }
            }
        }

        int finalInteger = 0;
        for (int i = 0; i <  sArrayForInt.length; i++) {
            if ((sArrayForInt[i] - sArrayForInt[i + 1]) < 0){
                finalInteger = finalInteger + ((sArrayForInt[i] - sArrayForInt[i + 1]) * - 1);
                i++;
            }
            else finalInteger += sArrayForInt[i];
        }
        System.out.println(finalInteger);
    }
}