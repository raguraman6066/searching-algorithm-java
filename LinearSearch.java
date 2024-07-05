public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 6, 1, 8, };
        int element = 81;
        int result = linearSearch(arr, element);
        System.out.println(result);
    }

    static int linearSearch(int[] arr, int element) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                return i;
            }
        }
        return -1;
    }
}
// time complexity - O(n)