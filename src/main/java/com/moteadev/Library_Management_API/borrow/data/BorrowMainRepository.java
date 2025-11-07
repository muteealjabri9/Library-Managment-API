package com.moteadev.Library_Management_API.borrow.data;

import com.moteadev.Library_Management_API.borrow.model.BorrowModel;

import java.util.List;

public interface BorrowMainRepository {

    public void addBorrow(BorrowModel borrowModel);
    public void removeBorrow(BorrowModel borrowModel);
    public List<BorrowModel> getAllBorrowsForUser(String userId);
    public List<BorrowModel> getAllBorrows();

}
