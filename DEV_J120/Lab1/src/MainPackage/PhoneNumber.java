/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainPackage;

/**
 *
 * @author A.Konnov <github.com/Odhinn3>
 */
public class PhoneNumber {
    private long phonenum;

    public PhoneNumber(long phonenum) {
        setPhonenum(phonenum);
    }

    public long getPhonenum() {
        return phonenum;
    }

    public void setPhonenum(long phonenum) {
        this.phonenum = phonenum;
    }
    
    @Override
    public String toString(){
        return "(" + phonenum/1000000000 + phonenum%1000000000/10000000 + ")" +
                phonenum%10000000/10000 + "-" + phonenum%10000/100 + "-" +
                phonenum%100;}
    
    
    
    
}
