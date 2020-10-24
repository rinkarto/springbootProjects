package com.nextlevel.hoteldal.repos;

import org.springframework.data.repository.CrudRepository;

import com.nextlevel.hoteldal.entities.Hotel;

public interface HotelRepository extends CrudRepository<Hotel, Integer> {

}
