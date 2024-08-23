public class maina {
    public static void main(String[] args) {
        sorting_algos sort = new sorting_algos();
        int[] arr = { 13, 46, 24, 52, 20, 9 };
        sort.bubble_sort(arr, 6);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ",");
        }
        System.out.println();
    }
}
