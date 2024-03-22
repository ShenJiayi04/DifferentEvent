public class Main {
    public static void main(String[] args) throws Exception{
        ConferenceEvent conferenceEvent=new ConferenceEvent(null, null, null, null, 0, 0, 0, 0, 0, 0);
        conferenceEvent.calculateEventCost();
        System.out.println(conferenceEvent);
    }
}
