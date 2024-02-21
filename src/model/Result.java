/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.List;

/**
 *
 * @author Admin
 */
public class Result {
    private List<State> path;

    public Result(List<State> path) {
        this.path = path;
    }

    public int getCost() {
        return path.size()-1;
    }

    public List<State> getPath() {
        return path;
    }

    @Override
    public String toString() {
        return "Result{" + "path=" + path + '}';
    }
    
}
