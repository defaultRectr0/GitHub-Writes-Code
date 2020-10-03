import java.util.Scanner;
class Sumof {
	public static void main(String args[])
	{
	System.out.println("Enter two Numbers: ");
	Scanner s=new Scanner(System.in);
	int a=s.nextInt();
	int b=s.nextInt();
	int c=a+b;
	int d=a-b;
	int e=b-a;
	int f=a*b;
	int g=a%b;
	System.out.println("Sum: "+c);
	System.out.println("Difference(A-B): "+d);
	System.out.println("Difference(B-A): "+e);
	System.out.println("Product: "+f);
	System.out.println("Remainder: "+g);
	}
}

