package day5;

public class Program3_LCM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=12;
        int num2=18;
        int gcd1=1;
        int small=num1;
        int big=num2;
        
        if(num2 < num1) {
       	 small=num2;
       	 big=num1;
        }
        
        for(int fact=1;fact<=small;fact++) {
       	 if(small%fact == 0 && big%fact == 0) {
       		 gcd1=fact;
       	 }
       	 
       	 
        }
        System.out.println("gcd is " + gcd1);
        int product=num1*num2;
        int lcm=product/gcd1;
        System.out.println("Lcm is " + lcm);
        //System.out.println("Lcm is " + (num1*num2/gcd1));
        
        if(gcd1==1) {
       	 System.out.println("This is coprime");
        }
       	 
	}

}
