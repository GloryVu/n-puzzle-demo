/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;


class Pair{
    State x;
    State y;
    int doSau;

    public Pair() {
    }

    public Pair(State x, State y, int doSau) {
        this.x = x;
        this.y = y;
        this.doSau = doSau;
    }

    @Override
    public String toString() {
        return "Pair{" + "x=" + x + ", y=" + y + ", doSau=" + doSau + '}';
    }

    

    
    
}

public class Algorithm {
    public static Result BFS(State s){
        HashMap<State, State> parent = new HashMap<>();
        HashSet<State> set = new HashSet<>();
        Queue<State> q = new LinkedList<>();
        q.add(s);
        set.add(s);
        while(!q.isEmpty()){
            State t = q.poll();
            if(t.isDestination()){
                List<State> path = new ArrayList<>();
                while(!t.equals(s)){
                    path.add(t);
                    t = parent.get(t);
                }
                path.add(s);
                Collections.reverse(path);
                return new Result(path);
            }
            if(t.isCanMoveDown() && !set.contains(t.moveDown())){
                q.add(t.moveDown());
                parent.put(t.moveDown(), t);
                set.add(t.moveDown());
            }
            if(t.isCanMoveLeft() && !set.contains(t.moveLeft())){
                q.add(t.moveLeft());
                parent.put(t.moveLeft(), t);
                set.add(t.moveLeft());
            }
            if(t.isCanMoveRight() && !set.contains(t.moveRight())){
                q.add(t.moveRight());
                parent.put(t.moveRight(), t);
                set.add(t.moveRight());
            }
            if(t.isCanMoveUp()  && !set.contains(t.moveUp())){
                q.add(t.moveUp());
                parent.put(t.moveUp(), t);
                set.add(t.moveUp());
            }
        }
        return null;
    }
      public static Result DFS(State s){
        
        HashMap<State, State> parent = new HashMap<>();
        Stack<State> st = new Stack<>();
        HashSet<State> set = new HashSet<>();
        st.push(s);
        set.add(s);
        while(!st.isEmpty()){
            State t = st.pop();
            if(t.isDestination()){
                List<State> path = new ArrayList<>();
                while(!t.equals(s)){
                    path.add(t);
                    t = parent.get(t);
                }
                path.add(s);
                Collections.reverse(path);
                return new Result(path);
            }
            if(t.isCanMoveDown() && !set.contains(t.moveDown())){
                st.add(t.moveDown());
                parent.put(t.moveDown(), t);
                set.add(t.moveDown());
            }
            if(t.isCanMoveLeft() && !set.contains(t.moveLeft())){
                st.add(t.moveLeft());
                parent.put(t.moveLeft(), t);
                set.add(t.moveLeft());
            }
            if(t.isCanMoveRight() && !set.contains(t.moveRight())){
                st.add(t.moveRight());
                parent.put(t.moveRight(), t);
                set.add(t.moveRight());
            }
            if(t.isCanMoveUp()  && !set.contains(t.moveUp())){
                st.add(t.moveUp());
                parent.put(t.moveUp(), t);
                set.add(t.moveUp());
            }
        }
        return null;
    }
//    private static HashSet<Matrix> hashSet;
//    private static HashMap<Matrix,Matrix> hashMap;
//    private static int doSauLonNhat;
//    private static void checkIDSDeQuy(Matrix top,int doSau){
//        if(doSau>doSauLonNhat) return;
//        
//        if(top.isCanMoveLeft()&&hashSet.contains(top.moveLeft())==false){
//            hashSet.add(top.moveLeft());
//            hashMap.put(top.moveLeft(), top);
//            checkIDSDeQuy(top.moveLeft(),doSau+1);
//        }
//        if(top.isCanMoveRight()&&hashSet.contains(top.moveRight())==false){
//            hashSet.add(top.moveRight());
//            hashMap.put(top.moveRight(), top);
//            checkIDSDeQuy(top.moveRight(),doSau+1);
//        }
//        if(top.isCanMoveUp()&&hashSet.contains(top.moveUp())==false){
//            hashSet.add(top.moveUp());
//            hashMap.put(top.moveUp(), top);
//            checkIDSDeQuy(top.moveUp(),doSau+1);
//        }
//        if(top.isCanMoveDown()&&hashSet.contains(top.moveDown())==false){
//            hashSet.add(top.moveDown());
//            hashMap.put(top.moveDown(), top);
//            checkIDSDeQuy(top.moveDown(),doSau+1);
//        }
//    }
//    public static Result IDSDeQuy(Matrix list,int k){
//        hashSet=new HashSet<>();
//        hashMap=new HashMap<>();
//        doSauLonNhat=k;
//        hashMap.put(list, list);
//        checkIDSDeQuy(list,0);
//        List<Matrix> waytoList=new ArrayList<>();
//        
//        Matrix destination=new Matrix(new int[]{0,1,2,3,4,5,6,7,8});
//        Matrix trangThai=destination;
//        waytoList.add(trangThai);
//        while(!trangThai.equals(list)){
//            waytoList.add(hashMap.get(trangThai));
//            trangThai=hashMap.get(trangThai);
//            if(trangThai==null) return null;
//        }
//        Collections.reverse(waytoList);
//        return new Result(waytoList)  ;
//        
//    }
    
