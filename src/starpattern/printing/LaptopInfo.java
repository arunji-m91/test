package starpattern.printing;

public class LaptopInfo {
   public void model() {
	System.out.println("model is Dell");

}
private void storage() {
	System.out.println("storage is 8 Gb RAM");

}
public static void main(String[] args) {
	
	PhoneInfo p=new PhoneInfo();
	LaptopInfo l=new LaptopInfo();
	l.model();
	l.storage();
	p.phoneName();// this mtd from the PhoneInfo Class which is default access modifier(no access modifier).
	              // when the default class having metd is accessible only within the package.
}


}
