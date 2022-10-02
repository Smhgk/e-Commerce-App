
package eCommerce;

public class Order {
    private User userOrdering;
    private Product productOrdered;
    private CreditCard cardPayed;

    public Order(User userOrdering, Product productOrdered,int orderNum) {
        this.userOrdering = userOrdering;
        this.productOrdered = productOrdered;
        this.cardPayed = userOrdering.getUserCreditCard();
        orderProcess(orderNum);
    }

    public User getUserOrdering() {
        return userOrdering;
    }

    public void setUserOrdering(User userOrdering) {
        this.userOrdering = userOrdering;
    }

    public Product getProductOrdered() {
        return productOrdered;
    }

    public void setProductOrdered(Product productOrdered) {
        this.productOrdered = productOrdered;
    }

    public CreditCard getCardPayed() {
        return cardPayed;
    }
    private void orderProcess(int orderNum){
     userOrdering.productOrder(productOrdered, orderNum);
}
    
    }
    
    

