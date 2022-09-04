package app.encapsulation;

public class Employee 
{
	private int empId;// 100
	private String email;
	private String disgnation;
	private Double salary;
	private String address;
	
	public int getEmpId() 
	{
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDisgnation() {
		return disgnation;
	}
	public void setDisgnation(String disgnation) {
		this.disgnation = disgnation;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
}
