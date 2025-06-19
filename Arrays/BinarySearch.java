public class BinarySearch {
    public static int binarySearch(int[] arr, int target) {
        if (arr.length == 0) {
            throw new IllegalArgumentException("Array is empty");
        }
        int lb = 0;
        int ub = arr.length - 1;
        while (lb <= ub) {
            int mid = lb + (ub - lb) / 2; // To avoid overflow
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                lb = mid + 1;
            }
            else {
                ub = mid - 1;
            }
        }
                return -1; // Element not found
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target = 5;
        int result = binarySearch(arr, target);
        if (result == -1) {
            System.out.println("Target element " + target + " not found in the array.");
        } else {
            System.out.println("Target element " + target + " found at index: " + result);
        }
    }
}
