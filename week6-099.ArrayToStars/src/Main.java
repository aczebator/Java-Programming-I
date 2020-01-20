
public class Main {

    public static void main(String[] args) {
        // test the method here
        int[] array = {5, 1, 3, 4, 2};
        printArrayAsStars(array);
    }

    public static void printArrayAsStars(int[] array) {
    int num = 0; 
        for(int r = 0; r <= array.length -1; r++){   
            for (int i = 0; i <= array[num]-1; i++ )
            {
               System.out.print("*");
            }
            System.out.println("");
            num++;
        }
        //System.out.println(array[0]);
        //System.out.println(array[1]);
    }
}
