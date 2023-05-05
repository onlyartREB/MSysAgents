
public class TestRobot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		String[]commande=new String[3];
		 String argument="";
		 argument=argument+"Robucar:Robot(15,20,7,10,Est)";
		 argument=argument+";"; 
		 argument=argument+"Atlas:Robot(15,20,4,3,Nord)";
		 argument=argument+";"; 
		 argument=argument+"NAO:Robot(15,20,12,5,Sud)";
		 commande[0]="-cp";
		commande[1]="jade.boot";
		 commande[2]=argument;
		 
		 
		 jade.Boot.main(commande);

	}

}
