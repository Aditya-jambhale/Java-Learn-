import java.util.Arrays;
import java.util.Scanner;
public class passingvalue {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9};
        System.out.println("Existing array: " + Arrays.toString(arr));
        change(arr);
        System.out.println("New array: " + Arrays.toString(arr));
        


    }
    static void change(int[] arr) {
        Scanner  scanner = new Scanner(System.in);
        System.out.print("Enter the number to be changed:");
        int num=scanner.nextInt();
        arr[0]=num;
    }

}
