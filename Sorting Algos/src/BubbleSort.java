public class BubbleSort {
    public static void Bubble(int[] arr)
    {
        //outer loop is for pass
        for(int i=0; i<arr.length; i++)
        {
            for(int j=0; j<arr.length-i-1; j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void main(String[] args)
    {
        int[] arr = {9,5,12,1,54,77,89,2,45};

        System.out.println("Before Sorting :");
        for(int i=0; i<arr.length; i++)
            System.out.print(arr[i]+" ");

        Bubble(arr);
        System.out.println();

        System.out.println("After Sorting :");
        for(int i=0; i<arr.length; i++)
            System.out.print(arr[i]+" ");

        //Time Complexity : o(n*n)
        //Space Complexity : o(n)
    }
}
