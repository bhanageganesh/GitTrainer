package LogicalProgPrac;

public class fibonacciSeries {

	public static void main(String[] args) {
		int f=0;
		int s=1;
		int count=25;
		for(int i=1;i<=count;i++)
		{
			int next=f+s;
			f=s;
			s=next;
			System.out.print(i+"  ");
		}

	}

}
