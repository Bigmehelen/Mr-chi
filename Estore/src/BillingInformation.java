public class BillingInformation{
    private String receiverPhoneNumber;
    private String receiverName;
    private Address deliveryAddress;
    private CardInformation cardInformation;


    public BillingInformation(String  receiverPhoneNumber, String receiverName, Address deliveryAddress){
        this.receiverPhoneNumber = receiverPhoneNumber;
        this.receiverName = receiverName;
        this.deliveryAddress = deliveryAddress;

    }
}
