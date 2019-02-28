package com.smag.talkm2.models;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
public class Student {
    private int idStudent;
    private String firstname;
    private String lastname;
    private String email;
    private String phone;
    private String profil;
    private Timestamp dateInscription;
    private String accessKey;

    @Id
    @Column(name = "id_student")
    public int getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(int idStudent) {
        this.idStudent = idStudent;
    }

    @Basic
    @Column(name = "firstname")
    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    @Basic
    @Column(name = "lastname")
    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @Basic
    @Column(name = "email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "phone")
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Basic
    @Column(name = "profil")
    public String getProfil() {
        return profil;
    }

    public void setProfil(String profil) {
        this.profil = profil;
    }

    @Basic
    @Column(name = "date_inscription")
    public Timestamp getDateInscription() {
        return dateInscription;
    }

    public void setDateInscription(Timestamp dateInscription) {
        this.dateInscription = dateInscription;
    }

    @Basic
    @Column(name = "access_key")
    public String getAccessKey() {
        return accessKey;
    }

    public void setAccessKey(String accessKey) {
        this.accessKey = accessKey;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return idStudent == student.idStudent &&
                Objects.equals(firstname, student.firstname) &&
                Objects.equals(lastname, student.lastname) &&
                Objects.equals(email, student.email) &&
                Objects.equals(phone, student.phone) &&
                Objects.equals(profil, student.profil) &&
                Objects.equals(dateInscription, student.dateInscription) &&
                Objects.equals(accessKey, student.accessKey);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idStudent, firstname, lastname, email, phone, profil, dateInscription, accessKey);
    }
}
