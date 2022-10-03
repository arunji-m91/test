package star.hallowpattern.printing;

public class HallowDiomandPattern {

	public static void main(String[] args) {
		
		String out = diomandHallowPattern(8,"&");
		
		System.out.println(out);
		System.out.println(out.equals("7"));
		

	}

	public static String diomandHallowPattern(Integer n, String charToPrint)
	{
		StringBuilder sb= new StringBuilder();
	for(int i=1;i<=n;i++) {
		for(int j=i;j<=n-1;j++) {
			sb.append(" ");
			//System.out.print(" ");
		}
		for(int j=1;j<=i;j++) {
			if(j==1) {
				sb.append(charToPrint);
			//System.out.print("*");
		}
			else {
				sb.append(" ");
				//System.out.print(" ");
				}
		}
		
	     for(int j=1;j<=i;j++) {
	    	 if(i==j) {
	    	sb.append(charToPrint);	 
		//System.out.print("*");
	     }
	    	 else {
	    		 sb.append(" ");
	    		 //System.out.print(" ");
	    		 }
	     }
	     sb.append("\n");
	     if(i!=n) {
	    	 sb.append("\n");
	     }
		//System.out.println();
	}
		
	for(int i=2;i<=n;i++) {
		for(int j=1;j<i;j++) {
			sb.append(" ");
			//System.out.print(" ");
		}
		for(int j=i;j<=n;j++) {
			if(i==j) {
				sb.append(charToPrint);
			//System.out.print("*");
		}
			else {
				sb.append(" ");
				//System.out.print(" ");}
		}
		}
		for(int j=i;j<n;j++) {
			
		sb.append(" ");
			//System.out.print(" ");
		}
		for(int j=1;j<=i;j++) {
			if(j==1) {
				
		sb.append(charToPrint);
			//System.out.print("*");
		}
			else {
				sb.append(" ");
				//System.out.print(" ");
			}
		}
		sb.append("\n");
		if(i!=n) {
			sb.append("\n");
		}
		//System.out.println();
		
	}
	
	return sb.toString();
}
}
