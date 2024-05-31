public class Department
{
	private String name = new String();
	private Employee[] employees = new Employee[10];
	
	
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public Employee employeeId(int id)
	{
		for(int i=0; i<employees.length; i++)
		{
			if(id == employees[i].getId())
			{
				return employees[i];
			}
		}
		return new Employee();
	}
	
	public int getSize()
	{
		int i =0;
		for(Employee emp: this.employees)
		{
			if(emp != null)
			{
				i++;
			}
		}
		return i;
	}
	
	public Employee[] getEmployees()
	{
		Employee[] emps = new Employee[this.getSize()];
		for(int i = (this.getSize())-1; i >= 0;i--)
		{
			if(employees[i] != null)
			{
				emps[i] = employees[i];
			}
		}
		return emps;
	}
	
	public void addEmployee(int id, String name, double salary)
	{
		for(int i=0; i < this.employees.length; i++)
		{
			if (this.employees[i] == null)
			{
				this.employees[i] = new Employee(id, name, salary);
				break;
			}
		}
	}
	
	public void addEmployee(Employee emp)
	{
		for(int i=0; i < this.employees.length; i++)
		{
			if (this.employees[i]== null)
			{
				this.employees[i] = emp;
				break;
			}
		}
	}
	
	public double sumSalaries()
	{
		double sum=0;
		for(int i=0; i<employees.length; i++)
		{
			if(employees[i] != null)
			{
				sum += employees[i].getSalary();
			}
		}
		return sum;
	}
	
	public double avgSalary()
	{
		return this.sumSalaries()/this.getSize();
	}	
}
