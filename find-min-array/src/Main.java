import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập độ dài của mảng: ");
        final int SIZE = scanner.nextInt();
        int[] array = new int[SIZE];
        for (int i = 0; i < SIZE; i++) {
            System.out.print("Nhập phần tử thứ " + i+ " của mảng ");
            int number = scanner.nextInt();
            array[i] = number;
        }
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i]<min) {
                min = array[i];
            }
        }
        System.out.print("Giá trị nhỏ nhất của mảng là: " + min);
    }
}