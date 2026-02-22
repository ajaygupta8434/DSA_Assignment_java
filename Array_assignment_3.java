public class Array_assignment_3 {
     public static void moveZeros(int arr[]){
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                arr[j]=arr[i];
                j++;
            }
        }
        while (j<arr.length) {
             arr[j]=0;
             j++;
        }

     }
 public static void main(String[] args) {
    int[] arr = {0, 1, 0, 3, 12};

        moveZeros(arr);
  System.out.println("Affter Moc=veing Zeroes:-");
   for(int j=0;j<arr.length;j++){
    System.out.println(arr[j]);
   }

 }
}
