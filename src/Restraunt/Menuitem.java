package Restraunt;
import java.util.Date;


public class Menuitem {
    private String name;
    private double price;
    private String description;
    private String category;
    private Date dateAdded;
    private boolean newNess;


    public Menuitem(String name, double price, String description, String category, Date dateAdded) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.category = category;
        this.dateAdded = dateAdded;
        this.newNess = true;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Date getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(Date dateAdded) {
        this.dateAdded = dateAdded;
    }

    public boolean isNewNess() {
        return newNess;
    }

    public void setNewNess(boolean newNess) {
        this.newNess = newNess;
    }
}
