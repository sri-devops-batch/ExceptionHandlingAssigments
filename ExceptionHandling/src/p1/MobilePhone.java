package p1;

import java.util.*;
public class MobilePhone {
public static final int Max_Memory_Space =300;
public static void main(String[] args) {
	MobilePhone ap=new MobilePhone();
	ap.appRunner(null);
		
}
public void appRunner(App app)
{
	int a;
	int minimumMemory=0;
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the app name which you want to execute");
	String appName=sc.nextLine();
try {
System.out.println("Enter minimumMemory:");
minimumMemory = sc.nextInt();

if(minimumMemory<10 || minimumMemory>=300) {
	throw new Exception("Entered minimuMemory is in valid") ;
}
else
	System.out.println("valid minimumMemory:"+minimumMemory);
}
catch(Exception e){
System.out.println("Insufficent Memory:");

}
}
}