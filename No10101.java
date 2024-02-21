package baekjooon10;

import java.io.*;

public class No10101 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		int c = Integer.parseInt(br.readLine());

		if (a + b + c != 180) {
			System.out.println("Error");
		} else {
			if (a == 60 && b == 60 && c == 60) {
				System.out.println("Equilateral");
			} else if (a != b && b != c && a != c) {
				System.out.println("Scalene");
			} else {
				System.out.println("Isosceles");
			}
		}
	}

}
