import java.util.Scanner;

public class ProblemFirst {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t-- > 0) {
			String S = sc.next();
			int count = 0;
			
			for(int i = 0; i < S.length(); i++) {
				if(S.charAt(i)-'0' == 0)continue;
				else {
					
					
					count++;
					i++;
					if(i == S.length()) break;
					while(S.charAt(i)-'0'==1) {i++;
					if(i == S.length()) break;
				}}
					
				
				
			}
			System.out.println(count);
		}
		
		sc.close();
	}

}
