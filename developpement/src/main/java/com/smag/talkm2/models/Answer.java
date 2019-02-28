package com.smag.talkm2.models;

import javax.persistence.*;
import java.util.Objects;

@Entity
@IdClass(AnswerPK.class)
public class Answer {
    private int idAnswer;
    private int idQuestion;
    private int idStudent;
    private String content;

    @Id
    @Column(name = "id_answer")
    public int getIdAnswer() {
        return idAnswer;
    }

    public void setIdAnswer(int idAnswer) {
        this.idAnswer = idAnswer;
    }

    @Id
    @Column(name = "id_question")
    public int getIdQuestion() {
        return idQuestion;
    }

    public void setIdQuestion(int idQuestion) {
        this.idQuestion = idQuestion;
    }

    @Id
    @Column(name = "id_student")
    public int getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(int idStudent) {
        this.idStudent = idStudent;
    }

    @Basic
    @Column(name = "content")
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Answer answer = (Answer) o;
        return idAnswer == answer.idAnswer &&
                idQuestion == answer.idQuestion &&
                idStudent == answer.idStudent &&
                Objects.equals(content, answer.content);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idAnswer, idQuestion, idStudent, content);
    }
}
