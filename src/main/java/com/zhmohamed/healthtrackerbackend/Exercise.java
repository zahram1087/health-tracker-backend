package com.zhmohamed.healthtrackerbackend;

import javax.persistence.*;

@Entity
public class Exercise {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long id;

    public String title;
    public String quantity;
    public String description;
    public String timestamp;
    public String location;

    @ManyToOne
    public AppUser appUser;

    public Exercise () {}

    //constructor
    public Exercise (String title, String quantity, String description, String timestamp, String location){
        this.title=title;
        this.quantity=quantity;
        this.description=description;
        this.timestamp=timestamp;
        this.location=location;
    }

    public String toString() {
        return this.title + ": " + this.description + " - " + this.timestamp;
    }

}
