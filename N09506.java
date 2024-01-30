package baekjoon09;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class N09506 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int n = sc.nextInt();
			
			if(n == -1) break;
			
			int factor = 1;
			int sum = 0;
			
			List<Integer> list = new ArrayList<Integer>();
			
			while(factor < n) {
				
				if(n % factor == 0) {
					list.add(factor);
					sum += factor;
				}
				
				factor++;
			}
			
			if(sum == n) {
				System.out.print(n + " = ");

				for(int i = 0; i < list.size(); i++) {
					if(i == (list.size() -1)) {
						System.out.println(list.get(i));
					} else {
						System.out.print(list.get(i) + " + ");
					}
				}
			} else {
				System.out.println(n + " is NOT perfect.");
			}
			
			

			
		}
	}
}
