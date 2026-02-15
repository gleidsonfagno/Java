package List.OperacoesBasicas.CarrinhoDeCompras;

public class Item {
    private String name;
    private double price;
    private int quantity;

    public Item (String name,  double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return this.name;
    }

    public String setName(String name){
        return this.name = name;
    }

    public double getPrice() {
        return this.price;
    }

    public double setPrice(double price){
        return this.price = price;
    }
    
    public int getQuantity() {
        return this.quantity;
    }

    public int setQuantity(int quantity){
        return this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}
