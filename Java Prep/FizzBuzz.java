class FizzBuzz {
	public static void fizzBuzz(int num){
		while(num > 0){
			if(num % 3 == 0 && num % 5 == 0){
				System.out.print("fizzbuzz \n");
			}
			else if(num % 3 == 0){
				System.out.println("fizz \n");
			}
			else if(num % 5 == 0){
				System.out.println("buzz \n");
			}
			else{
				System.out.println(num);
			}
			num = num - 1;
		}
	}
	public static void main(String[] args){
		fizzBuzz(100);
	}
}