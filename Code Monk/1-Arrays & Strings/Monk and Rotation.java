class TestClass {
    public static void reverse(int[] arr, int low, int high) {
        while(low < high) {
            int temp = arr[low];
            arr[low++] = arr[high];
            arr[high--] = temp;
        }
    }
    public static void main(String[] args)
    {
        int t;
        int n;
        int k;
        int[] arr;
        Scanner scan = new Scanner(System.in);
        StringBuilder output = new StringBuilder("");

        t = scan.nextInt();
        while (t-- != 0) {
            
            n = scan.nextInt();
            k = scan.nextInt() % n;
            arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scan.nextInt();
            }
            reverse(arr, 0, n - 1);
            reverse(arr, 0, k - 1);
            reverse(arr, k, n - 1);
            
            for (int i = 0; i < n; i++) {
                output.append(arr[i] + " ");
            }
            if(t != 0) {
                output.append('\n');
            }
        }
        System.out.print(output);
    }
}