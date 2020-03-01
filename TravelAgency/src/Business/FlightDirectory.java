/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author mansi
 */
public class FlightDirectory {
    private ArrayList<Flight> flightSchedule;

    public FlightDirectory() {
        flightSchedule = new ArrayList<>();
        
        Flight Flight1= new Flight("777","","","Boston","Mumbai");
        flightSchedule.add(Flight1);
        Flight Flight2= new Flight("777","","","Chicago","New York");
        flightSchedule.add(Flight2);
        Flight Flight3= new Flight("777","","","India","Boston");
        flightSchedule.add(Flight3);
        Flight Flight4= new Flight("360","","","San Fransico","Colorado");
        flightSchedule.add(Flight4);
        Flight Flight5= new Flight("360","","","Florida","Boston");
        flightSchedule.add(Flight5);
        Flight Flight6= new Flight("321","","","Seattle","Paris");
        flightSchedule.add(Flight6);
        Flight Flight7= new Flight("321","","","Abu Dabhi","Uganda");
        flightSchedule.add(Flight7);
        Flight Flight8= new Flight("360","","","New York","Chicago");
        flightSchedule.add(Flight8);
        Flight Flight9= new Flight("777","","","New Jersey","Korea");
        flightSchedule.add(Flight9);
        
        
        
    }
   /*
    public ArrayList<Flight> getSchedule() {
        return this.flightDir;
    }
*/

    public ArrayList<Flight> getFlightSchedule() {
        return flightSchedule;
    }

    public void setFlightSchedule(ArrayList<Flight> flightSchedule) {
        this.flightSchedule = flightSchedule;
    }


     
    public void addFlight(String flight,String departureTime, String arrivalTime,
             String departureAirport, String arrivalAirport) {
        Flight f= new Flight(flight,departureTime,arrivalTime,departureAirport,arrivalAirport);
        flightSchedule.add(f);
        
    }

}