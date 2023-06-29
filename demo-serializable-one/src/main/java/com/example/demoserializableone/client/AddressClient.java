package com.example.demoserializableone.client;

import com.example.demoserializableone.model.Address;
import com.example.demoserializableone.model.User;
import com.google.gson.Gson;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@Slf4j
@Component
public class AddressClient {

    @Autowired
    private RestTemplate restTemplate;

//    @Autowired
    private Gson gson;
    public ResponseEntity getAddress(User user) {

//        HttpHeaders requestHeaders = payload.generateHeader();
//        ResponseEntity<GeneralResponse<PaymentDailyLimitResponse>> response = restTemplate.exchange(
//                limitEndpoint,
//                HttpMethod.GET,
//                new HttpEntity<>(requestHeaders),
//                new ParameterizedTypeReference<GeneralResponse<PaymentDailyLimitResponse>>(){}
//        );

        String uri = "http://localhost:8002/demo-serializable-two/v1/address" ;

        HttpEntity<User> httpEntity = new HttpEntity<>(user);
        ResponseEntity<Address> responseEntity = restTemplate.exchange(
                uri,
                HttpMethod.POST,
                httpEntity,
                new ParameterizedTypeReference<Address>(){}
        );

        log.info("one - API Response Body : [{}]", new Gson().toJson(responseEntity));
        return responseEntity;
    }

}
