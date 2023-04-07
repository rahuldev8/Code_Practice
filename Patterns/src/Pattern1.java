public class Pattern1 {
    public static void main(String[] args)
    {
        int num=5;
        for(int i=1; i<=num; i++)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print('*'+" ");
            }
            System.out.println();
        }
    }
}


/*
* for(int i=0; i<7; i++)
        {
            if(i==5) i=0;

            if(flame[i]=='#') continue;

            if(jump==1)
            {
                flame[i] = '#';
                count++;
                jump=len;
            }
            if(count==5 && flame[i]!='#')
            {
                res=flame[i];
                break;
            }

            jump--;
        }*/
