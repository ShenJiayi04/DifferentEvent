public class MusicConcertEvent {
    public boolean merchandiseRequired;
    public double merchandiseCost;
    public String eventID;
    public String eventName;
    public String eventLocation;
    public String eventPointOfContact;
    private CalculateEventCostClass calculateEventCostObject;



    public MusicConcertEvent(String eventID,String eventName,String eventLocation,String pointOfContact,double eventCost, int totalParticipants,int totalEventDays, boolean merchandiseRequired, double merchandiseCost) {
        //super(eventID,eventName,eventLocation,pointOfContact,eventCost,totalParticipants,totalEventDays);
        this.calculateEventCostObject = new CalculateEventCostClass();
        this.merchandiseRequired = merchandiseRequired;
        this.merchandiseCost = merchandiseCost;
    }

    public boolean getMerchandiseRequired() {
        return merchandiseRequired;
    }

    public void setMerchandiseRequired(boolean merchandiseRequired) {
        this.merchandiseRequired = merchandiseRequired;
    }

    public double getMerchandiseCost() {
        return merchandiseCost;
    }

    public void setMerchandiseCost(double merchandiseCost) {
        this.merchandiseCost = merchandiseCost;
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

    
    public void calculateEventCost() {
        merchandiseCost = calculateEventCostObject.calculateEventCost() + (calculateEventCostObject.calculateEventCost() * 0.3);
    }

    @Override
    public String toString() {
        return "Music Concert Event Details: " +"\n"+
                "Merchandise Required: " + merchandiseRequired + "\n" +
                "Merchandise Cost: $" + merchandiseCost;
    }
}
