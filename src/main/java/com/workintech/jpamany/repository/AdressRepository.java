package com.workintech.jpamany.repository;

import com.workintech.jpamany.entity.Adress;
import org.hibernate.type.descriptor.converter.spi.JpaAttributeConverter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdressRepository extends JpaRepository<Adress,Integer> {
}
