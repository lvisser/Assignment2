/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment2;

import java.util.ArrayList;

/**
 *
 * @author Leroy
 */
public class Dispatcher {

    ArrayList input;
    ArrayList serverPool;
    int dispatcherID;

    public Dispatcher(int id, int serverPool) {
        this.dispatcherID = id;

        for (int i = 0; i < serverPool; i++) {
            this.serverPool.add(new ServerPool(i));
        }
    }

    public void selectServerPool(Tasks t) {
        int selectedServer;
        int activeTasks;
        for (int i = 0; i < serverPool.size(); i++) {
            if

        }

    }
}
