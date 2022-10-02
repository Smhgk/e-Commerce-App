
package eCommerce;


public class CreditCard {
    private String creditCardNumber;
    private String creditCardUser;
    private int securityCode;
    private String expirationDate;

    public CreditCard(String creditCardNumber, String creditCardUser, int securityCode, String expirationDate) {
        this.creditCardNumber = creditCardNumber;
        this.creditCardUser = creditCardUser;
        this.securityCode = securityCode;
        this.expirationDate = expirationDate;
    }

    public String getCreditCardNumber() {
        return creditCardNumber;
    }

    public void setCreditCardNumber(String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    public String getCreditCardUser() {
        return creditCardUser;
    }

    public void setCreditCardUser(String creditCardUser) {
        this.creditCardUser = creditCardUser;
    }

    public int getSecurityCode() {
        return securityCode;
    }

    public void setSecurityCode(int securityCode) {
        this.securityCode = securityCode;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }
}
