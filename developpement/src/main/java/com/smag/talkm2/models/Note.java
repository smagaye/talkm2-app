package com.smag.talkm2.models;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
public class Note {
    private int idNote;
    private int idStudent;
    private int idGroup;
    private Integer presentation;
    private Integer content;
    private Integer explanation;
    private Integer answer;
    private Integer workshop;
    private String remark;
    private Timestamp notedTime;

    @Id
    @Column(name = "id_note")
    public int getIdNote() {
        return idNote;
    }

    public void setIdNote(int idNote) {
        this.idNote = idNote;
    }

    @Basic
    @Column(name = "id_student")
    public int getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(int idStudent) {
        this.idStudent = idStudent;
    }

    @Basic
    @Column(name = "id_group")
    public int getIdGroup() {
        return idGroup;
    }

    public void setIdGroup(int idGroup) {
        this.idGroup = idGroup;
    }

    @Basic
    @Column(name = "presentation")
    public Integer getPresentation() {
        return presentation;
    }

    public void setPresentation(Integer presentation) {
        this.presentation = presentation;
    }

    @Basic
    @Column(name = "content")
    public Integer getContent() {
        return content;
    }

    public void setContent(Integer content) {
        this.content = content;
    }

    @Basic
    @Column(name = "explanation")
    public Integer getExplanation() {
        return explanation;
    }

    public void setExplanation(Integer explanation) {
        this.explanation = explanation;
    }

    @Basic
    @Column(name = "answer")
    public Integer getAnswer() {
        return answer;
    }

    public void setAnswer(Integer answer) {
        this.answer = answer;
    }

    @Basic
    @Column(name = "workshop")
    public Integer getWorkshop() {
        return workshop;
    }

    public void setWorkshop(Integer workshop) {
        this.workshop = workshop;
    }

    @Basic
    @Column(name = "remark")
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Basic
    @Column(name = "noted_time")
    public Timestamp getNotedTime() {
        return notedTime;
    }

    public void setNotedTime(Timestamp notedTime) {
        this.notedTime = notedTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Note note = (Note) o;
        return idNote == note.idNote &&
                idStudent == note.idStudent &&
                idGroup == note.idGroup &&
                Objects.equals(presentation, note.presentation) &&
                Objects.equals(content, note.content) &&
                Objects.equals(explanation, note.explanation) &&
                Objects.equals(answer, note.answer) &&
                Objects.equals(workshop, note.workshop) &&
                Objects.equals(remark, note.remark) &&
                Objects.equals(notedTime, note.notedTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idNote, idStudent, idGroup, presentation, content, explanation, answer, workshop, remark, notedTime);
    }
}
