import java.util.Scanner;

public class SwitchStatement{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter *131# To Subcribe Data");
		System.out.println("Enter *310# To Check Balance");
		System.out.println("Enter *303# To Borrow Data");
		
		System.out.print("Enter code; ");
		String option = input.nextLine();
		
		switch(option){
			case "*131#":
			{
				System.out.println(" ");
				System.out.println("Enter 1 for 1 month plan");
				System.out.println("Enter 2 for 2 months plan");
				System.out.println("Enter 3 for 3 months plan");
				System.out.println("Enter 4 for 4 months plan");
				System.out.println(" ");
				
				System.out.println("Enter code: ");
				int code = input.nextInt();
				
				switch(code){
					case 1:
					{
						System.out.println("Your 1 month subscription has been activated");
					}
					break;
					
					case 2:
					{
						System.out.println("Your 2 month subscription has been activated");
					}
					break;
					
					case 3:
					{
						System.out.println("Your 3 month subscription has been activated");
					}
					break;
					
					case 4:
					{
						System.out.println("Your 4 month subscription has been activated");
					}
					break;
					default:
					System.out.println("Invalid input");
					
				}
				
			}
			break;
			
			case "*310#":
			{
				System.out.println("Your balance is N782.97");
			}
			break;
			
			case "*303#":
			{
				System.out.println(" ");
				System.out.println("Enter 1 To Borrow 1000");
				System.out.println("Enter 2 To Borrow 2500");
				System.out.println("Enter 3 To Borrow 4500");
				System.out.println("Enter 4 To Borrow 7000");
			
			    
			    System.out.println("2Enter code: ");
				int code = input.nextInt();
				
			switch(code){
					case 1:
					{
						System.out.println("Your account has been credited with N1000");
					}
					break;
					
					case 2:
					{
						System.out.println("Your account has been credited with N2500");
					}
					break;
					
					case 3:
					{
						System.out.println("Your account has been credited with N4500");
					}
					break;
					
					case 4:
					{
						System.out.println("Your account has been credited with N7000");
					}
					break;
					default:
					System.out.println("Invalid input");	
				}	
			}
			break;
			
			default:
			System.out.println("Invalid input");
		}
		
	}
}