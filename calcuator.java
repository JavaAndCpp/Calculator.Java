import java.util.*;

public class SimpleCalculator {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the operation: ");
		String operand = input.next();
		
		System.out.print("Please enter 2 numbers. ");
		double num1=input.nextDouble();
		double num2=input.nextDouble();
		
		if(operand=="+") {
			System.out.println(num1+ "+" + num2+ "=" +(num1+num2));
		}
		else if(operand=="-") {
			System.out.println(num1+ "-" + num2+ "=" +(num1-num2));
		}
		else if(operand=="*") {
			System.out.println(num1+ "*" + num2+ "=" +(num1*num2));
		}
		else if(operand=="/") {
			if (num2==0) {
				System.out.println("Inability to divide 0.");
			}
			else{
				System.out.println(num1+ "/" + num2+ "=" +(num1/num2));
			}
		}
	}

}
