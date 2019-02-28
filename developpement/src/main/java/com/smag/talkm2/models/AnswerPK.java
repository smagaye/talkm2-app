package com.smag.talkm2.models;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class AnswerPK implements Serializable {
    private int idAnswer;
    private int idQuestion;
    private int idStudent;

    @Column(name = "id_answer")
    @Id
    public int getIdAnswer() {
        return idAnswer;
    }

    public void setIdAnswer(int idAnswer) {
        this.idAnswer = idAnswer;
    }

    @Column(name = "id_question")
    @Id
    public int getIdQuestion() {
        return idQuestion;
    }

    public void setIdQuestion(int idQuestion) {
        this.idQuestion = idQuestion;
    }

    @Column(name = "id_student")
    @Id
    public int getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(int idStudent) {
        this.idStudent = idStudent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AnswerPK answerPK = (AnswerPK) o;
        return idAnswer == answerPK.idAnswer &&
                idQuestion == answerPK.idQuestion &&
                idStudent == answerPK.idStudent;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idAnswer, idQuestion, idStudent);
    }
}
