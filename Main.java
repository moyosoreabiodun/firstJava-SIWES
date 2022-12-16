public class Main{
    static void firstMethod() { //method without parameter
        System.out.println("This is contained in a method");
    }
    static void secondMethod(String fname, int age){ //method with parameter
        System.out.println(fname + " Abiodun is " + age + " yaers old.");
    }
    static int thirdMethod(int x, int y){ //method with return value
        return x + y;
    }
    public static int factorial(int n){ //recursive function
        if (n > 0){
            return n + factorial(n-1);
        }else {
            return 0;
        }
    }
    public static void main(String[] args){ //main method

        System.out.println("Hello World"); // print string
        System.out.println("I am learning Java. It is simple so far");
        System.out.println(9 + 9); //print sum of numbers

        System.out.print("This should print on the same line "); //printing on same line as opposed to a new line
        System.out.print("as this. \n");

        String name = "Moyosore"; //print variable
        System.out.println(name);

        int num = 15;
        num = 20; //reassigning variables. use 'final' before 'int' if you don't want the variable reassigned i.e to make it a constant
        int num2 = 25;
        System.out.println(num + num2);
        System.out.println(num2 > num); //boolean expression. returns true
        System.out.println(num2 == num); //boolean expression. returns false

        int x = 5, y = 10, z = 15; //assigning multiple variables in one line
        System.out.println(x + y + z);

        int a, b, c; //declaring variables
        a = b = c = 15; //then assigning them later to the same value
        System.out.println(a + b + c);

        float f1 = 35e3f; //float is used for exponential numbers
        double d1 = 12E4d; //double too
        System.out.println(f1);
        System.out.println(d1);

        char myGrade = 65; //using ascii value for characters
        char highestGrade = 'A';
        System.out.println(highestGrade);
        System.out.println(myGrade);

        String specialCharacter = "We are the so called \"Vikings\" from the north."; // special character: double quotes
        System.out.println(specialCharacter);

        System.out.println(Math.abs(-5.92)); //returns absolute value i.e removes the negative

        double randomNumber = Math.random(); //generates a random number between 0 & 1 (not including 1)
        randomNumber = (int) (randomNumber * 10); // generates a random number between 0 & 10 (not including 10) and converts it to integer or whole number
        System.out.println(randomNumber);

        int age = 21; //ternary if-else
        String oldEnough = (age >= 18) ? "You are old enough to drive." : "Please go and read your books, small child.";
        System.out.println(oldEnough); 

        firstMethod(); //calling method without parameter

        secondMethod("Moyosore", 21); //calling method with parameter
        secondMethod("Ayokunmi", 20);

        int sum = thirdMethod(4, 5); //calling method with return value
        System.out.println(sum);

        int summation = factorial(10); //calling a recursive function
        System.out.println(summation);

        int summationAgain = factorialAgain(5, 10); //calling a recursive function again
        System.out.println(summationAgain);
    }
    public static int factorialAgain(int start, int end){ //recursive function again
        if(start == end){
            return end;
        }else{
            return end + factorialAgain(start, end - 1);
        }
    }
}
