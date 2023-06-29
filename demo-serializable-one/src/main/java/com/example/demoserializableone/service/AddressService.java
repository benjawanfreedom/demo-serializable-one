package com.example.demoserializableone.service;

import com.example.demoserializableone.client.AddressClient;
import com.example.demoserializableone.model.Address;
import com.example.demoserializableone.model.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class AddressService {

    @Autowired
    private AddressClient client;

//    public Address getAddressByName(String name) {
//        log.info("Name is {}", name);
//        return setAddress(name);
//    }

//    private Address setAddress(String name) {
//        Address defaultAdd = new Address("000","House Zero", "Default");
//        Address pentagonAdd = new Address("111","House A", "Pentagon");
//        Address kingdomAdd = new Address("222","House B", "Kingdom");
//
//        switch (name) {
//            case "pentagon":
//                return pentagonAdd;
//            case "kingdom":
//                return kingdomAdd;
//            default:
//                log.info("Name not match");
//                return defaultAdd;
//        }
//    }


    public Address getAddressByName(User user) {
        ResponseEntity<Address> responseEntity = client.getAddress(user);
        return responseEntity.getBody();
    }
}
