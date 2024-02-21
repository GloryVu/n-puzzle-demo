/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Admin
 */
public class State {
    private int[] matrix; // 0 1 2
                          // 3 4 5
                          // 6 7 8
    private int id;
    private int blank;
    private int cost;
    private boolean canMoveDown;
    private boolean canMoveLeft;
    private boolean canMoveRight;
    private boolean canMoveUp;
    public State(int[] matrix) {
        this.matrix = matrix;
        this.id = 0;
        for(int i = 0; i < matrix.length; i++){
            if(matrix[i] == 0)
                blank = i;
            this.id += this.id*10+ matrix[i];
        }
        // Move Set
        canMoveDown = canMoveLeft = canMoveRight = canMoveUp = true;
        if(blank <= 2) canMoveUp = false;
        if(blank >= 6) canMoveDown = false;
        if(blank%3 == 0) canMoveLeft = false;
        if(blank %3 == 2) canMoveRight = false;
    }
    public State(int[] matrix,int cost){
        this(matrix);
        this.cost = cost;
    }
    @Override
    public int hashCode() {
        return Integer.hashCode(id);
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final State other = (State) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }
    public boolean isDestination(){
        for(int i = 0; i< 9; i++){
            if(matrix[i] != i) return false;
        }
        return true;
    }
    public int[] getMatrix() {
        return matrix;
    }

    public int getBlank() {
        return blank;
    }
    public int getManhatta(){
        int h = 0;
        for(int i = 1; i < 9; i++){
            int j;
            for(j = 0; j < 9; j++)
                if(matrix[j] == i) break;
            h += Math.abs(j%3 - i%3) + Math.abs(j/3 - i/3);
        }
        return h;
    }
    public int getH(){
        int h = 0;
        for(int i = 1; i < 9; i++){
            if(matrix[i] == i)
                h++;
        }
        return h;
    }

    public int getCost() {
        return cost;
    }
    
    public boolean isCanMoveDown() {
        return canMoveDown;
    }

    public boolean isCanMoveLeft() {
        return canMoveLeft;
    }

    public boolean isCanMoveRight() {
        return canMoveRight;
    }

    public boolean isCanMoveUp() {
        return canMoveUp;
    }
    public State moveDown() {
        int[] m = matrix.clone();
        int temp = m[blank];
        m[blank] = m[blank+3];
        m[blank+3] = temp;
        return new State(m);
    }

    public State moveLeft() {
        int[] m = matrix.clone();
        int temp = m[blank];
        m[blank] = m[blank-1];
        m[blank-1] = temp;
        return new State(m);
    }

    public State moveRight() {
        int[] m = matrix.clone();
         int temp = m[blank];
         m[blank] = m[blank+1];
         m[blank+1] = temp;
         return new State(m);
    }

    public State moveUp() {
        int[] m = matrix.clone();
         int temp = m[blank];
         m[blank] = m[blank-3];
         m[blank-3] = temp;
         return new State(m);
    }

    @Override
    public String toString() {
        return "\n" + matrix[0] + " " + matrix[1]+ " " + matrix[2]+ "\n" 
                + matrix[3] + " " + matrix[4]+ " " + matrix[5] + "\n"
                + matrix[6] + " " + matrix[7]+ " " + matrix[8] +"\n";
    }
    
     
}
