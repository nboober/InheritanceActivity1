package inheritance;

public class Main {
    public static void main(String[] args){

        Product p = new Product("01589", "Book", .50);
        System.out.println(p.toString());
        Book b = new Book();
        Software s = new Software();

    }

}
