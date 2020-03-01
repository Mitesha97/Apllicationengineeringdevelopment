/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author mansi
 */
public class Flight {
    private String departureTime;
    private String arrivalTime;
    private String flight;
   // private Airliner airliner;
    private String departureAirport;
    private String arrivalAirport;

    

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }
    
        public String getFlight() {
        return flight;
    }

    public void setFlight(String flight) {
        this.flight = flight;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public void setDepartureAirport(String departureAirport) {
        this.departureAirport = departureAirport;
    }

    public String getArrivalAirport() {
        return arrivalAirport;
    }

    public void setArrivalAirport(String arrivalAirport) {
        this.arrivalAirport = arrivalAirport;
    }


/*
    public Airliner getAirliner() {
        return airliner;
    }

    public void setAirliner(Airliner airliner) {
        this.airliner = airliner;
    }
*/

   /*
    public Flight() {
        this.airliner = new Airliner();
    }*/
   
    public Flight(String flight,String departureTime, String arrivalTime,
             String departureAirport, String arrivalAirport) {
        this.flight=flight;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;   
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
     
    }
}/*
   public void setDepartureTime(String dTime) throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy HH:mm:ss");
        Date date = formatter.parse(dTime);
        this.departureTime = date;
    }

    public void setArrivalTime(String aTime) throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy HH:mm:ss");
        Date date = formatter.parse(aTime);
        this.arrivalTime = date;
    }*/

