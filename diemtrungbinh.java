package lad1;
import java.util.Scanner;
public class diemtrungbinh {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập họ và tên sinh viên: ");
        String fullName = scanner.nextLine();
        System.out.print("Nhập điểm trung bình: ");
        double averageScore = scanner.nextDouble();
        System.out.println("\nThông tin sinh viên:");
        System.out.println("Họ và tên: " + fullName);
        System.out.println("Điểm trung bình: " + averageScore);
        scanner.close();
}
}
