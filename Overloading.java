package OOP;
class microsoftemployee{
	private String name,gender;
	private int age,salary;
	
	public microsoftemployee()
	{
		System.out.println("Employe 1");
	}
	
	public microsoftemployee(String name)
	{
		this();
		this.name=name;
		System.out.println("Employe 2");
	}
	
	public microsoftemployee(String name,String gender)
	{
		this(name);
		this.gender=gender;
		System.out.println("Employe 3");	
	}
	
	public microsoftemployee(String name,String gender,int age)
	{
		this(name,gender);
		this.age=age;
		System.out.println("Employe 4");
	}
	
	public microsoftemployee(String name,String gender,int age,int salary)
	{
		this(name,gender,age);
		this.salary=salary;
		System.out.println("Employe 5");
	}
	
	public void print() {
		System.out.println("Name is "+ name);
		System.out.println("Gender is "+ gender);
		System.out.println("Age is "+ age);
		System.out.println("salary is "+ salary);
		System.out.println("--------------------------- ");
	}
    }
public class Overloading {

	public static void main(String[] args) {
		
		microsoftemployee e=new microsoftemployee("Vishal Choudhary","Male",20,500000);
		e.print();
	}

}
