import java.util.Scanner;

public class Guvi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,j;
		Scanner s=new Scanner(System.in);
		a=s.nextInt();
		String b=String.valueOf(a);
		int l=s.nextInt();
		char[] charArray=b.toCharArray();
		for(j=0;j<b.length();j++)
		{
		  if(j!=l-1)
		  {
			System.out.print(charArray[j]);
		  }
			  
		}
		}
		

}
