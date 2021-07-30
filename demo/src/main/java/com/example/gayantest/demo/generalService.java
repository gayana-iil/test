package com.example.gayantest.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * The type Booking service.
 */
@Service
@Slf4j
public class generalService {

 public String getFiles(String reqId){
     String name = "Gayan";
     if(reqId.equals("1")) {
         name = "Gayan";
     }
     else if(reqId.equals("2")){
         name = "Prabhashi";
     }
     else if(reqId.equals("3")){
         name = "Prasad";
     }
     else{
         name = "Invalid User";
     }
     return name;
 }


}
