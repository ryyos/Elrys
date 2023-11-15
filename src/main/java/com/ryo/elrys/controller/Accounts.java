package com.ryo.elrys.controller;

import com.ryo.elrys.model.DTO.AccountsDTO;
import com.ryo.elrys.response.BodyResponse;
import com.ryo.elrys.response.DataResponse;
import com.ryo.elrys.service.AccountsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("/api")
public class Accounts {

    @Autowired
    AccountsService accountsService;

    @PostMapping("/register")
    public ResponseEntity<BodyResponse<DataResponse>> register(AccountsDTO accountsDTO) throws IOException {
        return ResponseEntity.ok()
                .body(BodyResponse.<DataResponse>builder()
                        .status(accountsService.register(accountsDTO))
                        .data(new DataResponse(accountsDTO))
                        .build());

    }
}
