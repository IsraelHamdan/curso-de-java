package entities;

import java.text.DecimalFormat;

public class EstoqueProduto {
    public String name;
    public double price;
    public int quantity;

    public double totalValueInStock(){
        double valor = price * quantity;
        
        return  valor;
    }

    public void addProducts (int quantity){
        this.quantity += quantity;
    }

    public void removeProducts(int quantity) {
        this.quantity -= quantity;
    }


    @Override
    public String toString() {
        return name +  " $" + String.format("%.2f", price) + ", " + quantity + " units, " + '$' + totalValueInStock() ;
    }

}
