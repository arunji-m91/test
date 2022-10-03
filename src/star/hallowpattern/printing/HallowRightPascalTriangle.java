package star.hallowpattern.printing;

public class HallowRightPascalTriangle {
public static void main(String[] args) {
	
	for(int i=1;i<4;i++) {
		for(int j=i;j<=4;j++) {
			System.out.print(" ");
		}
		for(int j=1;j<=i;j++) {
			if(i==j||j==1) {
			System.out.print("*");
		}
			else {
				System.out.print(" ");
			}
		}
		System.out.println();

	}

	for(int i=1;i<=4;i++) {
		for(int j=1;j<=i;j++) {
			System.out.print(" ");
		}
		for(int j=i;j<=4;j++) {
			if(i==j||j==4) {
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




