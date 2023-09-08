package com.workintech.jpamany.service;

import com.workintech.jpamany.entity.Adress;

import java.util.List;

public interface AdressService {
    List<Adress>  findAll();
    Adress find(int id);
    Adress save(Adress adress);
    void delete(int id);
}
