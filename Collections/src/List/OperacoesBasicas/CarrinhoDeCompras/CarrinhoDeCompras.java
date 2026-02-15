package List.OperacoesBasicas.CarrinhoDeCompras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    List<Item> itemsList = new ArrayList<>();

    
    public void adicionarItem(String name, double price, int quantity){
       this.itemsList.add(new Item(name, price, quantity));
    }

    public void removerItem(String nome) {
         List<Item> itemsListParaRemover = new ArrayList<>();
         for (Item item: this.itemsList ){
            if (item.getName().equalsIgnoreCase(nome)) {
                itemsListParaRemover.add(item);
            }
         }
         this.itemsList.removeAll(itemsListParaRemover);
    }

    public Double calcularValorTotal() {
        double total = 0.0;
         for(Item prices: this.itemsList){
             total += prices.getQuantity() * prices.getPrice();
         }
         return total;
    }

    public void exibirItens() {

//        System.out.println("Lista: " + this.itemsList);
        if (this.itemsList.isEmpty()) {
            System.out.println("Nenhum item encontrado!");
        }else {
            for(Item item: this.itemsList){
                System.out.println("Nome: " + item.getName() + " - R$ " + item.getPrice() + " Quantidade: " + item.getQuantity());
            }
        }

    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras =  new CarrinhoDeCompras();
        carrinhoDeCompras.adicionarItem("Banana", 10, 2);
        carrinhoDeCompras.adicionarItem("Banana", 10, 2);
        carrinhoDeCompras.adicionarItem("Apple", 10, 2);
        carrinhoDeCompras.exibirItens();
        System.out.println("Total " + carrinhoDeCompras.calcularValorTotal());
        carrinhoDeCompras.removerItem("Banana");
    }


}
