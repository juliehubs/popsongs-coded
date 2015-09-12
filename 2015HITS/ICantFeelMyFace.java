

	
public class ICantFeelMyFace {
	

	static String sheToldMe;
	static String line;
	static Person we = new Person();
	static Person I = new Person();
	static boolean feelface;

	public  static class Person {
		Person person;

		public boolean know(String string) {
			// TODO Auto-generated method stub

			if(string == "wecantgowithoutit"){
	        	sheToldMe = "We both knew we can't go without it";
	        	return true;
	        }
	        else{
			return false;   
	        }
		}

		public boolean with(String string) {
			return true;
		}	
	}


	public static void chorus(){
		
	sheToldMe = "don't worry about it"; //She told me don't worry about it

	sheToldMe = "you'll never be alone"; //She told me you'll never be alone

	

	if(we.know("wecantgowithoutit") == true){ //We both know we can't go with out it
		sheToldMe = "you'll never be alone"; //She told me you'll never be alone
	}
	
	if(I.with("you")){
		feelface = false; //I can't feel my face when I'm with you
	}
	for(int i = 0; i<2; i++){ //Repeat phrase
		 if(feelface == false){ //But I love it
			 @SuppressWarnings("unused")
			Object Loveit;

		}
	}

	
	
	
	}


public static void main(String[] args) {
	chorus();
}

}
