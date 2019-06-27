package inheritance;

public class Software extends Product {

    private String programmer;
    private String platform; // linux, mac, or pc
    private String os;

    public Software(String code, String description, String programmer, String platform, String os, double price) {
        super(code, description, price);
        this.programmer = programmer;
        this.platform = platform;
        this.os = os;
    }

        @Override
        public String toString() {
            return  "Code:               " + this.code + "\n" +
                    "Description:        " + this.description + "\n" +
                    "Programmer:         " + this.programmer + "\n" +
                    "Platform:           " + this.platform + "\n" +
                    "OS:                 " + this.os + "\n" +
                    "Price:              " + this.getFormattedPrice(this.price) + "\n";

    }

}
