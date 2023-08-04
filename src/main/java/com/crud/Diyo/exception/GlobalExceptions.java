package com.crud.Diyo.exception;


import com.crud.Diyo.model.MobileModel;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.ArrayList;
import java.util.List;

@RestControllerAdvice
public class GlobalExceptions {


    @ExceptionHandler (MethodArgumentNotValidException.class)
    public List<MobileModel> methodArgument(MethodArgumentNotValidException exception){
        List<MobileModel> mobileModelList = new ArrayList<>();
        exception.getBindingResult().getFieldErrors().forEach(fieldError -> {
            MobileModel mobileModel = new MobileModel(fieldError.getField(),fieldError.getDefaultMessage());
            mobileModelList.add(mobileModel);
        });
        return mobileModelList;
    }
}
