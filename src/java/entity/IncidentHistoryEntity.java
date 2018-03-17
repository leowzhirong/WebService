/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author User
 */
@Entity
@XmlRootElement
@XmlType(name = "incidentHistoryEntity", propOrder = {
    "incidentId",
    "incidentType"
})
public class IncidentHistoryEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    private LogId incidentId;
    @ManyToOne(cascade={CascadeType.ALL})
    private IncidentTypeEntity incidentType;

    public LogId getIncidentId() {
        return incidentId;
    }

    public void setIncidentId(LogId incidentId) {
        this.incidentId = incidentId;
    }

    public IncidentTypeEntity getIncidentType() {
        return incidentType;
    }

    public void setIncidentType(IncidentTypeEntity incidentType) {
        this.incidentType = incidentType;
    }


    @Override
    public int hashCode() {
        int hash = 0;
        hash += (incidentId != null ? incidentId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof IncidentHistoryEntity)) {
            return false;
        }
        IncidentHistoryEntity other = (IncidentHistoryEntity) object;
        if ((this.incidentId == null && other.incidentId != null) || (this.incidentId != null && !this.incidentId.equals(other.incidentId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.IncidentHistoryEntity[ id=" + incidentId + " ]";
    }
    
}
