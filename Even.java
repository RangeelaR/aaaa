import java.util.Scanner;

public class Even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int a=sc.nextInt();
		double b=a%2;
		if(b==0){
		System.out.println("even");
		}
		else
		{
			System.out.println("odd");
		}
	}

}
