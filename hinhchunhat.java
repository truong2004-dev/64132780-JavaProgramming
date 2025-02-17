package lad1;
import java.util.Scanner;
public class hinhchunhat {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Nhập cạnh thứ nhất của hình chữ nhật: ");
	        double side1 = scanner.nextDouble();	       
	        System.out.print("Nhập cạnh thứ hai của hình chữ nhật: ");
	        double side2 = scanner.nextDouble();
	        double perimeter = 2 * (side1 + side2);
	        double area = side1 * side2;
	        double minSide = Math.min(side1, side2);
	        System.out.println("\nThông tin hình chữ nhật:");
	        System.out.println("Chu vi: " + perimeter);
	        System.out.println("Diện tích: " + area);
	        System.out.println("Cạnh nhỏ nhất: " + minSide);
	        scanner.close();
	    }
	}

