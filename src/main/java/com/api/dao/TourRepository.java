package com.api.dao;

import org.springframework.data.repository.CrudRepository;

import com.api.model.TourUser;

public interface TourRepository extends CrudRepository<TourUser,Integer>{

}
