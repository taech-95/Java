import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        int[] myIntArray = new int[10];
        myIntArray[5] = 15;
        int [] array = {1,2,3,4,5,6,7};
        reverseArray(array);
        int [] myIntegers = getIntegers(5);
        for (int i = 0; i < myIntegers.length; i++) {
            System.out.println("Element "+i+", value is " +myIntegers[i]);
        }
        Arrays.sort(myIntArray);

        System.out.println("Minimum number is " + findMin(readElements(readInteger())));


    }

    public static int [] getIntegers(int number){
        System.out.println("Enter " + number + " integer values.\r");
        int [] values = new int[number];
        for (int i = 0; i <values.length ; i++) {
            values[i] = scanner.nextInt();
        }
        return values;

    }
    public static void printArray(int[] array){
        for (int i = 0; i < array.length ; i++) {
            System.out.println("Element "+i+", value is " +array[i]);
        }
    }

    public static int[] sortIntegers(int[] array){
        int [] sortedArray = new int[array.length];
        for (int i = 0; i < array.length ; i++) {
            sortedArray[i] = array[i];
        }

        boolean flag = true;
        int temp;
        while(flag){
            flag = false;
            for (int i = 0; i < sortedArray.length-1 ; i++) {
                if(sortedArray[i]<sortedArray[i+1]){
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }

    private static void modifyArray(int[] array){
        array[0] = 2;
        array = new int[] {1,2,3,4,5};

    }

    private static int readInteger(){
        System.out.println("Enter how many elements You need to enter.\r");
        return scanner.nextInt();
    }

    private static int [] readElements(int number){
        int [] array = new int[number];
        System.out.println("Provide integer values:\r");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }


    private static int findMin(int[] array){
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length ; i++) {
            if(min>array[i]){
                min = array[i];
            }
        }
        return min;
    }
    private static void reverseArray(int[] array){
        int [] reverseArray = new int[array.length];
        int counter = 0;
        for (int i = array.length-1; i >= 0 ; i--) {
            reverseArray[counter]= array[i];
            counter++;
        }
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(reverseArray));
    }
}
