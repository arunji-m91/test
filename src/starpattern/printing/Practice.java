package starpattern.printing;

public class Practice {

	public static void main(String[] args) {

		String out = drawRightTriange(8, "0");
		System.out.println(out); 
		
		String matches ="       0\n" + 
				"      00\n" + 
				"     0 0\n" + 
				"    0  0\n" + 
				"   0   0\n" + 
				"  0    0\n" + 
				" 0     0\n" + 
				"00000000";
		System.out.println(out.equals(matches)); //equals , ==

	}

	public static String drawRightTriange(Integer n, String charToPrint) {
		StringBuilder sb = new StringBuilder();
		//String
		for (int i = 1; i <= n; i++) {
			for (int j = i; j <= n - 1; j++) {
				sb.append(" ");
				// System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				if (j == 1 || j == i || i == n) {
					sb.append(charToPrint);
					// System.out.print("*");
				} else {
					// System.out.print(" ");
					sb.append(" ");
				}
			}
			// System.out.println();
			if (i != n) {
				sb.append("\n");
			}
		}
		return sb.toString();
		
	}

}
