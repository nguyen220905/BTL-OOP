package oop;

import java.util.Date;

public class Transaction {
    private String id;
    private Date date;
    private double amount;
    private String type;
    private String note;


    public Transaction(String id, Date date, double amount, String type, String note) {
        this.id = id;
        this.date = date;
        this.amount = amount;
        this.type = type;
        this.note = note;
    }


    public String getSummary() {
        return "[" + type.toUpperCase() + "] " + amount + " on " + date + " (" + note + ")";
    }

    public String getId() { return id; }
    public Date getDate() { return date; }
    public double getAmount() { return amount; }
    public String getType() { return type; }
    public String getNote() { return note; }
}
