public class Test {
    public static void main(String[] args) {
        // Default Cat
        Cat chonko = new Cat();
        Cat dingus = new Cat("Dingus", 4, 13.7, 2);
        
        chonko.speak();
        dingus.speak();
        
        chonko.feed();
        dingus.feed();
    }
}