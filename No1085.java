package baekjooon10;

import java.util.Scanner;

public class No1085 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int w = sc.nextInt();
		int h = sc.nextInt();
		int minX = x;
		int minY = y;	
		
		if(minX > w - x) minX = w - x;
		if(minY > h - y) minY = h - y;
		if(minX < minY) {
			System.out.println(minX);
		} else {
			System.out.println(minY);
		}
		
	}
}
