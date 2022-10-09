package p3;
import java.util.*;
public class MainClass {
public static void main(String args[]) {
	Scanner sc =new Scanner(System.in);
	int hourlyWage=0;
	int idNum=0;
	System.out.println("Enter the idNumber");
	int idNumber=sc.nextInt();
	try {
		System.out.println("Enter hourlyWages:");
		hourlyWage=sc.nextInt();
		if(hourlyWage<6 || hourlyWage>50) {
			throw new EmployeeException("Entered hourly wage is invalid");
			
		}
		else
			System.out.println("valid hourlyWage: "+hourlyWage);
	}
	catch(Exception e) {
		System.out.println("Error "+e.getMessage());
		
	}
}
}
