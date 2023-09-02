import java.util.*;
 class Prime
{
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);//Scanner Class 
		int m,n;
		System.out.print("\nEnter lower limit (Inclusive) : ");
		m=sc.nextInt();
		System.out.print("\nEnter upper limit (Inclusive) : ");
		n=sc.nextInt();
		int i,j;
		int flag;
		for(i=m;i<=n;i++){
		    flag=1;
		    for(j=2;j<i;j++){
		        if(i%j==0){
		            flag=0;
		            break;
		        }
		    }
		    if(flag==1){
		        System.out.printf("%d\t",i);
		    }
		}
	}
}