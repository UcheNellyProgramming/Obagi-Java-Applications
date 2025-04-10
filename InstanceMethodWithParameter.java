public class InstanceMethodWithParameter{
	public static void main(String[] args){
		InstanceMethodWithParameter imwp = new InstanceMethodWithParameter();
		int result = imwp.addition(50,17); // Aguement
		
		System.out.printf("The sum is %d%n",result);
	}
	
	public int addition(int num1 , int num2){ // instance method with parameter
		int sum = num1 + num2;
		
		return sum;
	}
}