public class Array_assignment_8 {
    
    public static int findArray( int arr[],int target){
        for(int i=0;i<arr.length-1;i++){
             int sum=arr[i]+arr[i+1];
             
             if(target==sum){
                System.out.println("Both Element:-"+arr[i]+" "+arr[i+1]);
                return target;
             }
        }
        return -1;
   
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        int target=11;
        int result=findArray(arr,target);
        System.out.println("Result:-"+result);

    }
}
