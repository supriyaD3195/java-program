import java.util.Scanner;

public class sumPrime 
{
    public static void main(String[] args) {
        int n1, n2,j,i;
        int sum = 0;
      
        Scanner sc = new Scanner(System.in);
        System.out.println("enter two number");
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        for (i= n1+1; i <= n2-1; i++)   
        {     
            for (j = 2; j < i; j++) 
            {
                if (i % j == 0)
                break;
            }
                if (i==j) 
                {
                    sum = sum + i;
                }
        }
        System.out.println("sum is: " + sum);
    }

}