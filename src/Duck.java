
public abstract class Duck {
	
	//Declare two reference variables from the behavior interface types.
	//All duck subclasses (in the same package) inheret these.
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;
	
	public Duck() {
	}
	
	public abstract void display();
	
	//Delegate to the behavior classes
	public void performFly() {
		flyBehavior.fly();
	}
	
	//Delegate to the behavior classes
	public void performQuack() {
		quackBehavior.quack();
	}
	
	public void swim() {
		System.out.println("All ducks float, even decoys!");
	}
	
	
	//We we call these methods anytime we want to change the behavior of a duck on the fly.
	public void setFlyBehavior(FlyBehavior fb) {
		flyBehavior = fb;
	}
	
	public void setQuackBehavior(QuackBehavior qb) {
		
		quackBehavior =  qb;
	}
	
	
}
