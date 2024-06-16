
package Controller;

public class addProductController {
    public void products(/*int id,*/ String name, float price, int quantity, String category, String description){
        new Model.addProduct().addProduct(/*id,*/ name, price, quantity, category, description);
    }
}

