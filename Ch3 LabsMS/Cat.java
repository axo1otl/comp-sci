public class Cat {
    // instance data
    private String name;
    private int numLegs;
    private double weight;
    private int chonkness;
    
    // default constructor
    public Cat() {
        name = "";
        numLegs = 0;
        weight = 0.0;
        chonkness = 0;
    }
    
    public Cat(String n, int l, double w, int c) {
        name = n;
        numLegs = l;
        weight = w;
        chonkness = c;
    }
    
    public void speak() {
        System.out.println(name + " says: Meow!");
    }
    
    public void feed() {
        System.out.println(name + " has been fed. They say thanks!");
    }
}