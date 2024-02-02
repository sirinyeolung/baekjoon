package baekjoon09;

import java.util.Scanner;

public class No11653 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int divisor = 2;
//		
//		while(n >= 0) {
//			
//			if((n % divisor) == 0) {
//				n = n / divisor;
//				System.out.println(divisor);
//				if(n <= 1) break;
//			} else {
//				divisor++;
//			}
//		}
		
		int sqrtN = (int) Math.sqrt(n);

		while (divisor <= sqrtN) {
		    if (n % divisor == 0) {
		        System.out.println(divisor);
		        n = n / divisor;
		    } else {
		        divisor++;
		    }
		}
		if (n > 1) {
		    System.out.println(n);
		}
	}
}
