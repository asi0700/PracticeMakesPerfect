package tasks;

import java.util.Arrays;

public class ArrayEvenNumbers {

    public static void main(String[] args) {
        int[] array = {1, 2, 4, 6, 5, 7, 11, 14, 16,};

        int[] result = arrayEven(array);

        System.out.println("массив из четных чисел");
        for (int  num : result){
            System.out.print(num + ", ");
        }
    }
    
    public  static  int[] arrayEven(int[] array) {
//        int evenCount = 0;
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] % 2 == 0) {
//                evenCount++;
//            }
//        }
//
//        int[] evenArray = new int[evenCount];
//
//        int index = 0;
//        for (int i =0; i < array.length; i++) {
//            if (array[i] % 2 == 0) {
//                evenArray[index] = array[i];
//                index++;
//            }
//        }
//
//        return evenArray;

        return Arrays.stream(array)
                .filter(n -> n % 2 == 0)
                .toArray();
    }

}
