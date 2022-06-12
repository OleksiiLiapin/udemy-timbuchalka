package timbuchalka.demy.minimumelement;

import java.util.Scanner;

public class MinimumElement {


public static int readInteger(){
    Scanner scanner = new Scanner(System.in);
    return scanner.nextInt();
}


    public static int [] readElements (int countNumbers){
        Scanner scanner = new Scanner(System.in);
        //System.out.println("Enter " + countNumbers + " numbers:");
        int[] arr = new int [countNumbers];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        return arr;
    }

    public static int findMin (int [] arr){
        int min=arr[0];
        for (int i = 0; i < arr.length-1; i++) {
           if (min > arr[i+1]){
               min = arr[i+1];
           }

        }
    return min;
    }

    private static void printArr (int min){
        System.out.println(min);
    }
}
