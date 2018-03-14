package com.ls.entity;

import org.springframework.stereotype.Repository;

@Repository
public class SystemConf {
    private Integer innerNote;

    private String noteContent;

    public Integer getInnerNote() {
        return innerNote;
    }

    public void setInnerNote(Integer innerNote) {
        this.innerNote = innerNote;
    }

    public String getNoteContent() {
        return noteContent;
    }

    public void setNoteContent(String noteContent) {
        this.noteContent = noteContent == null ? null : noteContent.trim();
    }
}