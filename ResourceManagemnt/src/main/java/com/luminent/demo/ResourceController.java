package com.luminent.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ResourceController {

    @RequestMapping(value = "/resource/{id}", method = RequestMethod.POST)
    public void createOrder(@PathVariable String id) {


    }

}
