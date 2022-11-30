public class BandBooster{ // class header
    String name = "";
    int boxes = 0;
    
    public BandBooster(String studentName){
        name = studentName;
        boxes = 0;
    }
    public String getName(){
        return(name);
    }
    public void updateTotal(int newSales){
        boxes = boxes + newSales;
    }
    public String toString(){
        return("" + name + ": " + boxes + " sold");
    }
}