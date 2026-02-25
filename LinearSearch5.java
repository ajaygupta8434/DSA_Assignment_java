public class LinearSearch5 {
    static int[] search2D(int[][] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == target) return new int[]{i, j};
            }
        }
        return null; // Not found
    }

    public static void main(String[] args) {
        int[][] arr = {{1, 2}, {3, 4}, {5, 6}};
        int target = 4;
        int[] result = search2D(arr, target);
        if (result != null)
            System.out.println("Found at: (" + result[0] + "," + result[1] + ")");
        else
            System.out.println("Not Found");
    }
}