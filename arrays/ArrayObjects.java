import java.util.Scanner;

public class ArrayObjects {
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ArrayClass ac1 = new ArrayClass(200, "Masood", "Oxford");
    ArrayClass ac2 = new ArrayClass(201, "Athira", "KV INS");

    System.out.println(ac1.toString());
    System.out.println(ac2.toString());


    ArrayClass[] arc = new ArrayClass[3];

    for(int i = 0; i < arc.length; i++){
        arc[i] = new ArrayClass(sc.nextInt(), sc.nextLine(), sc.nextLine());
    }

    for (ArrayClass arrayClass : arc) {
        System.out.println(arrayClass.toString());
    }
    // ac.sid = 200;
    // ac.sname = "Masood";
    // ac.univ = "Presidency";

    // System.out.println(ac.toString());

    
 }   

}

class ArrayClass {
    
    int sid;
    String sname;
    String univ;

    
    
    public ArrayClass(int sid, String sname, String univ) {
        this.sid = sid;
        this.sname = sname;
        this.univ = univ;
    }



    @Override
    public String toString() {
        return "ArrayClass [sid=" + sid + ", sname=" + sname + ", univ=" + univ + "]";
    }

    
}

