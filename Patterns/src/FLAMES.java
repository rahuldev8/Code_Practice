import java.util.Scanner;

public class FLAMES {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String n1 = sc.next();
        String n2 = sc.next();

        int len = n1.length() + n2.length();
        System.out.println("Before : "+len);

        char[] nn1 = n1.toCharArray();
        char[] nn2 = n2.toCharArray();

        //neglecting the common counts
        for(int i=0; i<n1.length(); i++)
        {
            for(int j=0; j<n2.length(); j++)
            {
                if(nn1[i] == nn2[j])
                {
                    nn1[i] = '0';
                    nn2[j] = '0';
                    len-=2;
                    break;
                }
            }
        }

        System.out.println("After : "+len);

        char[] flame = {'F', 'L', 'A', 'M', 'E', 'S'};
        int jump=len, count=0;
        char res;
        int i=0;


        while(true)
        {
//            System.out.println("Iterator : "+i);
//            System.out.println("Count : "+ count);
//            System.out.println("Char : "+ flame[i]);
            if(i==5)
            {
                i=0;
                continue;
            }

            if(flame[i] == '#')
            {
                i++;
                continue;
            }

            if(jump==0)
            {
                flame[i] = '#';
                i++;
                jump=len;
                count++;
                continue;
            }

            if(count == 4 && flame[i] != '#')
            {
                res = flame[i];
                break;
            }

            jump--;
            i++;
        }

        if(res=='F')System.out.println("Friends");
        else if(res=='L')System.out.println("Love");
        else if(res=='A')System.out.println("Affection");
        else if(res=='M')System.out.println("Marriage");
        else if(res=='E')System.out.println("Enemy");
        else if (res=='S')System.out.println("Sister");
    }
}
