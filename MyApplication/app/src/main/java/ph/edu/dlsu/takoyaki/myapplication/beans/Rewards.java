package ph.edu.dlsu.takoyaki.myapplication.beans;

public class Rewards {

    public static final String NAME = "Rewards";

    private String eventID;
    private String sponsor;
    private String desc;

    public Rewards() {
    }

    public Rewards(String eventID, String sponsor, String desc) {
        this.eventID = eventID;
        this.sponsor = sponsor;
        this.desc = desc;
    }

    public String getEventID() {
        return eventID;
    }

    public void setEventID(String eventID) {
        this.eventID = eventID;
    }

    public String getSponsor() {
        return sponsor;
    }

    public void setSponsor(String sponsor) {
        this.sponsor = sponsor;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
