package OOP;

public class Setter {
	private int id;
	private String name,email,address;

	// Constructor
	public Setter(int id, String name, String email, String address) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.address = address;
	}

	// Setters
	public void setId(int id) {
		if(id<0) {
			System.out.print("id can't be negative ");
			return;
		}
		this.id = id;	
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	// Getters
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public String getAddress() {
		return address;
	}
	
	public void print() {

		// Getter call 
		System.out.println("Name:- "+getName());
		System.out.println("Email:- "+getEmail());
	    System.out.println("Address:- "+getAddress());
		System.out.println("ID:- "+getId());
		System.out.println("---------------");
	}
}
