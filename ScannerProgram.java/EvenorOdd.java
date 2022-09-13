import java.util.Scanner;
   
class EvenorOdd{

 public static void main(String [] args){

		 int n, count=0;
		 System.out.print("Enter any Number");

 		Scanner r = new Scanner(System.in);
     	      n =r.nextInt();

		for(int i=1; i<=n; i++)

       {
           if (n%2==0)
           {
 	                 System.out.print("Number is Even");
           }
  	  else                                  
          {
               System.out.print("Number is Odd");
              }

}
}
}