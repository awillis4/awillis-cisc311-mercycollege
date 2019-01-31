import java.util.ArrayList;

/**
 * Please create your own class YourLastName_YourFirstName_final that implements
 * methods in this interface
 */

public interface Final {

	/**
	 * Counts the frequency of each IP address in the given csv file and returns the
	 * top five most frequently occurring IP addresses in descending order of
	 * frequency. Complexity must be lower than O(n^2)
	 * 
	 * @param csvFileName
	 * @return an array list containing the top five most frequently occurring IP
	 *         addresses in descending order of frequency
	 */
	ArrayList<String> ipCounter(String csvFileName);

	/**
	 * Re-sorts a partially sorted array. Complexity must be lower than O(nlogk).
	 * 
	 * @param arr almost sorted array
	 * @return the re-sorted array
	 */
	int[] reSortArray(int[] arr);

	/**
	 * Compares two strings based on the given lexicographical order.
	 * 
	 * @param str1	given string 1
	 * @param str2	given string 2
	 * @return the smaller one between two given strings 
	 */
	String findSmallerString(String str1, String str2);
}
