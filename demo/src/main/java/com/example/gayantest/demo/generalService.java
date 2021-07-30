package com.example.gayantest.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * The type Booking service.
 */
@Service
@Slf4j
public class generalService {

 public String getFiles(String reqId){

     List names = new ArrayList();
     names.add(0,"Gayan");
     names.add(1,"Prabhashi");
     names.add(2,"Prasad");

     Optional getName = Optional.of(names.get(0));
     Optional getName1 = Optional.of(names.get(1));
     Optional getName2 = Optional.of(names.get(1));

     String name = "Gayan";
     if(reqId.equals("1")) {
         if(getName.isPresent()) {
             name = names.get(0).toString();
         }
     }
     else if(reqId.equals("2")){
         if(getName1.isPresent()) {
             name = names.get(1).toString();
         }
     }
     else if(reqId.equals("3")){
         if(getName2.isPresent()) {
             name = names.get(2).toString();
         }
     }
     else{
         name = "Invalid User";
     }
     return name;
 }


}
