package assesment;

import java.util.Arrays;

public class FindSecondLargestNumber {
public static void main(String[] args) {
	int[] data = {3,2,11,4,6,7};
	Arrays.sort(data);
	System.out.println(data[data.length-2]);
}
}
