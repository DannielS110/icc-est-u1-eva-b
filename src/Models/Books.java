package Models;

public class Books {
    
    private int year;
    private String name;

    public Books(int year, String name) {
        this.year = year;
        this.name = name;
    }

    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
 
    @Override

    public  toString(){
     System.out.println("Books: "+name+year);
       return Books;
    }

}
