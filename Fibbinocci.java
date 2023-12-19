package assesment;

public class Fibbinocci {
public static void main(String[] args) {
	int endNumber=11;
	int firstNumber=0;
	int secondNumber=1;
	int sum=0;
	System.out.println(firstNumber);
	System.out.println(secondNumber);
	for (int i =1; i<=endNumber; i++) {
		sum=firstNumber+secondNumber;
		
		firstNumber=secondNumber;
		secondNumber=sum;
		System.out.println(sum);
	}
}
}
