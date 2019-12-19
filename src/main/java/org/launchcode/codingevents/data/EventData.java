package org.launchcode.codingevents.data;

import org.launchcode.codingevents.models.Event;

import java.util.*;

public class EventData {
    //place for events
    private static final Map<Integer, Event> events = new HashMap<>();

    //get all events
public static Collection<Event> getAll(){
    return events.values();
}
    //get single event
    public static Event getById(int id){
        return events.get(id);
    }
    //add event
    public static void addEvent(Event event) {
        events.put(event.getId(), event);
    }
    //remove event
    public static void removeEvent(int id){
    events.remove(id);
    }

}
