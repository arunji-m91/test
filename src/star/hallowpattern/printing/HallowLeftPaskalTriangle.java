package star.hallowpattern.printing;

public class HallowLeftPaskalTriangle {

	public static void main(String[] args) {
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=i;j++) {
				if(j==1||i==j) {
					System.out.print("*");
				}
					else {
						System.out.print(" ");
					}
				}
			System.out.println();
				
			}
		
		for(int i=1;i<=4;i++) {
			for(int j=i;j<=4;j++) {
				if(j==4||i==j) {
					System.out.print("*");
				}
					else {
						System.out.print(" ");
					}
				}
			System.out.println();
				
			}
		}
	}

