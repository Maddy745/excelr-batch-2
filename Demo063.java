public class Demo063 {
    public static void main(String[] args){
        int arr[] = {};
        if(arr.length>=1){
            int sum = arr[0]+arr[arr.length-1];
            System.out.println(+sum);
        } else {
            System.out.println("null");
        }
    }
    
}
