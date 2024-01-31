package baekjoon09;

import java.util.Scanner;

public class No2581 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();
		int N = sc.nextInt();
		int sumPrime = 0;
		int minPrime = N;
		boolean noPrimes = false;
		
		for(int i = M; i <= N; i++) {
			if(getPrimeNum(i)) {
				sumPrime += i;
				if(i < minPrime) {
					minPrime = i;
				}
			} 
		}
		
		if(sumPrime == 0) {
			System.out.println(-1);
		} else {
			System.out.println(sumPrime);
			System.out.println(minPrime);
		}
	}
	
	public static boolean getPrimeNum(int i) {
		int sum = 0;
		int divisor = 1;
		while(divisor <= i) {
			if(i % divisor == 0) {
				sum += 1;
			}
			divisor++;
		}
		if(sum == 2) {
			return true;
		} else {
			return false;
		}
	}
}
