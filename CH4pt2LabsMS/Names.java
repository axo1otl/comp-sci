public class Names{ // class header
    String fName;
    String mName;
    String lName;
    
    public Names(String fN,String mN,String lN){
        fName = fN;
        mName = mN;
        lName = lN;
    }
    public String getFirst(){
        return(fName);
    }
    public String getMiddle(){
        return(mName);
    }
    public String getLast(){
        return(lName);
    }
    public String toString(){
        return(fName + " " + mName + " " + lName);
    }
}