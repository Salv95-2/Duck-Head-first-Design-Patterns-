
public class MiniDuckSimulator {
		
	
		public static void main(String[] args) {
			
			Duck mallard = new MallardDuck();
			mallard.performQuack();
			mallard.performFly();
			
			
			Duck model = new ModelDuck();
			//The first call to performFly() delegates to the flyBehavior object set in the
			//ModelDuck's constructor, which is a FlyNoWay instance
			
			model.performFly();
			//This invokes the model's inherited behavior setter method, and... voila!
			//The model suddenly has rocket-powered flying capacity!
			model.setFlyBehavior(new FlyRocketPowered());
			
			model.performFly();
			//If it worked, the model duck dynamically changed its flying behavior! You can't do THAT 
			//if the implementation lives inside the Duck class.
			
		}
		
		
		
}
