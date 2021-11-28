package entities;

public class Employee {

	public String name;
	public double grossSalary;
	public double tax;
	
	
	public double netSalary() {
		double calcNetSalary = grossSalary - tax;			
		return calcNetSalary;	
	}
	
	public void increaseSalary(double percentage) {
		grossSalary = grossSalary + (grossSalary * (percentage / 100));
		
	}

}
