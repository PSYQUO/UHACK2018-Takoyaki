package ph.edu.dlsu.takoyaki.myapplication.beans;

import java.util.ArrayList;

public class Users {

    public static final String NAME = "Users";

    private String uid;
    private String username;
    private String password;
    private long points;
    private ArrayList<String> rewards;

    public Users () {

    }

    public Users(String uid, String username, String password, long points, ArrayList<String> rewards) {
        this.uid = uid;
        this.username = username;
        this.password = password;
        this.points = points;
        this.rewards = rewards;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public long getPoints() {
        return points;
    }

    public void setPoints(long points) {
        this.points = points;
    }

    public ArrayList<String> getRewards() {
        return rewards;
    }

    public void setRewards(ArrayList<String> rewards) {
        this.rewards = rewards;
    }
}
