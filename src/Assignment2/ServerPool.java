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
public class ServerPool {
    ArrayList activeTasks; // Used to store all active tasks of a server pool
    int serverID;

    /**
     *
     * @param id
     */
    public ServerPool(int id) {
        this.activeTasks = new ArrayList<>();
        this.serverID = id;
    }
    
    public Integer size(){
        return this.activeTasks.size();
    }

    public void addSP(Tasks t){
        this.activeTasks.add(t);
    }
    
}
