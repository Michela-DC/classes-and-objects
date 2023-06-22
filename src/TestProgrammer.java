//create a Java tester class called TestProgrammers where you:
//create 2 Programmer objects (class instance)
//define the state of the objects by assigning values to the instance variables
//call the drinkCoffee() and printDetails() methods for the first Programmer object
//call the printDetails() and hasGlasses() methods for the second Programmer object

public class TestProgrammer {
    public static void main(String[] args){

        Programmer firstProgrammer = new Programmer("Marco Rossi", 27, true);
        Programmer secondProgrammer = new Programmer("Elena Bianchi", 30, false);

        firstProgrammer.drinkCoffe();
        firstProgrammer.printDetails();

        System.out.println(" ");

        secondProgrammer.printDetails();
        secondProgrammer.hasGlasses();
    }
}
