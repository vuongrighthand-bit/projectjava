import java.util.ArrayList;
import java.util.Scanner;

public class bai4ss4 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // Nhập số phần tử
            System.out.print("Nhập số phần tử của mảng: ");
            int n = sc.nextInt();

            if (n <= 0) {
                System.out.println("Mảng không có phần tử");
                return; // kết thúc chương trình
            }

            int[] arr = new int[n];

            // Nhập giá trị cho mảng
            for (int i = 0; i < n; i++) {
                System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
                arr[i] = sc.nextInt();
            }

            // Tách số chẵn và số lẻ, giữ nguyên thứ tự
            ArrayList<Integer> chan = new ArrayList<>();
            ArrayList<Integer> le = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                if (arr[i] % 2 == 0) {
                    chan.add(arr[i]);
                } else {
                    le.add(arr[i]);
                }
            }

            // Ghép lại: chẵn trước, lẻ sau
            int index = 0;
            for (int x : chan) {
                arr[index++] = x;
            }
            for (int x : le) {
                arr[index++] = x;
            }

            // In kết quả
            System.out.println("\nMảng sau khi sắp xếp (chẵn trước, lẻ sau):");
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }

            sc.close();
        }
    }


