package com.workintech.jpamany.controller;

import com.workintech.jpamany.service.AdressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/adress")
public class AdressController {

    private AdressService adressService;

    @Autowired
    public AdressController(AdressService adressService) {
        this.adressService = adressService;
    }
}
