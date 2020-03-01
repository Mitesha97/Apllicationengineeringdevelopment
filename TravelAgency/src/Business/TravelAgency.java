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
public class TravelAgency {
     private AirlinerDirectory airlinerList;
     private FlightDirectory flightSchedule1;
     private CustomerDirectory customerDir;
     private AircraftDirectory aircraftDirectory;
        
        public TravelAgency() {
        this.airlinerList = new AirlinerDirectory();
        this.flightSchedule1 = new FlightDirectory();
        this.customerDir=new CustomerDirectory();
        this.aircraftDirectory=new AircraftDirectory();
        }

    public FlightDirectory getFlightSchedule1() {
        return flightSchedule1;
    }

    public void setFlightSchedule1(FlightDirectory flightSchedule1) {
        this.flightSchedule1 = flightSchedule1;
    }

    public AircraftDirectory getAircraftDirectory() {
        return aircraftDirectory;
    }

    public void setAircraftDirectory(AircraftDirectory aircraftDirectory) {
        this.aircraftDirectory = aircraftDirectory;
    }

    public CustomerDirectory getCustomerDir() {
        return customerDir;
    }

    public void setCustomerDir(CustomerDirectory customerDir) {
        this.customerDir = customerDir;
    }




    public FlightDirectory getFlightSchedule() {
        return flightSchedule1;
    }

    public void setFlightSchedule(FlightDirectory flightSchedule) {
        this.flightSchedule1 = flightSchedule;
    }

    public AirlinerDirectory getAirlinerList() {
        return airlinerList;
    }

    public void setAirlinerList(AirlinerDirectory airlinerList) {
        this.airlinerList = airlinerList;
    }
        
    public Airliner addAirliners(String name) {
        Airliner ai =new Airliner();
    airlinerList.addAirline(name);
    return ai;
    }
    
    public Customer addCustomers(String userName, String password) {
    Customer cs = new Customer(userName, password);
     customerDir.addCustomer(userName, password);
    return cs;
    }
    public Flight addFlights(String flight,String departureTime, String arrivalTime,String departureAirport, String arrivalAirport){
    Flight f= new Flight(flight, departureTime, arrivalTime, departureAirport, arrivalAirport);
    flightSchedule1.addFlight(flight, departureTime, arrivalTime, departureAirport, arrivalAirport);
    return f;
    
    }
    
   public Aircraft addplanes(String serial,String model,int row ,int column,int totalseat){
   Aircraft a = new Aircraft(serial,model,row,column,totalseat);
   aircraftDirectory.addplane(serial,model,row,column,totalseat);
   return a;
    }
    /*
    public FlightDirectory addFlightSchedule(){
        FlightDirectory fd = new FlightDirectory();
        return fd;
    }*/
      /*  public Flight addFlight(){
        Flight flight = new Flight();
        flightSchedule.add(flight);
        return flight;
    } */
    
    
    
}
