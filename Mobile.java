package week1.day1;

//AccessSpecifier Class className
public class Mobile {
	
	//AccessSpecifier returntype methodName
	public void makeCall() {
		System.out.println("Please dial the number");
	}

	public void sendSMS() {
		System.out.println("Hai dude");
	}
	
	public static void main(String[] args) {
		//ClassName object = new ClassName
		Mobile myMobile = new Mobile();
		//object.methodName
		myMobile.makeCall();
		myMobile.sendSMS();
	}
}


