package Chapter7;

/**
 * Created by averychen on 3/10/17.
 */
public class LinearSearch {

    public static void main(String[] args) {
        //declaring and creating array size 5
        int[] list = {10, 20, 50, 65, 70};

        //searching for given key int and obtaining index value
        int i = linearSearchGetIndex(list, 20);

        //printing the obtained index position
        System.out.println("index position: " + i);

        //same
        int j = linearSearchGetIndex(list, 22);

        System.out.println("index position: " + j);
    }
    //method to search for key in given array and return its index position
    //if key does not exist in array, return -1 (index position not found)
    public static int linearSearchGetIndex(int[] list, int key) {

        //loop through array and compare elements with key
        for (int i = 0; i < list.length; i++){

            //if key is equal to array element, key is found and we return that index position
            if (key==list[i]){

                return i;
            }
        }
        //if key was not found, loop exits which means that the key doesn't exist in the array
        //note that index position always starts from zero
        return -1;
    }
}
