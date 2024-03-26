import java.time.LocalDate;

public class PastEvent  {
    private LocalDate eventStartDate;
    private LocalDate eventEndDate;
    private String paymentStatus;
    private boolean requiresExtension;
    private static final double eventCost = 10_000;
    private String paymentDetails;
    public String eventID;
    public String eventName;
    public String eventLocation;
    public String eventPointOfContact;
    //private CalculateEventCostClass calculateEventCostObject;

    public PastEvent(String eventID,String eventName,String eventLocation,String pointOfContact,double eventCost, int totalParticipants,int totalEventDays, LocalDate eventStartDate, LocalDate eventEndDate, String paymentStatus, boolean requiresExtension) {
        //super(eventID,eventName,eventLocation,pointOfContact,eventCost,totalParticipants,totalEventDays);
        this.eventStartDate = eventStartDate;
        this.eventEndDate = eventEndDate;
        this.paymentStatus = paymentStatus;
        this.requiresExtension = requiresExtension;
        this.paymentDetails = getPaymentDetails();
    }

    

    public LocalDate getEventStartDate() {
        return eventStartDate;
    }



    public void setEventStartDate(LocalDate eventStartDate) {
        this.eventStartDate = eventStartDate;
    }



    public LocalDate getEventEndDate() {
        return eventEndDate;
    }



    public void setEventEndDate(LocalDate eventEndDate) {
        this.eventEndDate = eventEndDate;
    }



    public String getPaymentStatus() {
        return paymentStatus;
    }



    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }



    public boolean isRequiresExtension() {
        return requiresExtension;
    }



    public void setRequiresExtension(boolean requiresExtension) {
        this.requiresExtension = requiresExtension;
    }



    public static double getEventcost() {
        return eventCost;
    }



    public void setPaymentDetails(String paymentDetails) {
        this.paymentDetails = paymentDetails;
    }

    public String getEventName(){
        return eventName;
    }
    
    public void setEventName(String eventName){
        this.eventName=eventName;
    }
    
    public String getEventID(){
        return eventID;
    }
    
    public void setEventID(String eventID){
        this.eventID=eventID;
    }
    
    public String getEventLocation(){
        return eventLocation;
    }
    
    public void setEventLocation(String eventLocation){
        this.eventLocation=eventLocation;
    }
    
    public String getEventPointOfContact(){
        return eventPointOfContact;
    }
    
    public void setEventPointOfContact(String eventPointOfContact){
        this.eventPointOfContact=eventPointOfContact;
    }
    



    String getPaymentDetails() {
        return "The event cost was " + eventCost + " and the payment status is " + paymentStatus +
                ". The Customer requires extension?: " + requiresExtension + ".";
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + paymentDetails;
    }

    
}


