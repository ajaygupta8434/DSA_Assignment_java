public class Array_assignment_6 {
    
    public static int findMaxConsecutiveOnes(int[] arr) {

        int count = 0;
        int max = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == 1) {
                count++;          // consecutive 1s badhao
                if (count > max) {
                    max = count;  // max update karo
                }
            } else {
                count = 0;        // 0 mila to reset
            }
        }

        return max;
    }

    public static void main(String[] args) {

        int[] arr = {1, 0, 1, 1, 1, 1};

        int result = findMaxConsecutiveOnes(arr);

        System.out.println("Maximum Consecutive Ones: " + result);
    }
}