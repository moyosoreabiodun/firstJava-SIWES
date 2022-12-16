abstract class Fruit{ //abstract class that can only be accessed via inheritance
    abstract void fruitShape(); //abstract method that can only have a body in its subclass
    public void fruitTaste(String fruit, String taste){ //regular method with parameters
        System.out.println(fruit + " tastes like " + taste + ".");
    }
}
class Mango extends Fruit{ //subclass of Fruit
    public void fruitShape(){ //body of abstract method
        System.out.println("Mango is shaped like a bean.");
    }
}
// import java.util.Scanner; //import the scanner class

class Main{
    public static void main(String [] args){
        Mango firstMango = new Mango(); //object of class Mango, Fruit object cannot be created 'cause it's abstract
        firstMango.fruitShape();
        firstMango.fruitTaste("Mango", "trash");
        Courses myCourse = Courses.COMPUTERSCIENCE; //accessing enum constants
        System.out.println(myCourse);

        // Scanner myObj = new Scanner(System.in); //create a new scanner object
        // String userName;

        // System.out.println("Enter Username"); //enter username & press enter
        // userName = myObj.nextLine(); //next line is a method of the scanner class used to read string
        // System.out.println("Your username is " + userName);
    }
}
enum Courses{ //create Enum
    COMPUTERSCIENCE,
    MEDICINE,
    ENGLISH
}