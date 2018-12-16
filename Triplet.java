public class Triplet {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		int a,j;
		Scanner s=new Scanner(System.in);
		a=s.nextInt();
	  int rr[]=new int[a];
		for(int i=0;i<a;i++)
		{ 
			rr[i]=s.nextInt();
			}
		for( j =0;j<a;j++)			
		{   
		    int r=j/3;
				if(r>=1&&j%3==0)
				{
					System.out.print(rr[j]+" ");
				}		
			}
}
}
