package oop;

public class Category {
    private String id;
    private String name;
    private String description;

    // Constructor
    public Category(String id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public String getCategoryInfo() {
        return name + " - " + description;
    }

    public String getId() { return id; }
    public String getName() { return name; }
    public String getDescription() { return description; }

    public void setName(String name) { this.name = name; }
    public void setDescription(String description) { this.description = description; }
}
