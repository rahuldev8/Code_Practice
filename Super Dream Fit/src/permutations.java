import java.util.*;

public class permutations {
    public static void toBianryConversion(int num, int[] hash)
    {
        int index = hash.length-1;
        while(num!=0)
        {
            hash[index--] = num%2;
            num/=2;
        }
    }
    public static void allPermuations(List<List<Character>> combinations, String str, int comb,int length, int combi)
    {
        int[] hash = new int[length];
        toBianryConversion(combi, hash);
        List<Character> temp = new ArrayList<>();
        for(int i=0; i<length; i++)
        {
            if(hash[i]!=0)
            {
                temp.add(str.charAt(i));
            }
        }
        combinations.add(temp);
    }
    //total combinations can be generated is 2^n, where n is the number of characters in the given string
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String perm = sc.next();
        int length = perm.length();
        int comb = (int)Math.pow(2, length)-1;

        List<List<Character>> combinations = new ArrayList<>();

        for(int i=0; i<=comb; i++)
        {
            allPermuations(combinations, perm, comb, length, i);
        }

        Collections.sort(combinations);

        for (List<Character> l1 : combinations) {
            for (char val : l1) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
