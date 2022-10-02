
package eCommerce;

import java.util.ArrayList;

public class User {
    
    private String username;
    private String name;
    private String surname;
    private String dateOfBirth;
    private String password;
    private String email;
    private String addresses;
    private Product productOrdered;
    private ArrayList<String> favouriteProduct;
    private CreditCard userCreditCard;

    public User(String username, String name, String surname, String dateOfBirth, String password, String email, String addresses, CreditCard userCreditCard) {
        this.username = username;
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
        this.password = password;
        this.email = email;
        this.addresses = addresses;
        this.userCreditCard = userCreditCard;
        this.favouriteProduct = new ArrayList<>();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddresses() {
        return addresses;
    }

    public void setAddresses(String addresses) {
        this.addresses = addresses;
    }

    public CreditCard getUserCreditCard() {
        return userCreditCard;
    }
    
    public Product getProductOrdered() {
        return productOrdered;
    }

    public ArrayList<String> getFavouriteProduct() {
        return favouriteProduct;
    }


    public void setUserCreditCard(CreditCard userCreditCard) {
        this.userCreditCard = userCreditCard;
    }
    
    public void productOrder(Product p1,int orderNum){
        p1.stockControl(orderNum);
        productOrdered = p1;
        
    }
    public void productFavourite(Product p2){
        favouriteProduct.add(p2.getProductName());
       
    }

    
    
}
