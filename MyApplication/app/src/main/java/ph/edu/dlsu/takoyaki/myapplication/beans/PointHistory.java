package ph.edu.dlsu.takoyaki.myapplication.beans;

import java.util.Date;

public class PointHistory {
    public static final String NAME = "PointHistory";

    private String uid;
    private String QRID;
    private Date date;

    public PointHistory() {
    }

    public PointHistory(String uid, String QRID, Date date) {
        this.uid = uid;
        this.QRID = QRID;
        this.date = date;
    }

    public static String getNAME() {
        return NAME;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getQRID() {
        return QRID;
    }

    public void setQRID(String QRID) {
        this.QRID = QRID;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
