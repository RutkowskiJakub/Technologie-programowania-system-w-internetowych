
package Main;

public class Product {
    Integer id;
    String name;
    Double price;
    String category;


    public Product (Integer id, String name, Double price, String category)
    {
        this.id = id;
        this.name = name;
        this.price = price;
        this.category = category;
    }
    public Integer getId()
    {
        return id;
    }
    public String getName()
    {
        return name;
    }
    public Double getPrice()
    {
        return price;
    }
    public String getCategory()
    {
        return category;
    }
    
    
    @Override
    public String toString()
    {
//        String c = Double.toString(price);
//        String d = Integer.toString(id);
        return "id: " + id + " nazwa: " + name + " Cena: " + price + " kategoria: " + category;
    }
}