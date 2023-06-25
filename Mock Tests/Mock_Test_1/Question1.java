import java.util.Arrays;

public class Question1 {
   public static void addAllZerosAtEnd(int arr[]){

        int i=0; 
        int j=arr.length-1;
        while(i<j)
        {
            if(arr[i]==0)
            {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
            }
            else if(arr[j]==0)
            {
                j--;
            }
            else{
                i++;
            }
        }
   }
    public static void main(String[] args) {
        int nums[] = {1,0,1,0,3,12};
        addAllZerosAtEnd(nums);

        System.out.println(Arrays.toString(nums));
    }
}
