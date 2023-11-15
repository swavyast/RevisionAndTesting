package com.ml.revision.oops;

/**
 * Encapsulation in java can be achieved by declaring fields as private and providing public methods 
 * to manipulate with those fields.
 * */

public class Encapsulation {
    
    private int id;
    private String name;
    private String email;
    private long phone;
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public long getPhone() {
        return phone;
    }
    public void setPhone(long phone) {
        this.phone = phone;
    }
    
    
}
