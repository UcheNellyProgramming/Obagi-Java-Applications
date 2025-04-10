public class MethodOverloading{
	public static void main(String[] args){
		MethodOverloading.greetings();
		MethodOverloading.greetings("Jack");
		MethodOverloading.greetings("Jack",20);
		MethodOverloading.greetings("Jack",20,"male");
	}
	
	public static void greetings(){
		System.out.println("Good Afternoon, Everyone");
	}
	
	public static void greetings(String name){
		System.out.printf("Good Afternoon,%s%n", name);
	}
	
	public static void greetings(String name, int age){
		System.out.printf("Good Afternoon, %s your are years old %d%n ",name,age);
	}
	
	public static void greetings(String name, int age , String gender){
		System.out.printf("Good Afternoon, %s , your are %d years old and you are a %s%n",name,age,gender);
	}
}