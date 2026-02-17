
public class secondLargest {
    public static void main(String[] args) {

        int arr[] = { 20, 30, 44, 56, 26, 99, 82, 22, 21 };
        int largest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                second = largest;
                largest = arr[i];
            } else if (arr[i] > second && arr[i] != largest) {
                second = arr[i];
            }

        }
        System.out.println("Second Largest:" + second);
    }
}
