public class TypeCasting{
    public static void main(String[] args){
		double balance = 58585;
		System.out.printf("Your account balance is %c%f%n",'$',balance);
		
		//Narrowing Type Casting(ASCII code ? =63)
		char alpha = '?';
		
		int asciiCode = (int)alpha;
		System.out.printf("The ASCII code for ? is %d%n",asciiCode);
		
		double height =5.8;
		short myHeight = (short)height;
		System.out.printf("My Faculty's height is %d%n",myHeight);
	}
}