

public class Methods {
    public static void main(String[] args) {
        message();
        
        System.out.println(greetingMessage("Masood Nawaz"));
        int result = add(10,20);
        int res = add(10, 20,30);

        System.out.println("Result of two parameter add method: " + result);
        System.out.println("Result of three parameter add method: " + res);


    }


    public static void message(){
        System.out.println("This is an method");
    }

    public static String greetingMessage(String name){
        return ("Welcome to Spring course, "+ name);
    }

    
    public static int add(int a, int b){
        return a + b;
    }

    //Method Overloading (Same method name as above with different parameters)
    public static int add(int a, int b, int c){
        return a + b + c;
    }
}
