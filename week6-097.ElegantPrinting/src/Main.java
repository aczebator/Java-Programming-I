
public class Main {

    public static void main(String[] args) {
        // test method here
        int[] array = {5, 1, 3, 4, 2};
        printElegantly(array);
    }

    public static void printElegantly(int[] array) {
    int i = 0;      
// Write code here
//int sum = 0;
for (int number : array)   {
   System.out.print(number);
    i++; 
    if (i < array.length) {
        System.out.print(", "); 
}   
        
    
}
    }
}
