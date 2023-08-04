package com.crud.Diyo.service;

import com.crud.Diyo.entity.MobileEntity;
import com.crud.Diyo.repository.MobileRepository;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MobileService {

    private final MobileRepository mobileRepository;

    public MobileService(MobileRepository mobileRepository){
        this.mobileRepository = mobileRepository;
    }

    public void post(MobileEntity mobileEntity){
        mobileRepository.save(mobileEntity);
    }

    public void update(MobileEntity mobileEntity) {
        Optional<MobileEntity> mobileEntityOptional = mobileRepository.findById(mobileEntity.getId());
        if (mobileEntityOptional.isPresent()){
            mobileRepository.save(mobileEntity);
        }
    }

    public void patchData(MobileEntity mobileEntity){
        Optional<MobileEntity> mobileEntityOptional = mobileRepository.findById(mobileEntity.getId());
        if (mobileEntityOptional.isPresent()){

            MobileEntity previousData = mobileEntityOptional.get();
            if (mobileEntity.getName()  != null){
                previousData.setName(mobileEntity.getName());
            }
            if (mobileEntity.getType() !=null){
                previousData.setType(mobileEntity.getType());
            }
            if (mobileEntity.getColor() != null){
                previousData.setColor(mobileEntity.getColor());
            }
            if (mobileEntity.getPrice() != null){
                previousData.setPrice(mobileEntity.getPrice());
            }
        }
        mobileRepository.save(mobileEntity);
    }
}
