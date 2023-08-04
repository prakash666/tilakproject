package com.crud.Diyo.controller;


import com.crud.Diyo.entity.MobileEntity;
import com.crud.Diyo.service.MobileService;
import jakarta.persistence.PersistenceUnit;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/mobile")
public class MobileController {

    private final MobileService mobileService;

    public MobileController(MobileService mobileService){
        this.mobileService = mobileService;
    }

    @PostMapping("/post")
    public ResponseEntity <String> post(@RequestBody @Valid MobileEntity mobileEntity){
        mobileService.post(mobileEntity);
        return ResponseEntity.ok("the data has been posted in database");
    }




    @PatchMapping()
    public String patchData(@RequestBody MobileEntity mobileEntity){
        mobileService.patchData(mobileEntity);
        return "the data has been patched";
    }
}
