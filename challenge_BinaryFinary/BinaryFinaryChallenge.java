/**
 * 
 */
package challenge_BinaryFinary;

/**
 * 
 */
public class BinaryFinaryChallenge {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean[] eightBitArray = { true, false, false, true, false, true, false, true };

		displayBooleanArrayAsBinary(eightBitArray);
		System.out.println();

		int[] binaryNumber = { 1, 1, 1, 1, 1, 1, 1, 1 };
		int[] binaryNumber1 = { 0, 1, 0, 1, 0, 1, 0, 1 };
		int[] binaryNumber2 = { 1, 0, 0, 1, 0, 1, 1, 1, 1, 1, 1 };

		int total = convertIntBinaryArrayToDecimal(binaryNumber2);

		System.out.println(total);

	}

	/**
	 * This method converts a Binary Array of Integers to it's Decimal equivalent
	 * 
	 * @param binaryNumber - Binary Number in Array from to be converted
	 */
	public static int convertIntBinaryArrayToDecimal(int[] binaryNumber) {
		int total = 0;

		for (int i = 0; i < binaryNumber.length; i++) {
			if (binaryNumber[i] == 1)
				total += Math.pow(2, (binaryNumber.length - 1 - i));
		}
		return total;
	}

	/**
	 * This method displays a Boolean Array as a Binary Number
	 * 
	 * @param eightBitArray
	 */
	public static void displayBooleanArrayAsBinary(boolean[] eightBitArray) {
		for (int i = 0; i < eightBitArray.length; i++) {
			if (eightBitArray[i] == true) {
				System.out.print(" 1");
			} else {
				System.out.print(" 0");
			}
		}
	}

}
