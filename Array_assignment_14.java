public class Array_assignment_14 {
    static void merge(int[][] arr) {

        // Step 1: Sort intervals based on starting time
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i][0] > arr[j][0]) {
                    // swap
                    int temp1 = arr[i][0];
                    int temp2 = arr[i][1];

                    arr[i][0] = arr[j][0];
                    arr[i][1] = arr[j][1];

                    arr[j][0] = temp1;
                    arr[j][1] = temp2;
                }
            }
        }

        // Step 2: Merge intervals
        int start = arr[0][0];
        int end = arr[0][1];

        for (int i = 1; i < arr.length; i++) {

            if (arr[i][0] <= end) {  
                // Overlapping
                if (arr[i][1] > end) {
                    end = arr[i][1];
                }
            } else {
                // Print previous interval
                System.out.println(start + " " + end);

                start = arr[i][0];
                end = arr[i][1];
            }
        }

        // Print last interval
        System.out.println(start + " " + end);
    }

    public static void main(String[] args) {

        int[][] intervals = {
            {1, 3},
            {2, 6},
            {8, 10},
            {15, 18}
        };

        merge(intervals);
    }
}
