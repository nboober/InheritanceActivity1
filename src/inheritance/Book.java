package inheritance;

public final class Book extends Product {

    private String author;
    private int pages;

    public Book(String code, String description, String author, int pages, double price){
        super(code, description, price);
        this.author = author;
        this.pages = pages;
    }

    @Override
    public String toString() {
        return  "Code:               " + this.code + "\n" +
                "Description:        " + this.description + "\n" +
                "Author:             " + this.author + "\n" +
                "Pages:              " + this.pages + "\n" +
                "Price:              " + this.getFormattedPrice(this.price) + "\n";
    }



}
