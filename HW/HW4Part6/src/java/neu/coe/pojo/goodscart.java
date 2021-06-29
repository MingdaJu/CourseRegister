/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package neu.coe.pojo;

import java.util.ArrayList;

/**
 *
 * @author jumin
 */
public class goodscart {
     private ArrayList<goods> goodscart;

    public ArrayList<goods> getGoodscart() {
        return goodscart;
    }

    public void setGoodscart(ArrayList<goods> goodscart) {
        this.goodscart = goodscart;
    }

    
     
     public goodscart() {
        this.goodscart=new ArrayList<goods>();
    }

    public goodscart(ArrayList<goods> goodscart) {
        this.goodscart = goodscart;
    }
    
        public void add(goods item){
        goodscart.add(item);
    }
    
    public boolean remove(goods item){
        return goodscart.remove(item);
    }
    
    public boolean delete(goodscart list){       
        return goodscart.removeAll(list.getGoodscart());
    }
}
