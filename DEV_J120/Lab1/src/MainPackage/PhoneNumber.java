
package MainPackage;

import java.util.Objects;
/**
 *
 * @author A.Konnov <github.com/Odhinn3>
 */
public class PhoneNumber {
    private String phonenum;

    public PhoneNumber(String phonenum) {
        setPhonenum(phonenum);
    }

    public String getPhonenum() {
        return phonenum;
    }

    public void setPhonenum(String phonenum) {
        this.phonenum = phonenum;
    }
    
    @Override
    public String toString(){
        return "(" + phonenum.substring(0, 3) + ")" + phonenum.substring(3);
    }
    

    @Override
    public int hashCode(){
        return (int) (Long.parseLong(phonenum)/10000 + Long.parseLong(phonenum)-999000000);
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
        final PhoneNumber other = (PhoneNumber) obj;
        if (!Objects.equals(this.phonenum, other.phonenum)) {
            return false;
        }
        return true;
    }
}
