package com.demo.myfileupload.entity;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Collection;

@Entity
@Table(name = "filedetails", schema = "fileupload")
public class FileDetails implements Serializable {
    @Id
    public String uid;
    public String fileName;
    public String fileType;
    public String uploadedBy;

    @ElementCollection
    private Collection<String> customTags;

    @ElementCollection
    private Collection<String> evalTags;

    public String summary;

    @ElementCollection
    private Collection<String> relatedFiles;

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public String getUploadedBy() {
        return uploadedBy;
    }

    public void setUploadedBy(String uploadedBy) {
        this.uploadedBy = uploadedBy;
    }

    public Collection<String> getCustomTags() {
        return customTags;
    }

    public void setCustomTags(Collection<String> customTags) {
        this.customTags = customTags;
    }

    public Collection<String> getEvalTags() {
        return evalTags;
    }

    public void setEvalTags(Collection<String> evalTags) {
        this.evalTags = evalTags;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public Collection<String> getRelatedFiles() {
        return relatedFiles;
    }

    public void setRelatedFiles(Collection<String> relatedFiles) {
        this.relatedFiles = relatedFiles;
    }
}
