package com.example.demoserializableone.controller;

import com.example.demoserializableone.model.Address;
import com.example.demoserializableone.model.User;
import com.example.demoserializableone.service.AddressService;
import com.google.gson.Gson;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class AddressController {

    @Autowired
    private AddressService addressService;

    @PostMapping(value = "/v1/address", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity getAddress(@RequestBody User user) {
        log.info("one - Request : [{}]", new Gson().toJson(user.getName()));

        Address add = addressService.getAddressByName(user);

        return new ResponseEntity(add, HttpStatus.OK);
    }




}
