public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {50, 10, 40, 20, 30};

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        System.out.println("Sorted array:");
        for (int n : arr) {
            System.out.print(n + " ");
        }
