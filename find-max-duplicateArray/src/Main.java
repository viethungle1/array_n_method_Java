import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] arr = {{1,2,3},{4,5,6},{7,100,9}};
        int max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j]>max) {
                    max = arr[i][j];
                }
            }
        }
        System.out.print("Giá trị lớn nhất trong mảng 2 chiều là: "+max);
    }
}
