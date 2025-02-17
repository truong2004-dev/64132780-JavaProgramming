package lad1;
import java.util.Scanner;
public class khoilapphuong {
	public static void main(String[] args) {   
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập cạnh của khối lập phương: ");
        double side = scanner.nextDouble();
        double volume = Math.pow(side, 3);
        System.out.println("\nThông tin khối lập phương:");
        System.out.println("Thể tích: " + volume);
        scanner.close();
    }
}
