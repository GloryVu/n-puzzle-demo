/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import model.Algorithm;
import model.State;
import model.Result;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
        int[] s = {3,4,1,2,8,7,6,5,0};
        State start = new State(s);
        System.out.println(start);
        Result rs = Algorithm.BFS(start);
        System.out.println(rs.getCost());
        return;
    }
}
