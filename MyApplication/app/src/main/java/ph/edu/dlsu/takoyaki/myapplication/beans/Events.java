package ph.edu.dlsu.takoyaki.myapplication.beans;

import java.util.ArrayList;
import java.util.Date;

public class Events {
    public static final String NAME = "Events";

    private String eventID;
    private String name;
    private Date start;
    private Date end;
    private ArrayList<Users> usersArrayList;
    private String sponsor;

    public Events() {
    }

    public Events(String eventID, String name, Date start, Date end, ArrayList<Users> usersArrayList, String sponsor) {

        this.eventID = eventID;
        this.name = name;
        this.start = start;
        this.end = end;
        this.usersArrayList = usersArrayList;
        this.sponsor = sponsor;
    }

    public String getEventID() {

        return eventID;
    }

    public void setEventID(String eventID) {
        this.eventID = eventID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public Date getEnd() {
        return end;
    }

    public void setEnd(Date end) {
        this.end = end;
    }

    public ArrayList<Users> getUsersArrayList() {
        return usersArrayList;
    }

    public void setUsersArrayList(ArrayList<Users> usersArrayList) {
        this.usersArrayList = usersArrayList;
    }

    public String getSponsor() {
        return sponsor;
    }

    public void setSponsor(String sponsor) {
        this.sponsor = sponsor;
    }
}
