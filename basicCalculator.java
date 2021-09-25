import java.util.Scanner;

pulbic class basicCalculator{
	public static void main(String[] args){
		int firstNum;
		int secondNum;
		int answer = firstNum + secondNum;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your first number here: ");
		firstNum = input.nextInt();
		
		System.out.println("Enter your Second number here: ");
		secondNum = input.nextInt();
		
		System.out.println("his is your answer" + answer);
	}
}