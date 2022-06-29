import java.util.HashMap;

public class UnionOfTwoArrays {
//get two arrays
    public static int unionOfTwoArrays(int arr1[], int arr2 []){
        HashMap<Integer, Boolean> map = new HashMap<>();
        //put one array in map
        for(int i= 0; i<arr1.length; i++){
            map.put(arr1[i], true);
        }
        // now put second one , in this case the duplicate keys will not be stored.
        for(int i = 0; i<arr2.length; i++){
            map.put(arr2[i], true);

            //now print the size , as the map contains all the distinct elements now
        }return map.size();
    }

    public static void main(String[] args) {

    }
}
