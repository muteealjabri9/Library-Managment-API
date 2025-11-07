package com.moteadev.Library_Management_API.borrow.dto;

import com.moteadev.Library_Management_API.borrow.model.BorrowModel;

public class BorrowRequestBody {

    private String userId;
    private String bookId;
    private String startDate;
    private String endDate;

    public BorrowRequestBody(String userId, String bookId, String startDate, String endData) {
        this.userId = userId;
        this.bookId = bookId;
        this.startDate = startDate;
        this.endDate = endData;
    }

    public BorrowModel createBorrowModel(){
        return new BorrowModel(
          getUserId(),
          getBookId(),
          getStartDate(),
          getEndDate()
        );
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
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

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }
}
