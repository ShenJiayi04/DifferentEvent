public class ConferenceEvent {
    public  boolean breakfastRequired;
    public double breakfastCost;
    public  boolean lunchRequired;
    public double lunchCost;
    public  boolean dinnerRequired;
    public double dinnerCost;
    public double conferenceEventCost;
    public String eventID;
    public String eventName;
    public String eventLocation;
    public String eventPointOfContact;
    private CalculateEventCostClass calculateEventCostObject;
    private int totalEventDays;
    private int totalParticipants;


    

   public double getBreakfastCost() {
       return breakfastCost;
   }

   public void setBreakfastCost(double breakfastCost) {
       this.breakfastCost = breakfastCost;
   }

   

   public double getLunchCost() {
       return lunchCost;
   }

   public void setLunchCost(double lunchCost) {
       this.lunchCost = lunchCost;
   }

   

   public double getDinnerCost() {
       return dinnerCost;
   }

   public void setDinnerCost(double dinnerCost) {
       this.dinnerCost = dinnerCost;
   }


   
    public boolean isBreakfastRequired() {
    return breakfastRequired;
}

public void setBreakfastRequired(boolean breakfastRequired) {
    this.breakfastRequired = breakfastRequired;
}

public boolean isLunchRequired() {
    return lunchRequired;
}

public void setLunchRequired(boolean lunchRequired) {
    this.lunchRequired = lunchRequired;
}

public boolean isDinnerRequired() {
    return dinnerRequired;
}

public void setDinnerRequired(boolean dinnerRequired) {
    this.dinnerRequired = dinnerRequired;
}

public double getConferenceEventCost() {
    return conferenceEventCost;
}

public void setConferenceEventCost(double conferenceEventCost) {
    this.conferenceEventCost = conferenceEventCost;
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


    public ConferenceEvent(String eventID,String eventName,String eventLocation,String pointOfContact,double eventCost,int totalParticipants,int totalEventDays,boolean breakfastRequired, double breakfastCost, boolean lunchRequired, double lunchCost,boolean dinnerRequired, double dinnerCost){
        //super(eventID,eventName,eventLocation,pointOfContact,eventCost,totalParticipants,totalEventDays);
        this.calculateEventCostObject = new CalculateEventCostClass();
        this.breakfastRequired = breakfastRequired;
        this.dinnerRequired = dinnerRequired;
        this.lunchRequired = lunchRequired;
        this.breakfastCost=breakfastCost;
        this.lunchCost=lunchCost;
        this.dinnerCost=dinnerCost;
    }

    
    public void calculateEventCost(){
        conferenceEventCost = calculateEventCostObject.calculateEventCost() + (calculateEventCostObject.calculateEventCost() * 0.3);

    }
    

    @Override
    public String toString(){
        return "Conference Event details: "+"\n"+
        "Event ID: "+eventID+"\n"+
        "Event Name: "+eventName+"\n"+
        "Event Location: "+eventLocation+"\n"+
        "Total participants: "+totalParticipants+"\n"+
        "Total conference Cost" + conferenceEventCost;
    }
}