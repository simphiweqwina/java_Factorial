import java.util.Scanner;

class Factorial{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//instantiate class
		Factorial ft = new Factorial();

		//get number
		System.out.print("Enter any interger: ");
		ft.printResult(sc.nextInt());
	}

	public void printResult(int num){
		int result =1;

		for (int i =1;i<=7 ;i++ ) {
			result =result*i;
		}

		System.out.print("Factorial of "+num+" is :" +result);
	}
}