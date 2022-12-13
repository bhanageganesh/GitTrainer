package LogicalProgPrac;

public class ReverseNumber {

	public static void main(String[] args) {
		int n=123546;  //reverse this number
		int rem;      //store value
		while(n>0)     //12354>0 ,1235>0, 123>0
		{
			rem=n%10;  //123546%10=6,  12354%10=4, 1235%10=5, 123%10=3
	System.out.print(rem+"  ");//6 ,4,  5                    // is countinu to all number print
			n=n/10;  //123546/10=12354, 12354/10=1235 ,1235/10=123
		}
	}

}
