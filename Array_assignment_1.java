public class Array_assignment_1 {

    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 5, 6};
        int temp = 1; 

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] != temp) {
                System.out.println("Missing number is: " + temp);
                break;
            }
            temp++;
        }       
    }
}