import java.util.Arrays;
public class Sorting{
    public static void main(String[] args ){
        int arr[] = {2,1,3,0,4};
        Arrays.sort(arr);
        for(int i = 0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}