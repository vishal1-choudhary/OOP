package OOP;

public class inheritence {

	public static void main(String[] args) {
		
		animal a=new animal();
		a.wakeup();
		a.eat();
		a.sleep();
		a.hunt();
		
		System.out.println("---------------");		
		dogeshbhai b=new dogeshbhai();
		b.wakeup();
		b.eat();
		b.sleep();
		b.hunt();
		b.barking();
		b.security();
		
		System.out.println("---------------");

		
		cow c=new cow();
		c.wakeup();
		c.eat();
		c.sleep();
		c.hunt();
		
		System.out.println("---------------");
		
		puppy d=new puppy();
		
		b.wakeup();
		b.eat();
		b.sleep();
		b.hunt();
		b.barking();
		b.security();
		

		
		

	}

}
