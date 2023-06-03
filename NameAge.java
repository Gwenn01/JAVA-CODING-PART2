public class Main {
	public static void main(String[] args) {
		Me me = new Me();
		
		me.sayName();
		System.out.println(me.sayAge());
	}
}



class Me{
	public void sayName(){
		System.out.println("Gwen");
		
 	}
	 public int sayAge(){
	 	int age = 18;
	 	return age;
      }
}