package baekjoon;

import java.util.Scanner;

public class No3009 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();
		int x3 = sc.nextInt();
		int y3 = sc.nextInt();
		
		if(x1 == x2)System.out.print(x3);
		if(x1 == x3)System.out.print(x2);
		if(x2 == x3)System.out.print(x1);
		System.out.println(" ");
		if(y1 == y2)System.out.print(y3);
		if(y1 == y3)System.out.print(y2);
		if(y2 == y3)System.out.print(y1);
		
		
	}
}
