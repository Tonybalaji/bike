package week1.day1;



public class phone {
	String mobileBrandName ="Samsung";
	char mobileLogo ='S';
	short noOfMobilePiece =14;
	int modelNumber =1726783;
	long mobileImeiNumber =7893778938286878L;
	float mobilePrice =15000.4F;
	boolean isDamaged = false;
	
public static void main(String[] args) 
{
    phone mobile=new phone();
    
	System.out.println("Brand name=" +mobile.mobileBrandName);
	System.out.println("Mobile LOGO=" +mobile.mobileLogo);
	System.out.println("Num Of Mobile Piece=" +mobile.noOfMobilePiece);
	System.out.println("Model Number=" +mobile.modelNumber);
	System.out.println("Mobile IMEI Number=" +mobile.mobileImeiNumber);
	System.out.println("Mobile Price=" +mobile.mobilePrice);
	System.out.println("Is Damaged=" +mobile.isDamaged);


}
}
