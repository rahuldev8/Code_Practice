public class MergeSort {
    public static void conquer(int[] arr, int start, int mid, int end)
    {
        int i = start;
        int j = mid+1;
        int k = 0;

        int[] buffer = new int[end-start+1];

        while(i<=mid && j<=end)
        {
            if(arr[i]<arr[j])
                buffer[k++] = arr[i++];
            else
                buffer[k++] = arr[j++];
        }
        //if left part is completed
        while(i<=mid)
                buffer[k++] = arr[i++];
        //if right part is completed
        while(j<=end)
                buffer[k++] = arr[j++];

        //copying contents to original array
        for(int x=0,y=start; x< buffer.length; x++,y++)
                arr[y] = buffer[x];
    }
    public static void divide(int[] arr, int start, int end)
    {
        //if one element is remaining
        if(start>=end)return;

        int mid = start + (end - start)/2;

        //diving into left and right parts
        divide(arr, start, mid);
        divide(arr, mid+1, end);

        //merging the sorted arrays
        conquer(arr, start, mid, end);
    }
    public static void main(String[] args)
    {
        int[] arr = {9,5,12,1,54,77,89,2,45};
        int start = 0;
        int end = arr.length-1;

        System.out.println("Before Sorting :");
        for(int i=0; i<end; i++)
                System.out.print(arr[i]+" ");

        divide(arr, start, end);
        System.out.println();

        System.out.println("After Sorting :");
        for(int i=0; i<end; i++)
            System.out.print(arr[i]+" ");

        //Time Complexity : o(n log n)
        //Space Complexity : o(n)
    }
}
