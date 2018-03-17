/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author User
 */
@Entity
@XmlRootElement
@XmlType(name = "userEntity", propOrder = {
    "nric",
    "name",
    "password",
    "contact",
    "gender",
    "email",
    "address",
    "bloodType",
    "dob",
    "heartRate",
    "isDoctor",
    "eContact",
    "wrongPasswordCount",
    "accountLock",
    "patientList",
    "careGiverList",
    "heartRateLogList"
})
public class UserEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    private String nric;
    private String name;
    private String password;
    private String contact;
    private String gender;
    private String email;
    private String address;
    private String bloodType;
    @Temporal(TemporalType.DATE) 
    private Date dob;
    private double heartRate;
    private boolean isDoctor;
    private String eContact;
    private int wrongPasswordCount;
    private boolean accountLock;
    @ManyToMany(cascade={CascadeType.PERSIST})
    private Collection<UserEntity> patientList = new ArrayList<UserEntity>();
    
    @ManyToMany(cascade={CascadeType.ALL}, mappedBy = "patientList")
    private Collection<UserEntity> careGiverList = new ArrayList<UserEntity>();

    @OneToMany(cascade={CascadeType.ALL}, mappedBy = "nric")
    private Collection<UserEntity> heartRateLogList = new ArrayList<UserEntity>();

    
    
    public Collection<UserEntity> getHeartRateLogList() {
        return heartRateLogList;
    }

    public void setHeartRateLogList(Collection<UserEntity> heartRateLogList) {
        this.heartRateLogList = heartRateLogList;
    }
    
    public Collection<UserEntity> getPatientList() {
        return patientList;
    }

    public void setPatientList(Collection<UserEntity> patientList) {
        this.patientList = patientList;
    }

    public Collection<UserEntity> getCareGiverList() {
        return careGiverList;
    }

    public void setCareGiverList(Collection<UserEntity> careGiverList) {
        this.careGiverList = careGiverList;
    }

    public String getNric() {
        return nric;
    }

    public void setNric(String nric) {
        this.nric = nric;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public double getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(double heartRate) {
        this.heartRate = heartRate;
    }

    public boolean isIsDoctor() {
        return isDoctor;
    }

    public void setIsDoctor(boolean isDoctor) {
        this.isDoctor = isDoctor;
    }

    public String geteContact() {
        return eContact;
    }

    public void seteContact(String eContact) {
        this.eContact = eContact;
    }

    public int getWrongPasswordCount() {
        return wrongPasswordCount;
    }

    public void setWrongPasswordCount(int wrongPasswordCount) {
        this.wrongPasswordCount = wrongPasswordCount;
    }

    public boolean isAccountLock() {
        return accountLock;
    }

    public void setAccountLock(boolean accountLock) {
        this.accountLock = accountLock;
    }

    
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nric != null ? nric.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UserEntity)) {
            return false;
        }
        UserEntity other = (UserEntity) object;
        if ((this.nric == null && other.nric != null) || (this.nric != null && !this.nric.equals(other.nric))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.UserEntity[ id=" + nric + " ]";
    }
    
}
