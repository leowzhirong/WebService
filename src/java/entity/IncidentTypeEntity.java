/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author User
 */
@Entity
@XmlRootElement
@XmlType(name = "incidentTypeEntity", propOrder = {
    "incidentTypeId",
    "incidentName"
})
public class IncidentTypeEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int incidentTypeId;
    private int incidentName;

    
    public int getIncidentTypeId() {
        return incidentTypeId;
    }

    public void setIncidentTypeId(int incidentTypeId) {
        this.incidentTypeId = incidentTypeId;
    }

    public int getIncidentName() {
        return incidentName;
    }

    public void setIncidentName(int incidentName) {
        this.incidentName = incidentName;
    }


    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) incidentTypeId;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof IncidentTypeEntity)) {
            return false;
        }
        IncidentTypeEntity other = (IncidentTypeEntity) object;
        if (this.incidentTypeId != other.incidentTypeId) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.IncidentTypeEntity[ id=" + incidentTypeId + " ]";
    }
    
}
