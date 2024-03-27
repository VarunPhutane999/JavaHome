package problem3;

public class Main {
    public static void main(String[] args) {
    	
        Warrior arthur = new Warrior("Arthur", 5, 100, 30);
        Mage merlin = new Mage("Merlin", 5, 60, 100);


        arthur.displayInfo();
        arthur.attack();

        merlin.displayInfo();
        merlin.attack();

    }
    
}
