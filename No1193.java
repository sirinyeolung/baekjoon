package solution;

import java.util.Scanner;

public class No1193 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		
		int line = 0;
		int line_seq = 0;
		int cnt = 0;
		
		while(cnt < x) {
			line++;
			line_seq = 0;
			
			for(int i = 0; i<line; i++) {
				cnt++;
				line_seq++;
				if(cnt == x) {
					break;
				}
			}
		}
		System.out.println(line + "라인" + line_seq +"번");
		int first = 0;
		int last = 0;
		
		for(int i = 0; i < line_seq; i++) {
			if(line % 2 == 0) {
				first = 1 + i;
				last = line - i;
			} else {
				first = line - i;
				last = 1 + i;
			}
		}
		
		System.out.print(first + "/" + last);
	}

}
