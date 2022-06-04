package com.springonly.bicicletaserver.controller;

import com.springonly.bicicletaserver.model.Bicicleta;
import com.springonly.bicicletaserver.service.BicicletaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bicicleta")
public class BicicletaController {
    @Autowired
    private BicicletaService bicicletaService;

    @GetMapping("/")
    public ResponseEntity<Bicicleta> getList() {
        return new ResponseEntity(bicicletaService.getList(), HttpStatus.OK);
    }
}
