public class LinearSearch4 {
    public static void main(String[] args) {
        int[] arr = {5, 1, 7, 3, 9};
        int min = Integer.MAX_VALUE, secondMin = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE, secondMax = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num < min) {
                secondMin = min;
                min = num;
            } else if (num < secondMin && num != min) {
                secondMin = num;
            }

            if (num > max) {
                secondMax = max;
                max = num;
            } else if (num > secondMax && num != max) {
                secondMax = num;
            }
        }

        System.out.println("Min: " + min + ", Second Min: " + secondMin);
        System.out.println("Max: " + max + ", Second Max: " + secondMax);
    }
}