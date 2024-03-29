package ExceptionsAndErrorHandling;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _03_EnterNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        List<Integer> numberList = new ArrayList<>();
        int startNumber=1;
        int endNumber=100;

        while (numberList.size()!=10) {
            try{
            int currentNumber = checkIfNumber(input);
            if (numberInRange(currentNumber,startNumber,endNumber)){
                numberList.add(currentNumber);
                if (numberList.size()==10){
                    break;
                }
                startNumber=currentNumber;

                input= scanner.nextLine();
            }

            }catch (IllegalArgumentException e){
                System.out.println(e.getMessage());
            input= scanner.nextLine();
            }

            }

//todo printing
        for (int i = 0; i < 9; i++) {
            System.out.print(numberList.get(i)+", ");
        }
        System.out.println(numberList.get(9));
    }

    private static boolean numberInRange(int currentNumber,int start, int end) {
         if( currentNumber>start && currentNumber<end){
            return true;
        }else throw new IllegalArgumentException(String.format("Your number is not in range %d - 100!",start));
    }

    private static int checkIfNumber(String input) {
        try {
            return Integer.parseInt(input);

        } catch (Exception e) {
            throw new IllegalArgumentException("Invalid Number!");
        }

    }
}

