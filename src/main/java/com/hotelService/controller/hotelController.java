package com.hotelService.controller;

import com.hotelService.entity.Hotel;
import com.hotelService.service.hotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hotel")
public class hotelController {
    @Autowired
    private hotelService hotelService;

    @PostMapping
    public ResponseEntity<Hotel> create(@RequestBody Hotel hotel)
    {
        Hotel hotel1 = hotelService.create(hotel);
        return new ResponseEntity<>(hotel1, HttpStatus.CREATED);
    }

    @GetMapping("/{hotelId}")
    public ResponseEntity<Hotel> getById(@PathVariable String hotelId)
    {
         Hotel hotel = hotelService.getById(hotelId);
         return new ResponseEntity<>(hotel,HttpStatus.OK);
    }
    @GetMapping
    public ResponseEntity<List<Hotel>> getAll()
    {
        List<Hotel> hotels = hotelService.getAll();
        return new ResponseEntity<>(hotels,HttpStatus.OK);
    }
}
