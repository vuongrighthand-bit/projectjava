import java.util.Scanner;

public class bai2ss4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap so hang : ");
        int rows = sc.nextInt();
        System.out.print("nhap so cot  : ");
        int cols = sc.nextInt();
        int[][] arr = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Nhập phần tử tại [" + i + "][" + j + "]: ");
                arr[i][j] = sc.nextInt();
            }
        }
        int tongchan = 0;
        int tongle = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (arr[i][j] % 2 == 0) {
                    tongchan += arr[i][j];
                } else {
                    tongle += arr[i][j];
                }
            }
        }
        System.out.println("\n===== KẾT QUẢ =====");
        System.out.println("Tổng các số chẵn: " + tongchan);
        System.out.println("Tổng các số lẻ: " + tongle);
        sc.close();
    }
}
