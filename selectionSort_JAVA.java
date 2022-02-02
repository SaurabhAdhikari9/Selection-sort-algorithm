import java.util.Arrays;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class selectionSort_JAVA {

    //->  sort method that has two parameters:
    //-> list of data that need to sort, sorting order (ascending or descending)
    public static void sort(int array[], int order){
        int min;
        for(int i =0; i < array.length; i++){
            // min stand for the minimum, which has hold the 0 index number. 
            // of the number that needs to be in the staring of the list.
            min = i;

            for(int j = i+1; j<array.length; j++){
                if(order == 1){
                    // comparing the value of index i and j i.e. i+1
                    if(Integer.toString(array[j]).compareTo(Integer.toString(array[min])) > 0){
                        // if index j value is greater than the index value min, than min assign with j
                        min = j;
                    }
                }
                else {
                    if(Integer.toString(array[j]).compareTo(Integer.toString(array[min]))<0){
                        // if index j value is smaller than the index value min, than min assign with j
                        min = j;
                    }
                }
            }
            // swaping the values in the list.
            int temp = array[min];
            array[min] = array[i];
            array[i] = temp;
            
        }
    }
    public static void main(String[] args) {
        int array[] = {5,3,2,7,1,9};
        // argument array is the list of number
        // argument 0 means sort the list in ascending order
        // argument 1 means sort the list in descending order
        sort(array,0);
        System.out.println(Arrays.toString(array));
    }
}