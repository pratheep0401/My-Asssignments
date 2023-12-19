package assesment;

public class IsPrime {
public static void main(String[] args) {
	int input=25;
	int c=0;
	for (int i =1; i <=input; i++) {
		if(input%i==0)
	     c++;
	}
		if (c>2) {
			System.out.println(input+" is Not a Prime Number");
		} else {
			System.out.println(input+" is a Prime Number");
		}
	
}
}
