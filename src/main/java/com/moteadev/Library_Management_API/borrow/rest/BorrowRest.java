package com.moteadev.Library_Management_API.borrow.rest;

import com.moteadev.Library_Management_API.borrow.dto.BorrowRequestBody;
import com.moteadev.Library_Management_API.borrow.model.BorrowModel;
import com.moteadev.Library_Management_API.borrow.service.BorrowService;
import com.moteadev.Library_Management_API.util.response.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/borrows")
public class BorrowRest {

    private BorrowService borrowService;

    @Autowired
    public BorrowRest(BorrowService borrowService) {
        this.borrowService = borrowService;
    }

    @DeleteMapping("/removeBorrow")
    public ResponseUtil<Boolean> removedBorrow(@RequestBody BorrowModel borrowModel){
        System.out.println(borrowModel.toString());

        boolean isBorrowedDone=borrowService.removeBorrow(borrowModel);
        return new ResponseUtil<Boolean>(isBorrowedDone,
                isBorrowedDone?"Return Book":"Fail While return book",isBorrowedDone
        );
    }
    @PostMapping("/addBorrow")
    public ResponseUtil<Boolean> addBorrow(@RequestBody BorrowRequestBody borrowRequestBody){
        boolean isBorrowedDone=borrowService.addBorrow(borrowRequestBody);
        return new ResponseUtil<Boolean>(isBorrowedDone,
        isBorrowedDone?"BorrowDone":"BorrowUnDone",isBorrowedDone
        );
    }
    @GetMapping("/loadborrows/{userId}")
    public ResponseUtil<List<BorrowModel>> getAllBorrowsBooksForUser(
            @PathVariable("userId") String userId){
        List<BorrowModel> borrowModelList=borrowService.getBorrowsByUserId(userId);
        return new ResponseUtil<List<BorrowModel>>(
             true,
              "Data Loaded",borrowModelList

        );
    }

    @GetMapping("/loadborrows")
    public ResponseUtil<List<BorrowModel>> getAllBorrowsBooks(){
        List<BorrowModel> borrowModelList=borrowService.getAllBorrowedBooks();
        return new ResponseUtil<List<BorrowModel>>(
                true,
                "Data Loaded",borrowModelList

        );
    }


}
