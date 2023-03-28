package com.govt.dtdc.repository;

import com.govt.dtdc.entity.DtdcEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DtdcRepository extends JpaRepository<DtdcEntity,Long> {


}
