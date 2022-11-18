package Weeks3and4;

public class Weeks3and4 {

	public static void main(String[] args) {
		
		int agesTotal = 0;
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93, 56};
		int minusAge = ages[ages.length-1] - ages[0];
		
		float totalLetters = 0;
		String allNames = "";
		
		// show last age in array
		System.out.println("The last age in the array, " + ages[ages.length-1] + ", minus the first age in the array, " + ages[0] + ", is equal to " + minusAge + ".");
		
		// calculate average age
		for(int i=0; i <= ages.length-1; i++) {
			agesTotal += ages[i];
		}
		int agesAverage = agesTotal/ages.length;
		
		System.out.println("The average age is " + agesAverage + ".");
		
		String[] names = {"Sam","Tommy","Tim","Sally","Buck","Bob"};
		
		for(int n = 0; n <= names.length-1; n++) {
			int numOfLetters = names[n].length();
			totalLetters = totalLetters + numOfLetters;
		}
		// show average number of letters per name
		float avgLetters = totalLetters / (names.length);
		System.out.println("The average number of letters per name is " + avgLetters);
		
		// concatenate all names together
		for(String name : names) {
			allNames += name + " ";
		}
		System.out.println("Here are all of the names: " + allNames + ".");
		
		// add name lengths together
		int[] nameLengths = new int[names.length];
		
		for(int n = 0; n <= names.length-1; n++) {
			nameLengths[n] = names[n].length();
		}
		// get sum of number of letters
		int lettersSum = 0;
		for(int x = 0; x <= nameLengths.length-1; x++) {
			lettersSum = lettersSum + nameLengths[x];
		}
		System.out.println("Sum of number of letters: " + lettersSum + ".");
		
		// print out return of greeting method
		System.out.println(greeting("Hello",3));
		System.out.println(namesMethod("Hank","Smith"));
		
		
		int[] intArray1 = {3,6,9,2,6,7,3,5};
		System.out.println(intSum(intArray1,100));
		
		double[] doubleArray = {2.4385,432.8844,23.5667,87.878,92.4557};
		double[] doubleArray2 = {235.34,5325.43,64.2135,1.3455,0.22};
		int[] winsArray = {23,62,11,70,14,40,50,45,50,55,11};
		System.out.println(doubleAvg(doubleArray));
		System.out.println(doublesCompare(doubleArray,doubleArray2));
		System.out.println(willBuyDrink(true,10.6));
		System.out.println(isGoodTeam(winsArray));
	}
	// method to return word three times
	public static String greeting (String word, int n) {
		return word.repeat(n);
	}
	
	// method to return a full name consisting of two provided names
	public static String namesMethod (String firstName, String lastName) {
		String fullName = firstName + " " + lastName;
		return fullName;
	}
	
	// method to return true if sum of numbers is less than 100
	public static boolean intSum(int[] intArray, int n) {
		int intTotal = 0;
		for(int i=0; i <= intArray.length-1; i++) {
			intTotal += intArray[i];
		}
		return intTotal < n;
	}
	
	// method to return average of doubles in array
	public static double doubleAvg(double[] doubleArray) {
		double doubleTotal = 0;
		for(int i = 0; i <= doubleArray.length-1;i++)
			doubleTotal += doubleArray[i];
		return doubleTotal / doubleArray.length;
	}
	
	// method returns true if first double array has a higher average value than the second array does
	public static boolean doublesCompare(double[] doubleArray1, double[] doubleArray2) {
		double doubleAvg1 = 0;
		double doubleTotal1 = 0;
		for(int i = 0; i <= doubleArray1.length-1;i++)
			doubleTotal1 += doubleArray1[i];
		doubleAvg1 = doubleTotal1 / doubleArray1.length;
		
		double doubleAvg2 = 0;
		double doubleTotal2 = 0;
		for(int i = 0; i <= doubleArray2.length-1;i++)
			doubleTotal2 += doubleArray2[i];
		doubleAvg2 = doubleTotal2 / doubleArray2.length;
		
		return doubleAvg1 > doubleAvg2;
	}
	// method checks if it's hot outside and there's enough money in the pocket
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		return isHotOutside && moneyInPocket > 10.50;
	}
	
	// method returns whether an NBA team is good based on its average number of wins per season
	public static boolean isGoodTeam(int[] wins) {
		int winsTotal  = 0;
		double winsAvg = 0;
		for(int i = 0; i <= wins.length-1;i++)
			winsTotal += wins[i];
		winsAvg = winsTotal / wins.length;
		return winsAvg > 45;
	}
	
}
