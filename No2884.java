package baekjoon04;

import java.util.Scanner;

public class No2884 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int m = sc.nextInt();
		sc.close();
		
		if(m >= 45) {
			m = m - 45;
		} else {
			h = h -1;
			if(h < 0) {
				h = 23;
			}
			m = 60 + m -45;
		}
		
		System.out.println(h + " " + m);
	}

}
