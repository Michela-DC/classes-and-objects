//Create a Java class called Programmer
//The Programmer class will have the following instance variables:
//name as a string
//age as an integer
//wearsGlasses as a boolean
//The Programmer class will have the following methods:
//drinkCoffe() - that prints in console Espresso is the secret!
//printDetails() - that prints in console NameHere is a AgeHere-yo programmer
//hasGlasses - that prints in console Is NameHere wearing glasses? followed by the value of the dedicated variable
//create a Java tester class called TestProgrammers where you:
//create 2 Programmer objects (class instance)
//define the state of the objects by assigning values to the instance variables
//call the drinkCoffee() and printDetails() methods for the first Programmer object
//call the printDetails() and hasGlasses() methods for the second Programmer object

public class Programmer {
    private String name;
    private int age;
    private boolean wearsGlasses;

    public Programmer(String name, int age, boolean wearsGlasses) {
        this.name = name;
        this.age = age;
        this.wearsGlasses = wearsGlasses;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean getWearGlasses() {
        return wearsGlasses;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWearsGlasses(boolean wearsGlasses) {
        this.wearsGlasses = wearsGlasses;
    }

    // Methods
    //drinkCoffe() - that prints in console Espresso is the secret!
    public void drinkCoffe() {
        System.out.println("Espresso is the secret!");
    }

    //printDetails() - that prints in console NameHere is a AgeHere-yo programmer
    public void printDetails() {
        System.out.println(name + " is a " + age +" years old programmer");
    }

    //hasGlasses - that prints in console Is NameHere wearing glasses? followed by the value of the dedicated variable
    public void hasGlasses() {
        System.out.println("Is " + name + " wearing glasses? " + wearsGlasses);
    }
}