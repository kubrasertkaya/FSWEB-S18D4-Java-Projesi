package com.workintech.jpamany.service;

import com.workintech.jpamany.entity.Adress;
import com.workintech.jpamany.repository.AdressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class AdressServiceImpl implements AdressService{

    private AdressRepository adressRepository;


    @Autowired
    public AdressServiceImpl(AdressRepository adressRepository) {
        this.adressRepository = adressRepository;
    }

    @Override
    public List<Adress> findAll() {
        return null;
    }

    @Override
    public Adress find(int id) {
        return null;
    }

    @Override
    public Adress save(Adress adress) {
        return null;
    }

    @Override
    public void delete(int id) {

    }
}
