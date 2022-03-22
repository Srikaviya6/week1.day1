package week1.day1;

public class MobileIntegers {
	
	//Global variables
	String mobileModel = "SamsungM";
	float mobileWeight = 20.1f;
	boolean isFullyCharged = true;
	int mobileCost = 25000;
	
	public void mobileSpec() {
		
		//Local variables
		mobileWeight = 30.3f;
		System.out.println("Mobile spec");
		System.out.println(mobileModel);
		System.out.println(mobileWeight);
		System.out.println(isFullyCharged);
	}
	
	public void mobileDetails() {
		boolean isFullyCharged = false;
		
		System.out.println("Mobile Details");
		System.out.println(mobileWeight);
		System.out.println(isFullyCharged);
		System.out.println(mobileCost);
	}

	public static void main(String[] args) {
		MobileIntegers mbl = new MobileIntegers();
		mbl.mobileSpec();
		System.out.println(mbl.mobileModel);
		
	} 
}
