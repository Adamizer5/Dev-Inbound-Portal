package com.ateam.devinboundportalapi.persistence.entity;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "REQUEST")
public class Request {

    public enum Priority {
        LOW, MEDIUM, HIGH, OMG
    }

    public enum Status {
        CLOSED, PENDING, IN_PROGRESS
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", unique = true, nullable = false)
    private int id;

    @Column(name = "SUBJECT", nullable = false, length = 150)
    private String subject;

    @Column(name = "TICKET", nullable = true, length = 9)
    private String ticketNumber;

    @Column(name = "TASK", nullable = true, length = 9)
    private String taskNumber;

    @Column(name = "REQUESTED_BY", nullable = false, length = 50)
    private String requestedBy;

    @Column(name = "PRIORITY", nullable = false, length = 20)
    private Priority priority;

    @Column(name = "STATUS", nullable = false, length = 20)
    private Status status;

    @Lob
    @Column(name = "NOTES", nullable = true)
    private String notes;

    @Column(name = "DATE_RESOLVED", nullable = true)
    private Date dateResolved;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getTicketNumber() {
        return ticketNumber;
    }

    public void setTicketNumber(String ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    public String getTaskNumber() {
        return taskNumber;
    }

    public void setTaskNumber(String taskNumber) {
        this.taskNumber = taskNumber;
    }

    public String getRequestedBy() {
        return requestedBy;
    }

    public void setRequestedBy(String requestedBy) {
        this.requestedBy = requestedBy;
    }

    public Priority getPriority() {
        return priority;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public Date getDateResolved() {
        return dateResolved;
    }

    public void setDateResolved(Date dateResolved) {
        this.dateResolved = dateResolved;
    }
}
