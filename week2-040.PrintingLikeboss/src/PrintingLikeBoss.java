public class PrintingLikeBoss {

    // copy or rewrite the method of Assignment 39.1 here
    public static void printStars(int amount) {
    int i = 0;
    
    while (i < amount){
        System.out.print("*");
        i++;
        }
        System.out.println("");
    }
    public static void printWhitespaces(int amount) {
        // 40.1
        int i = 0;
            while(amount > i){
                System.out.print(" ");
                i++;
                }
}
    public static void printTriangle(int size) {
        // 40.2
    int i = 0;
    int white = size - 1;
    int star = 1;
    
    while (i < size){
        printWhitespaces(white);
            white--;
        printStars(star);
            star++;
       // System.out.println("");
        i++; 
    }

    }

    public static void xmasTree(int height) {
        // 40.3
        int h = height - 1;
        int stand = height - 2;
        int s =1;
        
        while (height > 0){
            printWhitespaces(h);
            printStars(s);
            s +=2;
            h --;
            height --;
                    
        }
        printWhitespaces(stand);
        printStars(3);
        printWhitespaces(stand);
        printStars(3);
    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!
        //System.out.println("---");
         //   printWhitespaces(10);
       // System.out.println("---");
        //    printStars(5);
      //  System.out.println("---");
          
        printTriangle(4);
        System.out.println("---");
        printTriangle(5);
       System.out.println("---");
        xmasTree(4);
       System.out.println("---");
       xmasTree(10);
    }
}
