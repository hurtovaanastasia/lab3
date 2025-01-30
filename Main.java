import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Write here number of elements: ");
        int size = input.nextInt();
        int[] array = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            int check = random.nextInt(100);
            if(check % 2 == 0) {
                array[i] = check;
            }
        }
        System.out.println("Array before sorting: " + Arrays.toString(array));
        insertionSort(array);
        System.out.println("Array after sorting even elements: " + Arrays.toString(array));
    }

    public static void insertionSort(int[] sortArr) {
        for (int i = 1; i < sortArr.length; i++) {
            int temp = sortArr[i];
            int j;
            for (j = i; j > 0 && temp < sortArr[j - 1]; j--) {
                sortArr[j] = sortArr[j - 1];
            }
                sortArr[j] = temp;
            }
        }
    }




