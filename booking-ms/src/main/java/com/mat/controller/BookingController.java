package com.mat.controller;

import com.mat.entity.BookingEntity;
import com.mat.repository.BookingRepository;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/bookings")
public class BookingController {

    private BookingRepository repository;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<BookingEntity> getAllProducts(){
        return (List<BookingEntity>) repository.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createProduct(@RequestBody BookingEntity booking){
        repository.save(booking);
    }
}
