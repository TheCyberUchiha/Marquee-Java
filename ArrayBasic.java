
public class ArrayBasic{
    public static void main(String[] args) {
        //way 1 to create array
        int[] arr=new int[5];
        //System.out.println(arr[1]);
        arr[0]=14;
        arr[1]=27;
        arr[2]=13;
        arr[3]=41;
        arr[4]=378;
      //  arr[5]=30; if i run this interpreter will throw error , logical error , exception error
        System.out.println(arr[1]);

        for(int i = 0;i<5;i++){
            System.out.println(arr[i]);
        }


        int[] arr2={14,27,13,41};
        System.out.println(arr2[3]);
         for(int i = 0;i<arr2.length;i++){
            System.out.println(arr[i]);
        }

    }
}





