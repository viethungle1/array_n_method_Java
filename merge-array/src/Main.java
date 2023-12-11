import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] arr1 = {0,1,2,3,4};
        int [] arr2 = {5,6,7,8,9};
        int [] arr = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            arr[i]=arr1[i];
        }
        for (int i = arr1.length; i <arr.length ; i++) {
            arr[i]=arr2[i-arr1.length];
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"\t");
        }
    }
}