
package OOP;

public class getter {
	public static void main(String[] args) {
		
		// Constructor se object create
		System.out.print("1. ");
		Setter s1 = new Setter(101, "Vishal choudhary", "v@gmail.com", "UP");

		s1.print();
	
		// Setter use (value change)
		System.out.print("2. ");
		s1.setName("Ashish");
		s1.setEmail("A@gmail.com");
		s1.setId(102);
		
		s1.print();


		// Setter use (value change)
		System.out.print("3. ");
		s1.setName("Parvez");
		s1.setEmail("P@gmail.com");
		s1.setId(103);
		
		s1.print();

		
		// Setter use (value change)
		System.out.print("4. ");
		s1.setName("Anmol");
		s1.setEmail("Am@gmail.com");
		s1.setId(104);
		
		s1.print();
		
		// Setter use (value change)
		System.out.print("5. ");
		s1.setName("Pancham");
		s1.setEmail("p@gmail.com");
		s1.setId(105);
		
		s1.print();
		

		// Setter use (value change)
		System.out.print("6. ");
		s1.setName("Shehzad");
		s1.setEmail("s@gmail.com");
		s1.setId(106);
		
		s1.print();


	}
}
