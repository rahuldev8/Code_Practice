public class Wrapper {
    public static void help(Integer a)
    {
        a++;
    }
    public static void main(String[] args)
    {
        int a = 10;
        Integer ab = a;
        System.out.println("before :");
        System.out.println(ab);

        help(ab);

        System.out.println("After :");
        System.out.println(ab);
    }
}
