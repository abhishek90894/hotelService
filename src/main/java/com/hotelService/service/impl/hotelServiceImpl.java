package com.hotelService.service.impl;


import com.hotelService.entity.Hotel;
import com.hotelService.exception.ResourceNotfoundException;
import com.hotelService.repository.HotelRepository;
import com.hotelService.service.hotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class hotelServiceImpl implements hotelService {

    @Autowired
      private HotelRepository hotelRepository;
    @Override
    public Hotel create(Hotel hotel) {
        String id = UUID.randomUUID().toString();
        hotel.setId(id);
        return hotelRepository.save(hotel) ;
    }

    @Override
    public Hotel getById(String id) {
        Hotel hotel = hotelRepository.findById(id).orElseThrow(()->new ResourceNotfoundException("hotel not found for given id"));

        return hotel;
    }

    @Override
    public List<Hotel> getAll() {
        List<Hotel> hotels = hotelRepository.findAll();
        return hotels;
    }
}
