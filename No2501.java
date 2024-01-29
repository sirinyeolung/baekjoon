package baekjoon09;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class No2501 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		sc.close();
		List<Integer> factorArr = new ArrayList<Integer>();
		int factor = 1;
		
		while(factor <= n) {
			if((n % factor) == 0) factorArr.add(factor);
			factor++;
		}
		if(factorArr.size() < k) {
			System.out.println(0);
		} else {
			System.out.println(factorArr.get(k-1));
		}
		

	}

}
