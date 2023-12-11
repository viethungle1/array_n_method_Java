import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];
        for (int i = 0; i < 5; i++) {
            System.out.print("Nhập giá trị cho phần tử thứ "+i+" :");
            int number = scanner.nextInt();
            array[i]= number;
        }

        System.out.print("Nhập số cần chèn: ");
        int number = scanner.nextInt();
        System.out.print("Nhập vị trí cần chèn: ");
        int position = scanner.nextInt();
        for (int i = 5; i>position ; i--) {
            array[i]=array[i-1];
        }
        array[position]=number;
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+"\t");
        }
    }
}