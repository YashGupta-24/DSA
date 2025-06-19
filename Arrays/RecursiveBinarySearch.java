public class RecursiveBinarySearch {
    public static int recursiveBinarySearch(int[] arr, int lb, int ub, int target) {
        if (lb <= ub) {
            int mid = lb + (ub - lb) / 2; // To avoid overflow
            if (arr[mid] == target) {
                return mid; // Element found
            } else if (arr[mid] < target) {
                return recursiveBinarySearch(arr, mid + 1, ub, target); // Search in the right half
            } else {
                return recursiveBinarySearch(arr, lb, mid - 1, target); // Search in the left half
            }
        }
        return -1; // Element not found
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int target = 5;
        int result = recursiveBinarySearch(arr, 0, arr.length - 1, target);
        if (result == -1) {
            System.out.println("Target element " + target + " not found in the array.");
        } else {
            System.out.println("Target element " + target + " found at index: " + result);
        }
    }
}
