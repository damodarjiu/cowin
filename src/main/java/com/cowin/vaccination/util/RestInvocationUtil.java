package com.cowin.vaccination.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.http.*;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

import static java.util.Objects.nonNull;

@Component
public class RestInvocationUtil {

    @Autowired
    RestTemplate restTemplate;

    private <U, T> U postData(String url, T data, Class<U> clazz, HttpHeaders httpHeaders) {
        HttpEntity<T> httpEntity = new HttpEntity<>(data, httpHeaders);
        ResponseEntity<U> reponse = null;
        try {
            reponse = restTemplate.exchange(url, HttpMethod.POST, httpEntity, clazz);
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
        return reponse.getBody();
    }

    public <U, T> U postForObject(String url, T data, Class<U> clazz) {
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(MediaType.APPLICATION_JSON);
        httpHeaders.setAccept(List.of(MediaType.APPLICATION_JSON));
        return postData(url, data, clazz, httpHeaders);

    }
}
