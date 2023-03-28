package com.govt.dtdc.service;

import com.govt.dtdc.entity.DtdcEntity;
import com.govt.dtdc.repository.DtdcRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DtdcService {

    @Autowired
    private DtdcRepository dtdcRepository;
    public DtdcEntity add(DtdcEntity entity) {
        return  dtdcRepository.save(entity);
    }
}
