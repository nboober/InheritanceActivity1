package inheritance;

public class Main {
    public static void main(String[] args){

            /*
                The product class cannot be instantiated now because
                it is declared as abstract
             */
//        Product p = new Product("01589", "Book", 26.59);
//        System.out.println(p.toString());
        Book b = new Book("01595", "Book 2", "J.K. Rowling", 254, 24.99);
        System.out.println(b);
        Software s = new Software("99546", "Microsoft Office Suite", "N/A", "Microsoft", "Windows", 300.00);
        System.out.println(s);
    }

}
