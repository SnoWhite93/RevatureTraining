package day3_assignments;

import java.util.Arrays;

public class FindOddAndEvenNums {
	public static void main(String[] args) {
		int[] numbers = { 13, 16, 33, 22, 26, 55, 46, 31, 8 };
		
		int[] evenNumbers = new int[numbers.length];
		int evenNumberIndex = 0;
    
		for (int i = 0; i < numbers.length; i++) {

			if (numbers[i] % 2 == 0) {
				evenNumbers[evenNumberIndex] = numbers[i];
				evenNumberIndex++;
			}
		}
		int[] evenNumbersArr = Arrays.copyOf(evenNumbers, evenNumberIndex);

//		System.out.println(evenNumberIndex);
		System.out.println("Even numbers array : " );
		System.out.println(Arrays.toString(evenNumbers));
		System.out.println(Arrays.toString(evenNumbersArr));
		
/*----------------------------------------------------------------------------------------------*/
		int[] oddNumbers = new int[numbers.length];
        int oddNumbersIndex = 0;

        for(int i = 0; i< numbers.length; i++){
            if(numbers[i] % 2 != 0) {
                oddNumbers[oddNumbersIndex] = numbers[i];
                oddNumbersIndex++;
            }
        }

        int[] oddNumbersArray= Arrays.copyOf(oddNumbers, oddNumbersIndex);
        System.out.println();
        System.out.println("Odd numbers array : ");
        System.out.println(Arrays.toString(oddNumbersArray));
		
		
		
	}
}