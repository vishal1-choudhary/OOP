package OOP;

public class abstraction {
	
	public static void main (String [] args) {
		car c1=new creata();
		c1.startengin();
		c1.music();
		c1.accelarate();
		c1.carbreak();
		
		System.out.println("----------------");
		
		thar c2=new thar();
		c2.startengin();
		c2.music();
		c2.accelarate();
		c2.carbreak();
		c2.powerengin();
	}

}

abstract class car{
	  public abstract void  startengin();
	
	  public abstract void accelarate(); 
	
	  public abstract void carbreak();
	
	  public  void music() {
	        System.out.println("Creta has premium sound system");

	  }
}

class creata extends car {
    public void startengin() {
        System.out.println("Creta starts with push button");
    }

    public void accelarate() {
        System.out.println("Creta accelerates smoothly");
    }

    public void carbreak() {
        System.out.println("Creta uses disc brakes");
    }

    public void music() {
        System.out.println("Creta has premium sound system");
    }
}

class thar extends car {
    public void startengin() {
        System.out.println("Thar starts with key");
    }

    public void accelarate() {
        System.out.println("Thar accelerates powerfully");
    }

    public void carbreak() {
        System.out.println("Thar uses strong brakes");
    }

    public void music() {
        System.out.println("Thar has basic music system");
    }
    
    public void powerengin() {
    	System.out.println("Thar is 4*4 ");
    }
}
