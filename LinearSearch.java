class LinearSearch
{
    static int search(int arr[], int n, int x)
    {
        for(int i=0; i<n; i++)
        {
            if(arr[i]==x)
            return i;
        }
        return -1;
    }
    public static void main(String args[])
    {
        int[] arr={3, 4, 10, 1, 6}
        int n= arr.length;
        int x=4;
        int index= search(arr, n, x);
        if(index== -1)
        System.out.println("Element not found");
        else
        System.out.println("Element found at index"+index);

    }
}