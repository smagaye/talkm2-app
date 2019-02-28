package com.smag.talkm2.models;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
public class Group {
    private int idGroup;
    private Integer documentSize;
    private String note;
    private Timestamp datecreation;

    @Id
    @Column(name = "id_group")
    public int getIdGroup() {
        return idGroup;
    }

    public void setIdGroup(int idGroup) {
        this.idGroup = idGroup;
    }

    @Basic
    @Column(name = "document_size")
    public Integer getDocumentSize() {
        return documentSize;
    }

    public void setDocumentSize(Integer documentSize) {
        this.documentSize = documentSize;
    }

    @Basic
    @Column(name = "note")
    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Basic
    @Column(name = "datecreation")
    public Timestamp getDatecreation() {
        return datecreation;
    }

    public void setDatecreation(Timestamp datecreation) {
        this.datecreation = datecreation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Group group = (Group) o;
        return idGroup == group.idGroup &&
                Objects.equals(documentSize, group.documentSize) &&
                Objects.equals(note, group.note) &&
                Objects.equals(datecreation, group.datecreation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idGroup, documentSize, note, datecreation);
    }
}
