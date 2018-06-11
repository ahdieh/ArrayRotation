
/* Task description
An array A consisting of N integers is given. Rotation of the array means that each element is shifted right by one index, and the last element of the array is moved to the first place. For example, the rotation of array A = [3, 8, 9, 7, 6] is [6, 3, 8, 9, 7] (elements are shifted right by one index and 6 is moved to the first place).
The goal is to rotate array A K times; that is, each element of A will be shifted to the right K times.
Write a function:
class Solution { public int[] solution(int[] A, int K); }
that, given an array A consisting of N integers and an integer K, returns the array A rotated K times.
For example, given
    A = [3, 8, 9, 7, 6]
    K = 3
the function should return [9, 7, 6, 3, 8]. Three rotations were made:
    [3, 8, 9, 7, 6] -> [6, 3, 8, 9, 7]
    [6, 3, 8, 9, 7] -> [7, 6, 3, 8, 9]
    [7, 6, 3, 8, 9] -> [9, 7, 6, 3, 8]
For another example, given
    A = [0, 0, 0]
    K = 1
the function should return [0, 0, 0]
Given
    A = [1, 2, 3, 4]
    K = 4
the function should return [1, 2, 3, 4]
Assume that:
. N and K are integers within the range [0..100];
. each element of array A is an integer within the range [-1,000,,1,000].

*/

package arrayrotation;
import java.util.Scanner;
/**
 *
 * @author ahdieh
 */
public class ArrayRotation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n=0,k=0;
	int[] array;
        
        Scanner in = new Scanner(System.in);
 	// length of array
	System.out.print("Please enter the length of the array: ");
	n = in.nextInt();
        array = new int[n];
	// the number of shifting
	System.out.print("How many times the array is needed to rotate? ");
	k = in.nextInt();
	// filling the array
	for (int i = 0; i < n; i++) {
		int sequence, number=0;
		sequence = i+1;
		System.out.printf("Please enter the element %d of the array: ", 
                        sequence);
		number = in.nextInt();;
		array[i] = number;
	}
        Solution solu = new Solution(n, array);
	solu.solution(k);
	solu.print();
    }
    
}
