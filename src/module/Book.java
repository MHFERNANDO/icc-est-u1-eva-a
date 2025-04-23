package module;
public class Book {
    private String name;
    private int year;

    public Book(String name, int year){
        this.name=name;
        this.year=year;
    }
    public String getName (){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getYear(){
        return year;
    }


    public String toString(){
        return "Nombre: "+name+" Año: "+year;
    }


}
