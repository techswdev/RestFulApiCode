package com.example.demo.controller;

import com.example.demo.constatnt.ResponseMessage;
import com.example.demo.constatnt.statusCode;
import com.example.demo.dto.DefaultRes;
import com.example.demo.dto.LoginReq;
import com.example.demo.dto.Message;
import com.example.demo.dto.StatusEnum;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.nio.charset.Charset;

@RestController
public class SampleController {

    @GetMapping("/login")
    public ResponseEntity<Message> getAllUser(@RequestBody LoginReq loginReq){
        return new ResponseEntity(DefaultRes.res(statusCode.OK, ResponseMessage.LOGIN_SUCCESS, loginReq), HttpStatus.OK);
    }
}
