package com.moteadev.Library_Management_API.borrow.service;

import com.moteadev.Library_Management_API.borrow.data.BorrowMainRepository;
import com.moteadev.Library_Management_API.borrow.dto.BorrowRequestBody;
import com.moteadev.Library_Management_API.borrow.model.BorrowModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BorrowService {

    private BorrowMainRepository borrowMainRepository;



    @Autowired
    public BorrowService(BorrowMainRepository borrowMainRepository) {
        this.borrowMainRepository = borrowMainRepository;
    }
    public boolean addBorrow(BorrowRequestBody borrowRequestBody){

        try {
            BorrowModel borrowModel=borrowRequestBody.createBorrowModel();
            borrowMainRepository.addBorrow(borrowModel);
            return true;
        }catch (Exception e){
            return false;
        }

    }
    public boolean removeBorrow(BorrowModel borrowModel){
        try {
            borrowMainRepository.removeBorrow(borrowModel);
            return true;
        }catch (Exception e){
            return false;
        }

    }

    public List<BorrowModel> getBorrowsByUserId(String userId){
        return borrowMainRepository.getAllBorrowsForUser(userId);

    }
    public List<BorrowModel> getAllBorrowedBooks(){
        return borrowMainRepository.getAllBorrows();

    }




}
