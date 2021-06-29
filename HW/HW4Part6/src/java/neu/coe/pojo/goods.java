/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package neu.coe.pojo;

import java.util.Objects;

/**
 *
 * @author jumin
 */
public class goods {
    private String goodsName;
    private String count;

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }
    
       public goods(String goodsName,String count) {
        this.goodsName = goodsName;
        this.count = count;
    }

    public goods() {
        
    }
    
     /**
     *
     * @param obj
     * @return
     */
    @Override
    public boolean equals(Object obj) {
         goods good = (goods) obj;
        return Objects.equals(this.goodsName, good.goodsName);
      
   }   

   @Override
   public int hashCode() {
        int hash = 5;
      hash = 97 * hash + Objects.hashCode(this.goodsName);
       return hash;
   }
}
