public class Employee {	
	private int id;
	private String name;
	private double salary;
	
	public void setId(int newId){
		this.id = newId;
	}
	public int getId(){
		return this.id;
	}
	public void setName(String newName){
		this.name = newName;
	}
	public String getName(){
		return this.name;
	}
	public void setSalary(double newSalary){
		this.salary = newSalary;
	}
	public double getSalary(){
		return this.salary;
	}
	
/*
	public void toStdOut(){
		System.out.println();
	}
*/	
	public Employee(){
	}
	public Employee(int id, String name, double salary){
		this.id = id; this.name = name; this.salary = salary;
	}
	
	public void setInfo(int id, String name, double salary){
		this.id = id; this.name = name; this.salary = salary;
	}
}
