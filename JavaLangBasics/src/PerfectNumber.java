import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int sof=0;
        for(int i=1; i<=num; i++)
        {
            if(num%i==0)sof+=i;
        }

        System.out.println(sof==num?"Perfect":"No");
    }
}
//C Program to print the factorial of the prime factors
/*
* //Factorial of prime Numbers
#include<stdio.h>
#include<math.h>
int main()
{
    int num;
    scanf("%d", &num);
    //checking factors for given Numbers
    for(int i=1; i<num; i++)
    {
        //current number is factor and prime
        if(num%i==0)
        {
            int check = i;
            int flag = 0;
            for(int i=2;i<=num; i++)
                if(check%i==0)flag = 1;

            if(flag)
            {
                int fact = 1;
                for(int i=1; i<=check; i++)
                {
                    fact*=i;
                }
                printf("Factorial of %d is %d\n",check,fact);
            }
        }
    }
    return 0;
}
*/
