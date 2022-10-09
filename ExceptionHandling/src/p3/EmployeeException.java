package p3;

public class EmployeeException extends Exception{
private int empId;
private int payRate;
public EmployeeException(int empId, int payRate) {
	super();
	this.empId = empId;
	this.payRate = payRate;
}
public int getEmpId() {
	return empId;
}
public void setEmpId(int empId) {
	this.empId = empId;
}
public int getPayRate() {
	return payRate;
}
public void setPayRate(int payRate) {
	this.payRate = payRate;
}
@Override
public String toString() {
	return "EmployeeException[emoId="+empId+",payRate="+payRate+"]";
}
public EmployeeException(String message){
super(message);
}
}
