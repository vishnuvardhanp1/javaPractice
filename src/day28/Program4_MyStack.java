/**
 * 
 */
package day28;
class MyStack {
    int[] arr = new int[100];
    int top = -1;

    void push(int x) {
        arr[++top] = x;
    }

    int pop() {
        return arr[top--];
    }

    int peek() {
        return arr[top];
    }
    
    @Override
    public String toString() {
        String result = "";

        for (int i = 0; i <= top; i++) {
            result += arr[i] + " ";
        }

        return result;
    }
}
/**
 * 
 */
public class Program4_MyStack {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       MyStack myStack=new MyStack();
       myStack.push(10);
       myStack.push(20);
       myStack.push(30);
       myStack.pop();
       System.out.println(myStack.toString());
	}

}