    public static Result IDS(State banDau,int doSauLonNhat){
        
        Stack<Pair> stack=new Stack<>();
        stack.add(new Pair(banDau, banDau,0));
        List<Pair> stepToDestination=new ArrayList<>();
        stepToDestination.add(new Pair(banDau, banDau,0));
        HashSet<State> hashSet=new HashSet<>();
        while(!stack.empty()){
            Pair pair=stack.pop();
            hashSet.add(pair.x);
            stepToDestination.add(pair);
            if(pair.x.isDestination()){
                List<State> list=new ArrayList<>();
                list.add(pair.x);
                State dau=pair.x;
                while(!dau.equals(banDau)){
                    System.out.println(dau);
                    for(Pair step:stepToDestination){
                        if(step.x.equals(dau)){
                            list.add(step.y);
                            dau=step.y;
                            break;
                        }
                    }
                }
                Collections.reverse(list);
                return new Result(list);
            }
            if(pair.doSau>doSauLonNhat) continue;
            
            if(pair.x.isCanMoveDown()&&hashSet.contains(pair.x.moveDown())==false){
                stack.add(new Pair(pair.x.moveDown(), pair.x,pair.doSau+1));
            }
            if(pair.x.isCanMoveUp()&&hashSet.contains(pair.x.moveUp())==false){
                stack.add(new Pair(pair.x.moveUp(), pair.x,pair.doSau+1));
            }
            if(pair.x.isCanMoveRight()&&hashSet.contains(pair.x.moveRight())==false){
                stack.add(new Pair(pair.x.moveRight(), pair.x,pair.doSau+1));
            }
            if(pair.x.isCanMoveLeft()&&hashSet.contains(pair.x.moveLeft())==false){
                stack.add(new Pair(pair.x.moveLeft(), pair.x,pair.doSau+1));
            }            
        }
        return null;
    }
    public static Result AStar(State s){
        HashMap<State,State> parent = new HashMap<>(); //key luon la nut co f nho nhat
        PriorityQueue<State> pq = new PriorityQueue<>((o1, o2) -> {
            return Integer.compare(o1.getManhatta()+o1.getCost(), o2.getManhatta()+o2.getCost());
        });
        State cur = new State(s.getMatrix(),0);
        pq.add(cur);
        parent.put(cur, cur);
        while(!pq.isEmpty()){
            State t = pq.poll();
            if(t.isDestination()){
                List<State> path = new ArrayList<>();
                while(!t.equals(s)){
                    path.add(t);
                    t = parent.get(t);
                }
                path.add(s);
                Collections.reverse(path);
                return new Result(path);
            }
            if(t.getCost() > parent.get(t).getCost()+1) continue;
            if(t.isCanMoveDown()){
                State d = new State(t.moveDown().getMatrix(),t.getCost()+1);
                if(!parent.containsKey(d)){
                    parent.put(d, t);
                    pq.add(d);
                }
                else if(d.getCost() < parent.get(d).getCost()+1){
                    parent.put(d, t);
                    pq.add(d);
                }
            }
            if(t.isCanMoveLeft()){
                State d = new State(t.moveLeft().getMatrix(),t.getCost()+1);
                if(!parent.containsKey(d)){
                    parent.put(d, t);
                    pq.add(d);
                }
                else if(d.getCost() < parent.get(d).getCost()+1){
                    parent.put(d, t);
                    pq.add(d);
                }
            }
            if(t.isCanMoveRight()){
                State d = new State(t.moveRight().getMatrix(),t.getCost()+1);
                if(!parent.containsKey(d)){
                    parent.put(d, t);
                    pq.add(d);
                }
                else if(d.getCost() < parent.get(d).getCost()+1){
                    parent.put(d, t);
                    pq.add(d);
                }
            }
            if(t.isCanMoveUp()){
                State d = new State(t.moveUp().getMatrix(),t.getCost()+1);
                if(!parent.containsKey(d)){
                    parent.put(d, t);
                    pq.add(d);
                }
                else if(d.getCost() < parent.get(d).getCost()+1){
                    parent.put(d, t);
                    pq.add(d);
                }
            }
            
        }
        return null;
    }
    public static Result LeoDoi(State s){
        List<State> path = new LinkedList<>();
        path.add(s);
        State cur = s;
        while(true){
            List<State> neightbor = new LinkedList<>();
            if(cur.isCanMoveDown()) neightbor.add(cur.moveDown());
            if(cur.isCanMoveLeft()) neightbor.add(cur.moveLeft());
            if(cur.isCanMoveRight()) neightbor.add(cur.moveRight());
            if(cur.isCanMoveUp()) neightbor.add(cur.moveUp());
            State temp = neightbor.get(0);
            for(int i = 1; i< neightbor.size();i++){
                if(temp.getH() < neightbor.get(i).getH())
                    temp = neightbor.get(i);
            }
            if(temp.getH() <= cur.getH())
                return new Result(path);
            path.add(temp);
            cur = temp;
        }
        
    }
}
/*
0 1 2
3 4 5
6 7 8
*/