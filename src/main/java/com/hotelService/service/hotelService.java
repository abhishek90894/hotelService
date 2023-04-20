package com.hotelService.service;

import com.hotelService.entity.Hotel;

import java.util.List;

public interface hotelService {

    //create
      Hotel create(Hotel hotel);

      //get by hotelId

     Hotel getById(String id);

     // get all
    List<Hotel> getAll();
}
