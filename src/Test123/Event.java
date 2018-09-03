package Test123;

import java.io.Serializable;
import java.util.ArrayList;

public class Event implements Serializable
{

    // main info
    private int eID;
    private int uID;
    private int eventType;
    private String name;
    private String location;
    private String dateCreate;
    private String dateStart;
    private String dateDl;
    private String picPath;

    //additional info
    private String art;
    private int[] userlist;
    private WunschListe wl;        // Wunschliste

    // müsste man eventuell auch noch zum Builder hinzufügen


    Event(int eID, int uID, int eventType, String name, String location, String dateCreate,
          String dateStart, String dateDl, String picPath)
    {
        this.eID=eID;
        this.uID=uID;
        this.eventType=eventType;
        this.name=name;
        this.location=location;
        this.dateCreate=dateCreate;
        this.dateStart=dateStart;
        this.dateDl=dateDl;
        this.picPath=picPath;
        wl = new WunschListe(eID);
    }


    public int geteID() {
        return eID;
    }

    public void seteID(int eID) {
        this.eID = eID;
    }

    public int getuID() {
        return uID;
    }

    public void setuID(int uID) {
        this.uID = uID;
    }

    public int getEventType() {
        return eventType;
    }

    public void setEventType(int eventType) {
        this.eventType = eventType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDateCreate() {
        return dateCreate;
    }

    public void setDateCreate(String dateCreate) {
        this.dateCreate = dateCreate;
    }

    public String getDateStart() {
        return dateStart;
    }

    public void setDateStart(String dateStart) {
        this.dateStart = dateStart;
    }

    public String getDateDl() {
        return dateDl;
    }

    public void setDateDl(String dateDl) {
        this.dateDl = dateDl;
    }

    public String getPicPath() {
        return picPath;
    }

    public void setPicPath(String picPath) {
        this.picPath = picPath;
    }

    public void setWl(WunschListe wll){
        this.wl = wll;
    }

    public void addW(Wunsch w){
        this.wl.addW(w);
    }

    public WunschListe getWl(){
        return this.wl;
    }

    public static class EventBuilder
    {
        int eID;
        int uID;
        int eventType;
        String name;
        String location;
        String dateCreate;
        String dateStart;
        String dateDl;
        String picPath;

        WunschListe WL;

        //<editor-fold desc="Withs">
        public EventBuilder (String name, String location, String dateStart)
        {
            this.name=name;
            this.location=location;
            this.dateStart=dateStart;
        }

        public EventBuilder withEid(int eID)
        {
            this.eID = eID;
            return this;
        }

        public EventBuilder withUid(int uID)
        {
            this.uID = uID;
            return this;
        }

        public EventBuilder withEventType(int eventType)
        {
            this.eventType =eventType;
            return this;
        }

        public EventBuilder withCreateDate(String createDate)
        {
            this.dateCreate = createDate;
            return this;
        }

        public EventBuilder withDlDate(String dlDate)
        {
            this.dateDl = dlDate;
            return this;
        }

        public EventBuilder withPicPath(String picPath)
        {
            this.picPath = picPath;
            return this;
        }

        public EventBuilder withWl(WunschListe wl){
            this.WL = wl;
            return this;
        }

        //</editor-fold>

        public Event build()
        {
            return new Event(eID,uID,eventType,name, location,dateCreate, dateStart,dateDl,picPath);
        }
    }
    static public ArrayList<Event> getTestList()
    {
        ArrayList<Event> testList = new ArrayList<>();

        String start1 ="2018.8.30";
        String dl1 = "2018.8.20";

        Event event1 = new Event.EventBuilder("Grillen", "Würzburg", start1).withEid(1).withDlDate(dl1).build();
        event1.addW(new Wunsch(1, 2, "Grillfleisch"));
        event1.addW(new Wunsch(2, 2, "Bier"));
        event1.addW(new Wunsch(3, 4, "Grillkohle"));

        System.out.println(event1.getWl().getW(1).getText());

        String start2 = "2018.9.29";
        String dl2 = "2018.9.25";
        Event event2 = new Event.EventBuilder("Kino", "Dettelbach", start2).withEid(2).withDlDate(dl2).build();

        String start3 = "2018.7.10";
        String dl3 = "2018.7.5";
        Event event3 = new Event.EventBuilder("Spieleabend", "Eisenheim", start3).withEid(3).withDlDate(dl3).build();

        String start4 = "2018.7.11";
        String dl4 = "2018.7.4";
        Event event4 = new Event.EventBuilder("Lerngruppe", "Würzburg", start4).withEid(4).withDlDate(dl4).build();

        String start5 = "2018.8.20";
        String dl5 = "2018.8.10";
        Event event5 = new Event.EventBuilder("Spieleabend", "Giebelstadt", start5).withEid(5).withDlDate(dl5).build();

        String start6 = "2018.8.24";
        String dl6 = "2018.8.20";
        Event event6 = new Event.EventBuilder("PublicViewing", "Würzburg", start6).withEid(6).withDlDate(dl6).build();

        String atart7 = "2018.6.29";
        String dl7 = "2018.6.28";
        Event event7 = new Event.EventBuilder("Feier", "Volkach", atart7).withEid(7).withDlDate(dl7).build();

        String start8 = "2018.6.16";
        String dl8 = "2018.6.15";

        Event event8 = new Event.EventBuilder("Kino", "Dettelbach", start8).withEid(8).withDlDate(dl8).build();
        event8.addW(new Wunsch(4, 2, "Cola"));
        event8.addW(new Wunsch(5, 3, "Popcorn"));

        testList.add(event1);
        testList.add(event2);
        testList.add(event3);
        testList.add(event4);
        testList.add(event5);
        testList.add(event6);
        testList.add(event7);
        testList.add(event8);

        return testList;
    }

    public static void main(String[] args){


        ArrayList AL = getTestList();



    }

}
