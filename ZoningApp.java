package lab3;
import java.util.Scanner;

public class ZoningApp {
	
	static double legnth;
	static double width;
	
	public static void main(String[]args) {
		Scanner in=new Scanner(System.in);
		
		Zoning value1 = new Zoning();
        System.out.println(value1.toString()+ "\n");

        
        System.out.print("Enter the legnth value ");
        legnth = in.nextDouble();
        System.out.print("Enter the  width value: ");
        width = in.nextDouble();

        //change object and output
     
        value1.setLegnth(legnth);
        value1.setWidth(width);
        
        System.out.println("Updated area ");
        value1.calculate();
        value1.heightLimit();
        value1.unitCountLimit();
        System.out.println(value1.toString()+ "\n");
        in.close();
		
		
		
	}

	

}
