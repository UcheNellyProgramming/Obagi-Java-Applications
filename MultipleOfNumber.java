import java.util.Scanner;

public class MultipleOfNumber{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
			System.out.print("Enter number: ");
		
		int num = input.nextInt();
		int i = 1;
		while(i <= 15){
			System.out.println(num * 1);
			i++;
		}
	}
}