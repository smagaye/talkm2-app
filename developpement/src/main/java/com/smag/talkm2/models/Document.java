package com.smag.talkm2.models;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Document {
    private int idDocument;
    private int idGroup;
    private int idStudent;
    private String object;
    private String documentUrl;
    private String uploadedTime;
    private String slug;

    @Id
    @Column(name = "id_document")
    public int getIdDocument() {
        return idDocument;
    }

    public void setIdDocument(int idDocument) {
        this.idDocument = idDocument;
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
    @Column(name = "id_student")
    public int getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(int idStudent) {
        this.idStudent = idStudent;
    }

    @Basic
    @Column(name = "object")
    public String getObject() {
        return object;
    }

    public void setObject(String object) {
        this.object = object;
    }

    @Basic
    @Column(name = "document_url")
    public String getDocumentUrl() {
        return documentUrl;
    }

    public void setDocumentUrl(String documentUrl) {
        this.documentUrl = documentUrl;
    }

    @Basic
    @Column(name = "uploaded_time")
    public String getUploadedTime() {
        return uploadedTime;
    }

    public void setUploadedTime(String uploadedTime) {
        this.uploadedTime = uploadedTime;
    }

    @Basic
    @Column(name = "slug")
    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Document document = (Document) o;
        return idDocument == document.idDocument &&
                idGroup == document.idGroup &&
                idStudent == document.idStudent &&
                Objects.equals(object, document.object) &&
                Objects.equals(documentUrl, document.documentUrl) &&
                Objects.equals(uploadedTime, document.uploadedTime) &&
                Objects.equals(slug, document.slug);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idDocument, idGroup, idStudent, object, documentUrl, uploadedTime, slug);
    }
}
