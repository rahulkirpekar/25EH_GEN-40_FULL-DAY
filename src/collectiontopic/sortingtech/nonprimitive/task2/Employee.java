package collectiontopic.sortingtech.nonprimitive.task2;

public class Employee implements Comparable<Employee>
{
	private int id;
	private String name;
	private int salary;
	private String dsgn;
	
	public Employee() 
	{
	}
	public Employee(int id, String name, int salary, String dsgn) 
	{
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.dsgn = dsgn;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getDsgn() {
		return dsgn;
	}
	public void setDsgn(String dsgn) {
		this.dsgn = dsgn;
	}
	@Override
	public int compareTo(Employee e2) 
	{
		if(getSalary() > e2.getSalary()) 
		{
			return -1;
			
		}else if(getSalary() < e2.getSalary()) 
		{
			return 1;
			
		}else 
		{
			return 0;
		}
	}
}