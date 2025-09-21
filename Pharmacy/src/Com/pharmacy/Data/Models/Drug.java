package Com.pharmacy.Data.Models;

import java.time.LocalDate;

public class Drug{
    private int id;
    private String name;
    private Type type;
    private Category category;
    private LocalDate expiryDate;
    private LocalDate manufactureDate;

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public void setManufactureDate(LocalDate manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    public void setExpiryDate(LocalDate expiryDate) {
        this.expiryDate = expiryDate;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId (){
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Type getType (){
        return type;
    }

    public LocalDate getExpiryDate(){
        return expiryDate;
    }

    public LocalDate getManufactureDate(){
        return manufactureDate;
    }

    @Override
    public String toString(){
        return "Drug{id = "+ getId() + ", + name = " + getName() + "}";
    }
}




