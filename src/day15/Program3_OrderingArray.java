/**
 * 
 */
package day15;

/**
 * 
 */
public class Program3_OrderingArray {
	
	static void moveZeros(int arr[]) {
		int pos=0;
		for(int i=0;i<=arr.length-1;i++) {
			if(arr[i] !=0 ) {
			/*	arr[pos]=arr[i];
				pos++;
				arr[i]=0; */
				
				int temp = arr[pos];
                arr[pos] = arr[i];
                arr[i] = temp;
                pos++; 	
			}
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int arr[] = {1,0,2,0,3};
    moveZeros(arr);
    for(int num:arr) {
    	 System.out.print(num + "" );
    }
	}

}
