
public class WhileLoop {
    public static void main(String[] args) {
        // The while loop loops through a block of code as long as a specified condition
        // is true.
        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i++;
        }

        // Do-While Loop
        //The do/while loop is a variant of the while loop. This loop will execute the code block once, before checking if the condition is true. Then it will repeat the loop as long as the condition is true.
        int j = 0;
        do {
            System.out.println(j);
            j++;
        } while (j < 5);
    }
}
