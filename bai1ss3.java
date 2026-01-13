import java.util.Scanner;

public class bai1ss3 {


        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // Nhập dữ liệu từ người dùng
            System.out.print("Nhập tên khách hàng: ");
            String tenKhachHang = sc.nextLine();

            System.out.print("Nhập tên sản phẩm: ");
            String tenSanPham = sc.nextLine();

            System.out.print("Nhập giá sản phẩm: ");
            double giaSanPham = sc.nextDouble();

            System.out.print("Nhập số lượng mua: ");
            int soLuong = sc.nextInt();

            System.out.print("Khách có thẻ thành viên không (true/false): ");
            boolean laThanhVien = sc.nextBoolean();

            // Tính toán
            double thanhTien = giaSanPham * soLuong;
            double giamGia = 0;
            if (laThanhVien) {
                giamGia = thanhTien * 0.10; // giảm 10%
            }
            double vat = (thanhTien - giamGia) * 0.08; // VAT 8% trên số tiền sau giảm giá
            double tongThanhToan = thanhTien - giamGia + vat;

            // In kết quả
            System.out.println("\n===== HÓA ĐƠN THANH TOÁN =====");
            System.out.println("Khách hàng: " + tenKhachHang);
            System.out.println("Sản phẩm: " + tenSanPham);
            System.out.println("Số lượng: " + soLuong);
            System.out.println("Đơn giá: " + giaSanPham);
            System.out.println("Thành tiền: " + thanhTien);
            System.out.println("Giảm giá: " + giamGia);
            System.out.println("Tiền VAT (8%): " + vat);
            System.out.println("Tổng thanh toán: " + tongThanhToan);

            sc.close();
        }
    }


