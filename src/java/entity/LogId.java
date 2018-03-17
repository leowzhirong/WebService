/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.sql.Timestamp;
import javax.persistence.Embeddable;

/**
 *
 * @author User
 */
@Embeddable
public class LogId {
    private UserEntity nric = new UserEntity();
    private Timestamp logTime;

    public UserEntity getNric() {
        return nric;
    }

    public void setNric(UserEntity nric) {
        this.nric = nric;
    }

    public Timestamp getLogTime() {
        return logTime;
    }

    public void setLogTime(Timestamp logTime) {
        this.logTime = logTime;
    }
    
    
}
