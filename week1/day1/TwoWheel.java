package week1.day1;

public class TwoWheel {
	int noOfWheels =4;
	short noOfMirrors =2;
	long chassisNumber =98765432101343L;
	boolean isPunctured =true;
	String bikename = "pulsar";
	double runningKM = 23.87;
public static void main(String[] args) {
	TwoWheel bike = new TwoWheel();
	System.out.println("no of wheels=" +bike.noOfWheels);
	System.out.println("no of mirror=" +bike.noOfMirrors);
	System.out.println("chassis number=" +bike.chassisNumber);
	System.out.println("Tyre is punctured="+bike.isPunctured);
	System.out.println("Bike name=" +bike.bikename);
	System.out.println("runningKm=" +bike.runningKM);

}
