package com.example;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by rcicero on 08/12/16.
 */

@RestController
public class HealthCheck {

    @RequestMapping(value = "/health", method = RequestMethod.GET)
    public ResponseEntity health(){
        return ResponseEntity.ok(null);
    }

}
