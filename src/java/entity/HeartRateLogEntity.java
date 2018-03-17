/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@Entity
@XmlRootElement
@XmlType(name = "heartRateLogEntity", propOrder = {
    "heartRateLogId",
    "heartRate"
})
public class HeartRateLogEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    private LogId heartRateLogId;
    private double heartRate;

    public LogId getHeartRateLogId() {
        return heartRateLogId;
    }

    public void setHeartRateLogId(LogId heartRateLogId) {
        this.heartRateLogId = heartRateLogId;
    }

    public double getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(double heartRate) {
        this.heartRate = heartRate;
    }


    @Override
    public int hashCode() {
        int hash = 0;
        hash += (heartRateLogId != null ? heartRateLogId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof HeartRateLogEntity)) {
            return false;
        }
        HeartRateLogEntity other = (HeartRateLogEntity) object;
        if ((this.heartRateLogId == null && other.heartRateLogId != null) || (this.heartRateLogId != null && !this.heartRateLogId.equals(other.heartRateLogId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.HeartRateLogEntity[ id=" + heartRateLogId + " ]";
    }
    
}
