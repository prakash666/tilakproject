package com.crud.Diyo.repository;


import com.crud.Diyo.entity.MobileEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MobileRepository extends JpaRepository<MobileEntity, Integer> {
}
