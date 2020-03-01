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
public class Seat {
private int row;
    private int column;
    private Seat[][] seat;
    
 public Seat() {
        this.seat = new Seat[25][6];
    }
   public Seat(int row, int column) {
        this.row = row;
        this.column = column;
        this.seat = new Seat[row][column];
    }

    public Seat[][] getSeat() {
        return this.seat;
    }
    
}
