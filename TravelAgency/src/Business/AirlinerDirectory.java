/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author lzy_1
 */
public class AirlinerDirectory {
    private ArrayList<Airliner> airline;

    public ArrayList<Airliner> getAirlinerDirectory() {
        return this.airline;
    }

    public void setairline(ArrayList<Airliner> airline) {
        this.airline = airline;
    }

    public AirlinerDirectory() {
        airline = new ArrayList<>();
        Airliner  Airliner1 = new  Airliner("Qatar");
         Airliner  Airliner2 = new  Airliner("Emirates");
         Airliner  Airliner3 = new  Airliner("Canada Airlines");
        //adding airlines
        airline.add( Airliner1);
        airline.add( Airliner2);
        airline.add( Airliner3);

    }
    public Airliner addAirline(String name ) {
        Airliner air = new Airliner(name);
        airline.add(air);
        return air;
    }
}
