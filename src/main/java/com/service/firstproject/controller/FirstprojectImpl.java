package com.service.firstproject.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.apache.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2018-03-27T08:04:36.088Z")

@RestSchema(schemaId = "firstproject")
@RequestMapping(path = "/first-project", produces = MediaType.APPLICATION_JSON)
public class FirstprojectImpl {

    @Autowired
    private FirstprojectDelegate userFirstprojectDelegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userFirstprojectDelegate.helloworld(name);
    }

}
