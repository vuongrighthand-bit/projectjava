import java.util.Scanner;

public class bai4ss2 {x
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhập ba cạnh
        System.out.print("Nhập cạnh a: ");
        int a = sc.nextInt();
        System.out.print("Nhập cạnh b: ");
        int b = sc.nextInt();
        System.out.print("Nhập cạnh c: ");
        int c = sc.nextInt();

        // Kiểm tra tam giác hợp lệ
        if (a + b > c && a + c > b && b + c > a) {
            // Phân loại tam giác
            if (a == b && b == c) {
                System.out.println("Đây là tam giác đều.");
            } else if (a == b || b == c || a == c) {
                System.out.println("Đây là tam giác cân.");
            } else if (a * a == b * b + c * c ||
                    b * b == a * a + c * c ||
                    c * c == a * a + b * b) {
                System.out.println("Đây là tam giác vuông.");
            } else {
                System.out.println("Đây là tam giác thường.");
            }
        } else {
            System.out.println("Ba cạnh không tạo thành tam giác.");
        }

        sc.close();
    }
}


