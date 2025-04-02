public class Operators{
	public static void main(String[] args){
		//Assignment Operator(=)
		
		
		
		int num1 = 13;
		int num2 = 5;
		
		num1 += num2;
		
		//  num1 = 13; and  num2 = 5; another way to assign a variable
		
		//Arithmetic Operator(+c,*,-,/,%)
		int sum = num1 + num2;
		
		int product = num1 * num2;
		
		int difference = num1 - num2;
		
		double quotient = (double)num1/num2;
		
		int modulos = num1%num2;
		
		//Relational/Comparison Operators(>,<,>=,<=,==,!=)
		boolean isLessThan = num1 < num2;
		boolean isGreaterThan = num1 > num2;
		boolean isGreaterThanorEqualTo = num1 >= num2;
		boolean isLessThanorEqualTo = num1 <= num2;
		boolean isEqualTo = num1 == num2;
		boolean isNotEqualTo = num1 != num2;
		
		//Logical Operators(&&[Amper sign],||[pipe],![not])
		boolean isAndOperator = num1 > num2 && num1 >= num2;
		boolean isOrOperator = num1 == num2 || num1 >= num2;
		boolean isNotOperator = ! (num1 == num2 || num1 >= num2);
		
		System.out.printf("The sum of the numbers is: %d%n",sum);
		System.out.printf("The product of the numbers is %d%n",product);
		System.out.printf("The difference between %d and %d is: %d%n",num1,num2,difference);
		System.out.printf("The quotient of num1 and num2 is %f%n",quotient);
		System.out.printf("The remainder between num1 and num2 is: %d%n",modulos);
		System.out.println("==============================================================================================");
		
		System.out.printf("Is %d < %d? %b%n",num1,num2,isLessThan);
		System.out.printf("Is %d > %d? %b%n",num1,num2,isGreaterThan);
		System.out.printf("Is %d >= %d? %b%n",num1,num2,isGreaterThanorEqualTo);
		System.out.printf("Is %d <= %d? %b%n",num1,num2,isLessThanorEqualTo);
		System.out.printf("Is %d == %d? %b%n",num1,num2,isEqualTo);
		System.out.printf("Is %d != %d? %b%n",num1,num2,isNotEqualTo);
		System.out.println("==================================================================================================");
		
		System.out.printf("Is %d > %d && %d >= %d? %b%n",num1,num2,num1,num2,isAndOperator);
		System.out.printf("Is %d == %d || %d >= %d? %b%n",num1,num2,num1,num2,isOrOperator);
		System.out.printf("Is ! %d == %d && %d >= %d? %b%n",num1,num2,num1,num2,isNotOperator);
		
		
		
		
		
	}
}