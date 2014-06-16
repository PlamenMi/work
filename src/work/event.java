/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package work;

/**
 *
 * @author as
 */
public class event {
    String Ev;
    String Date;
    Boolean Priority;

    public void setDate(String Date) {
        this.Date = Date;
    }

    public String getDate() {
        return Date;
    }

    public void setEv(String Ev) {
        this.Ev = Ev;
    }

    public String getEv() {
        return Ev;
    }

    public void setPriority(Boolean Priority) {
        this.Priority = Priority;
    }

    public Boolean getPriority() {
        return Priority;
    }
    
     public String toString() {
        return getEv() + getDate() + getPriority();
}
}

