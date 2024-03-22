public class Event {

    public static final double insuranceCost=1000.00;
    public static final double tax=0.3;
    
    private String eventID;
    private String eventName;
    private String eventLocation;
    private String eventPointOfContact;
    private double eventCost;
    private int totalParticipants;
    private int totalEventDays;

    public Event(String eventID,String eventName,String eventLocation,String eventPointOfContact,double eventCost,int totalParticipants,int totalEventDays){
        this.eventID=eventID;
        this.eventName=eventName;
        this.eventLocation=eventLocation;
        this.eventPointOfContact=eventPointOfContact;
        this.eventCost=eventCost;
        this.totalParticipants=totalParticipants;
        this.totalEventDays=totalEventDays;
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


    public double getEventCost(){
        return eventCost;
    }

    public void setEventCost(double eventCost){
        this.eventCost=eventCost;
    }


    public int getTotalParticipants(){
        return totalParticipants;
    }

    public void setTotalParticipants(int totalParticipants){
        this.totalParticipants=totalParticipants;
    }


    public int getTotalEventDays(){
        return totalEventDays;
    }

    public void setTotalEventDays(int totalEventDays){
        this.totalEventDays=totalEventDays;
    }

    public String toString(){
        return eventID+" "+eventName+" "+eventLocation+" "+eventPointOfContact+" "+eventCost+" "+totalEventDays+" "+totalParticipants;
    }


    public void calculateEventCost(){
        this.eventCost=eventCost+(eventCost*tax)+insuranceCost;
    }
}