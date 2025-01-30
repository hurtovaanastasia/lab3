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
            array[i] = random.nextInt(100);
        }
        System.out.println("Array before sorting: " + Arrays.toString(array));
        int count = 0;
        for (int i : array) {
            if (i % 2 == 0) {
                count++;
            }
        }
        int[] sortir = new int[count];
        int index = 0;
        for (int num : array) {
            if (num % 2 == 0) {
                sortir[index++] = num;
            }
        }
        insertionSort(sortir);
        System.out.println("Array after sorting: " + Arrays.toString(sortir));
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




