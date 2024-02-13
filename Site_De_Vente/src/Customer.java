import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Customer {
    private int idCustomer;
    private String nameCustomer;
    private String emailCustomer;
    private String phoneCustomer;
    private String addressCustomer;
    private String cityCustomer;
    private String countryCustomer;
    private List<CreditCard> creditCards = new ArrayList<>();

    public void addCard(CreditCard card){
        creditCards.add(card);
    }

    public int getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(int idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getNameCustomer() {
        return nameCustomer;
    }

    public void setNameCustomer(String nameCustomer) {
        this.nameCustomer = nameCustomer;
    }

    public String getEmailCustomer() {
        return emailCustomer;
    }

    public void setEmailCustomer(String emailCustomer) {
        this.emailCustomer = emailCustomer;
    }

    public String getPhoneCustomer() {
        return phoneCustomer;
    }

    public void setPhoneCustomer(String phoneCustomer) {
        this.phoneCustomer = phoneCustomer;
    }

    public String getAddressCustomer() {
        return addressCustomer;
    }

    public void setAddressCustomer(String addressCustomer) {
        this.addressCustomer = addressCustomer;
    }

    public String getCityCustomer() {
        return cityCustomer;
    }

    public void setCityCustomer(String cityCustomer) {
        this.cityCustomer = cityCustomer;
    }

    public String getCountryCustomer() {
        return countryCustomer;
    }

    public void setCountryCustomer(String countryCustomer) {
        this.countryCustomer = countryCustomer;
    }
}