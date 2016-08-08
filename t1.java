import java.util.Scanner;


public class Test {

	public static void main(String[] args) 
	{ 
		int n;
		int count=0;
		System.out.println(" Enter the number");
		   Scanner s=new Scanner(System.in);
		   n=s.nextInt();
		    while(n>0)
		    {
		        n=n/10;
		        count++;
		    }
		   System.out.println("Number of digits : "+count);
		}    

	}
