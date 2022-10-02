
package eCommerce;

public class ECommerce {

    public static void main(String[] args) {
        
        CreditCard c1 = new CreditCard("5785878798765467","Ahmet",999,"17/24");
        User u1 = new User("u1account","Ahmet","Kaya","17/09/1997","1657890abc","testemail@hotmail.com","İzmir",c1);
        Product p1 = new Product("MSI Monitor","Black","Electronic Devices",12,7,"Gaming Monitor for gamers");
        Product p2 = new Product("Asus Monitor","White","Electronic Devices",20,5,"Work Monitor for workers");
        Order orderProcess = new Order(u1,p1,6);
        System.out.println("Your last stock for this product: " + p1.getProductStock());
        Order orderProcess2 = new Order(u1,p1,7);
        Order orderProcess3 = new Order(u1,p2,15);
        System.out.println("Your last stock for this product: " + p2.getProductStock());
        u1.productFavourite(p1);
        u1.productFavourite(p2);
        System.out.println("Your favourite products are: " + u1.getFavouriteProduct());
    }
    
}
