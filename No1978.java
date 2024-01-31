package baekjoon09;

import java.util.Scanner;

public class No1978 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int sum = 0;
		
		while(N > 0) {
			int num = sc.nextInt();
			int divisor = 1; 
			int factor = 0;
			
			while(divisor <= num) {
				if(num % divisor == 0) {
					factor += 1;
				}
				divisor++;
			}
			if(factor == 2) {
				sum += 1;
			}
			N--;
		}
		System.out.println(sum);
	}

}
