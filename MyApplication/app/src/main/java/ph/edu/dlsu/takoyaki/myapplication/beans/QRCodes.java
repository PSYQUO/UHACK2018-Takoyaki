package ph.edu.dlsu.takoyaki.myapplication.beans;

public class QRCodes {

    public static final String NAME = "QRCodes";

    private String uid;
    private String name;
    private int points;

    public QRCodes() {

    }

    public QRCodes(String uid, String name, int points) {

        this.uid = uid;
        this.name = name;
        this.points = points;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

}
