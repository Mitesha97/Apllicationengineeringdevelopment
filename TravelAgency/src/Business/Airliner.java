/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author lzy_1
 */
public class Airliner {
private String name;
    private AircraftDirectory directory;
    private FlightDirectory schedule;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AircraftDirectory getDirectory() {
        return directory;
    }

    public void setDirectory(AircraftDirectory directory) {
        this.directory = directory;
    }

    public FlightDirectory getSchedule() {
        return schedule;
    }

    public void setSchedule(FlightDirectory schedule) {
        this.schedule = schedule;
    }
   
   
    public Airliner() {
        this.schedule = new FlightDirectory();
    }
   
    public Airliner(String name) {
        this.name = name;
        this.directory = new AircraftDirectory();
        this.schedule = new FlightDirectory();
    }


}
