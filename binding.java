package OOP;

public class binding {

	public static void main(String[] args) {
		parentclassbinding p=new parentclassbinding();
		p.show();
		p.display();
		
			p=new childclassbiding();
			p.show();//this is early binding bcoz ye reffrence class ke method ko call krega.
			p.display();//this is late binding bcoz ye object class ke mehod ko call krega.
		

	}

}
