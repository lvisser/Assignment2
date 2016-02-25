/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment2;
/**
 *
 * @author Leroy
 */
class Tasks {
    int exeTime;
    int taskID;
    boolean finished;
    
    public Tasks(int id){
        this.taskID = id;
        this.exeTime = 0;// Moet exp verdeeld met mean 1 tijd worden
        this.finished = false;
    }
}
