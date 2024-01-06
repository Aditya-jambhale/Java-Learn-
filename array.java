//taking the size and values of array from the user and printing them 
import java.util.Scanner;
import java.util.Arrays;
public class array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array:");
        int size = scanner.nextInt();
        System.out.println("The size of Array is:" + size);
        int[] arr =new int[size];
        System.out.print("Enter the index at which the number is to be stored:");
        int index = scanner.nextInt();
        if(index < 0||index>=size)
        {
            System.out.println("Index out of bounds please enter the valid index of numbers");
        }
        else 
        {
            System.out.println("Enter the values to be stored:");
            int  values = scanner.nextInt();
            arr[index] = values;
            System.out.println("Array updated");
            for(int i=0; i<size;i++){
                String valid = String.valueOf(arr[i]);
                System.out.println(valid);
            }
        }
     scanner.close();

    }
}
