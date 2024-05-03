package com.mat.repository;

import com.mat.entity.BookingEntity;
import org.springframework.data.repository.CrudRepository;

public interface BookingRepository extends CrudRepository<BookingEntity, Number> {
}
