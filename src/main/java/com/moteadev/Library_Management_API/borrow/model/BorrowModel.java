package com.moteadev.Library_Management_API.borrow.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.moteadev.Library_Management_API.books.models.Book;

import java.util.UUID;

public class BorrowModel {
    private String id;
    private String userId;
    private String bookId;
    private String startDate;
    private String endData;

    public BorrowModel(String userId, String bookId, String startDate, String endData) {
        this.id= UUID.randomUUID().toString();
        this.userId = userId;
        this.bookId = bookId;
        this.startDate = startDate;
        this.endData = endData;
    }

    @JsonCreator
    public BorrowModel(
            @JsonProperty("id")
            String id,
            @JsonProperty("userId")
            String userId,
            @JsonProperty("bookId")
            String bookId,
            @JsonProperty("startDate")
            String startDate,
            @JsonProperty("endDate")
            String endData) {
        this.id = id;
        this.userId = userId;
        this.bookId = bookId;
        this.startDate = startDate;
        this.endData = endData;
    }

    public BorrowModel() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndData() {
        return endData;
    }

    public void setEndData(String endData) {
        this.endData = endData;
    }

    @Override
    public String toString() {
        return "BorrowModel{" +
                "id='" + id + '\'' +
                ", userId='" + userId + '\'' +
                ", bookId='" + bookId + '\'' +
                ", startDate='" + startDate + '\'' +
                ", endData='" + endData + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // نفس المرجع
        if (obj == null || getClass() != obj.getClass()) return false;
        BorrowModel other = (BorrowModel) obj;
        return id.equals(other.getId());
    }
}

