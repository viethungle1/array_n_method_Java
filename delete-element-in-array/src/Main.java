import java.util.Formattable;
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
        System.out.print("Nhập giá trị cần xóa: ");
        int a = scanner.nextInt();
        for (int i = position(array,a); i <array.length-1 ; i++) {
            array[i]=array[i+1];
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+"\t");
        }
    }
    public static int position(int[] arr,int index) {
        int pos=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == index) {
                pos = i;
            }
        }
        return pos;
    }
}