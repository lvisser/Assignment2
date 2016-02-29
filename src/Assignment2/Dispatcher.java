/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment2;

import java.util.ArrayList;
import java.lang.NullPointerException;

/**
 *
 * @author Leroy
 */
public class Dispatcher {

    ArrayList input;
    ArrayList serverPool;
    int dispatcherID;

    public Dispatcher(int id, int serverpool) {
        this.dispatcherID = id;

        for (int i = 0; i < serverpool; i++) {
            this.serverPool.add(new ServerPool(i));
        }
    }

    int randomWithRange(int min, int max) {
        int range = (max - min) + 1;
        return (int) (Math.random() * range) + min;
    }

    public void powerOfD(Tasks t, int d) {
        ArrayList array = new ArrayList<>(serverPool);

        for (int i = 0; i < serverPool.size() - d; i++) {
            array.remove(randomWithRange(0, array.size()));
        }
        // Now we have an array of size d left
        int lActive = Integer.MAX_VALUE;
        ServerPool selectedSP = null;
        for (int i = 0; i < array.size(); i++) {
            //selects serverpool with id i
            ServerPool sP = (ServerPool) array.get(i);
            int active = sP.size();

            if (active < lActive) {
                selectedSP = sP;
                lActive = active;
            }
        }
        
        selectedSP.addSP(t); // Nullpointer gaat nooit gebeuren tenzij array size 0 heeft.

    }
}
