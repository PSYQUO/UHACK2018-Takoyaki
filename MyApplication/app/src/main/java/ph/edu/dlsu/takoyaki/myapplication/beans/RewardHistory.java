package ph.edu.dlsu.takoyaki.myapplication.beans;

import java.util.Date;

public class RewardHistory {

    public static final String NAME = "RewardHistory";

    private String uid;
    private String eventID;
    private Date acquire;
    private Date redeem;

    public RewardHistory() {
    }

    public RewardHistory(String uid, String eventID, Date acquire, Date redeem) {

        this.uid = uid;
        this.eventID = eventID;
        this.acquire = acquire;
        this.redeem = redeem;
    }

    public String getUid() {

        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getEventID() {
        return eventID;
    }

    public void setEventID(String eventID) {
        this.eventID = eventID;
    }

    public Date getAcquire() {
        return acquire;
    }

    public void setAcquire(Date acquire) {
        this.acquire = acquire;
    }

    public Date getRedeem() {
        return redeem;
    }

    public void setRedeem(Date redeem) {
        this.redeem = redeem;
    }
}
