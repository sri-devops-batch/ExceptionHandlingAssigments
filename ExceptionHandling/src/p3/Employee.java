package p3;

public class Employee {
private String IdNumber;
private String hourlyWage;
public Employee() {
	super();
}
public Employee(String idNumber, String hourlyWage) {
	super();
	IdNumber = idNumber;
	this.hourlyWage = hourlyWage;
}
public String getIdNumber() {
	return IdNumber;
}
public void setIdNumber(String idNumber) {
	IdNumber = idNumber;
}
public String getHourlyWage() {
	return hourlyWage;
}
public void setHourlyWage(String hourlyWage) {
	this.hourlyWage = hourlyWage;
}


}
