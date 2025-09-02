

public class ClassAndObject {
    public static void main(String[] args) {
        Human h = new Human();
        h.age = 23;
        h.name = "Masood";
        h.place = "Bangalore";
        
        h.details();
        h.function();
    }
    
}


class Human{
    String name;
    int age;
    String place;

    public void function(){
        System.out.println("Human Function and Method");
    }

    public void details(){
        System.out.println("Human name : " + name + " Human age : "+ age + " Human place: " + place);
    }
}
