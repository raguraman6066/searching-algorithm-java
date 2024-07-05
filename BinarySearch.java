public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 6, 8, 10 };
        int element = 8;
        int result = binarySearch(arr, element);
        System.out.println(result);
    }

    static int binarySearch(int[] arr, int element) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;

            if (arr[mid] == element) {
                return mid;
            }
            if (arr[mid] > element) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }
}

// time complexity- O(log n)