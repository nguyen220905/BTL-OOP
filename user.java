package oop;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class user {
    private String id;
    private String name;
    private String email;
    private String password;
    private Date createdAt;

    // Constructor
    public User(String id, String name, String email, String password, Date createdAt) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.createdAt = createdAt;
    }



    // Getter/Setter cơ bản
    public String getId() { return id; }
    public String getName() { return name; }
    public String getEmail() { return email; }
    public Date getCreatedAt() { return createdAt; }
}
