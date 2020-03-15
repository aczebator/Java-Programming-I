
import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        // write testcode here}
int[] values = {8, 3, 7, 9, 1, 2, 4};
sort(values);

    }
    public static int smallest(int[] array) {
    int small = array.length+1; 
    for (int i = 0; i< array.length; i++)  {
        if (small > array[i]){
             small = array[i];
        }
    } 
    return small;    
    }

 public static int indexOfTheSmallest(int[] array) {
    // code goes here
   int smallest = smallest(array);
   int index = 0;
    for (int i = 0; i< array.length; i++)  {
        if (array[i]== smallest){
             index = i;
        }
    } 
  
   return index;
}
 public static int indexOfTheSmallestStartingFrom(int[] array, int index) {
    // write the code here
   int startingFrom = index;   
    for (int i = index; i< array.length; i++)  {
        if (array[startingFrom] > array[i]){
             startingFrom = i;
        }
    }    
    return startingFrom;
}
   public static void swap(int[] array, int index1, int index2) {
        int index1OldValue = array[index1];
        array[index1] = array[index2];
        array[index2] = index1OldValue;
    }
  public static void sort(int[] array) {
      for (int i = 0; i < array.length; i++){
          swap(array, indexOfTheSmallestStartingFrom(array, i),i);
          System.out.println(Arrays.toString(array));
      }
}
}