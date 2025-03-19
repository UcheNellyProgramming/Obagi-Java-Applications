public class DataType{
	public static void main(String[] args){
		//Integer type(byte,short,int,long)
		
		byte age = 50;
		System.out.printf("Your age is %d%n",age);
		
		short quantity = 32000;
		System.out.printf("I bought %d quantity of bags for my business%n",quantity);
		
		int populationInNigeria = 1000000000;
		System.out.printf("The total population in Nigeria is %d%n",populationInNigeria);
		
		long worldPopulation = 8000000000L;
		System.out.printf("The world population is %d%n",worldPopulation);

		//float-point type(float,double)
		float myBalance = 123456.858575678F;
		System.out.printf("Your account balance is %f%n",myBalance);
		
		double cbnReserve = 5575857.7373673636363;
		System.out.printf("The CBN balance is %.5f%n",cbnReserve);
		
		//Boolean type (boolean)
		boolean isJavaFun = true;
		System.out.printf("Is Java a fun Language ? %b%n",isJavaFun);
		
		//Character type(char)
		char alpha = '@';
		System.out.printf("My email is mercyben405%cgmail.com",alpha);
    }    
}