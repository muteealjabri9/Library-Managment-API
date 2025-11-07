package com.moteadev.Library_Management_API.borrow.data;

import com.moteadev.Library_Management_API.borrow.model.BorrowModel;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

@Component
public class MockBorrowMainRepositoryImpl implements BorrowMainRepository{


    @PreDestroy
    public void destroyBean(){
        //
        System.out.println("Bean Destory");
    }
    List<BorrowModel> borrowModels=new ArrayList<>();
    @PostConstruct
    public void initBean(){
       // borrowModels.add(new BorrowModel("userId","bookId","1-11-2024","5-11-2025"));
       // borrowModels.add(new BorrowModel("userId","bookId","7-11-2024","15-11-2025"));
    }


    @Override
    public void addBorrow(BorrowModel borrowModel) {
        this.borrowModels.add(borrowModel);
    }

    @Override
    public void removeBorrow(BorrowModel borrowModel) {
       borrowModels.remove(borrowModel);
    }

    @Override
    public List<BorrowModel> getAllBorrowsForUser(String userId) {
        List<BorrowModel> result=new ArrayList<>();
        borrowModels.forEach(new Consumer<BorrowModel>() {
            @Override
            public void accept(BorrowModel borrowModel) {
                if(borrowModel.getUserId().equals(userId)){
                    result.add(borrowModel);
                }
            }
        });
        return result;
    }

    @Override
    public List<BorrowModel> getAllBorrows() {
        return borrowModels;
    }
}
