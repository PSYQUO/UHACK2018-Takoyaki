package ph.edu.dlsu.takoyaki.myapplication.beans;

public class Rewards {

    public static final String NAME = "Rewards";

    private String eventID;
    private String sponsor;
    private String desc;
    private boolean used;

    public Rewards() {
    }

    public boolean isUsed() {
        return used;
    }

    public void setUsed(boolean used) {
        this.used = used;
    }

    public Rewards(String eventID, String sponsor, String desc, boolean used) {

        this.eventID = eventID;
        this.sponsor = sponsor;
        this.desc = desc;
        this.used = used;
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
