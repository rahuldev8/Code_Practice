import java.util.*;

public class binary {
    public static void rangeOfBinary(int num)
    {
        int[] binary = new int[4];
        int index = 3;
        int temp = num;
        while(num>0)
        {
            binary[index--] = num%2;
            num/=2;
        }
        System.out.print("Binary of "+temp+" is : ");
        for(int i=0; i<4; i++)
        {
            System.out.print(binary[i]+" ");
        }

    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for(int i=1; i<=num; i++)
        {
            rangeOfBinary(i);
            System.out.println();
        }
    }
}
