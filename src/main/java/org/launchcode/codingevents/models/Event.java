package org.launchcode.codingevents.models;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.util.Objects;

@Entity
public class Event {

    @Id
    @GeneratedValue
    private int id;

    @NotBlank(message = "Name is required")
    @Size(min = 3, max = 50, message = "Name must be between 3 and 50 characters")
    private String name;

    @Size(max = 500, message = "Description too long!")
    private String description;

    @NotBlank
    @Email(message = "Invalid E-mail. Try again")
    private String contactEmail;

/*
    @NotBlank(message = "Location is required")
    private String location;

    @NotBlank
    private boolean registerStatus;

    @PositiveOrZero(message = "Minimum of 1 attendee!")
    @NotBlank(message = "Must enter number of attendees")
    private int numberOfAttendees;
*/

    private EventType type;


    public Event(String name, String description, String contactEmail, EventType type) {
        this.description = description;
        this.name = name;
        this.type = type;
        this.contactEmail = contactEmail;

    }

    public Event() {
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getId() {
        return id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public EventType getType() {
        return type;
    }

    public void setType(EventType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Event{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Event event = (Event) o;
        return id == event.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
