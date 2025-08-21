
public class IfElse {
    public static void main(String[] args) {

        // if statement
        int x = 20;
        int y = 18;
        if (x > y) {
            System.out.println("x is greater than y");
        }

        // if-else statement
        int time = 20;
        if (time < 18) {
            System.out.println("Good day.");
        } else {
            System.out.println("Good evening.");
        }

        // if-else-if statement
        int timee = 22;
        if (timee < 10) {
            System.out.println("Good morning.");
        } else if (timee < 18) {
            System.out.println("Good day.");
        } else {
            System.out.println("Good evening.");
        }

        // Switch Statement
        int day = 4;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        }

        
    }
}
