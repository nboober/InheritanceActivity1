package inheritance;

public class Product {

    private String code = "";
    private String description = "";
    private double price = 0;
    protected static int count = 0; // a protected static variable

    public Product(){

    }

    public Product(String code, String description, double price) {
        this.code = code;
        this.description = description;
        this.price = price;
    }

    // Get and set accessors for the code, description, and price instance variables

    @Override
    public String toString() {
        return  "Code:               " + this.code + "\n" +
                "Description:        " + this.description + "\n" +
                "Price:              " + this.getFormattedPrice(this.price) + "\n";
    }

    private String getFormattedPrice(double price) {
        // Use the NumberFormat class to format the price to 2 decimal places
        return String.format("#.00", price);
    }

    // Create public access for the count variable
    public static int getCount() {
        return count;
    }
}
