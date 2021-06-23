


public class ContinuousOne {

	public static void main(String[] args) {
		
		String S = "1111";
		int len  = S.length();
		String T = "";
		int x = 0, y = 0;
		for(int i = 0; i < len; i++) {
			if(i%2 == 0) {
				if(S.charAt(i)-'0' == 1) {
					y++;
				}
				else
					x++;
			}
			else {
				if(S.charAt(i)-'0' == 1) {
					x++;
				}
				else
					y++;
			}
		}
		int ans = Math.min(x, y);
		System.out.println(ans);
						
	}
}
