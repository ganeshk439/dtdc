package com.govt.dtdc.controller;


import com.govt.dtdc.entity.DtdcEntity;
import com.govt.dtdc.service.DtdcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/com.govt")
public class DtdcController {

    @Autowired
    private DtdcService dtdcService;

    @PostMapping("/add")
    public DtdcEntity addEntity(@RequestBody DtdcEntity  entity){
        return dtdcService.add(entity);
    }
}
