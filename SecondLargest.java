public class SecondLargest {

    public static int findSecondLargest(int[] arr) {

        if (arr.length < 2) {
            System.out.println("Array me kam se kam 2 elements hone chahiye");
            return -1;
        }

        int largest = arr[0];
        int secondLargest = arr[1];

        // Pehle 2 elements ko compare karke set karo
        if (secondLargest > largest) {
            int temp = largest;
            largest = secondLargest;
            secondLargest = temp;
        }

        // Ab baaki elements check karo
        for (int i = 2; i < arr.length; i++) {

            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            }

            else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }

        return secondLargest;
    }

    public static void main(String[] args) {

        int[] arr = {10, 5, 20, 30};

        int result = findSecondLargest(arr);

        System.out.println("Second Largest Element: " + result);
    }
}