/**
 * 
 */
package day14;

/**
 * 
 */
public class Program6_RotateByKElements {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5};
		int k=2;
		for(int j = 0; j < k; j++) {
		    int first = arr[0];
		    for(int i = 0; i < arr.length - 1; i++) {
		        arr[i] = arr[i + 1];
		    }
		    arr[arr.length - 1] = first;
		}
		 for(int num : arr) {
	            System.out.print(num + " ");
	        }
	}

}
