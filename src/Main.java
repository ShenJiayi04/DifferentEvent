import java.time.LocalDate;
public class Main {
    public static void main(String[] args) throws Exception{
        ConferenceEvent conferenceEvent=new ConferenceEvent(null, null, null, null, 0, 0, 0, true, 0, true, 0,true, 0);
        conferenceEvent.calculateEventCost();
        System.out.println(conferenceEvent);
        

        PastEvent pastEvent = new PastEvent(null, null, null,null,10,10 ,10,LocalDate.of(2023,3,25),LocalDate.of(2023,3,28),null,false);
        pastEvent.getPaymentDetails();
        System.out.println(pastEvent.toString());
    }
}
