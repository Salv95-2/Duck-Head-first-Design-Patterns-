
public class MallardDuck extends Duck{
	
	
	//Remember, the MallardDuck inherits the quackBehavior and flyBehavior
	//instance variables from class Duck.
	public MallardDuck() {
		//A MallardDuck uses the Quack class to handle its quack, so when
		//perforQuack is called, the responsibility for the quack is delegated
		//to the Quack object and we get a real 
		//quack.
		quackBehavior = new Quack();
		//And it uses the FlyWithWings as its FlyBehavior type/
		flyBehavior = new FlyWithWings();
	}
	
	public void display() {
		
		System.out.println("I'm a real Mallard duck");
	}

}
