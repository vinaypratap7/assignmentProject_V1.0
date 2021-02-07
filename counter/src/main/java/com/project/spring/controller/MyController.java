package com.project.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;


import com.project.spring.service.TestService;


@CrossOrigin(origins = "*")
@RestController
public class MyController {

   @Autowired
   private TestService testService;

   /*---Update id---*/
   @PutMapping("/updateid")
   public ResponseEntity<?> update() {
	   testService.update();
      return ResponseEntity.ok().body("Id has been updated successfully.");
   }

   
}