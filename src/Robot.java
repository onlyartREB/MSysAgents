import jade.core.Agent;

 public class Robot extends Agent{
	
	protected void setup() {
		
		System.out.println("je suis le robot :"+this.getLocalName());
		System.out.println("je suis le robot :"+this.getName()); 
		System.out.println("Mes Parametres sont :");
		
	    Object[]args= getArguments();
	   		if(args!=null) {
			for(int i=0;i<args.length;i++) {
				System.out.println(args[i]);
			}
		}
		
	}

}
