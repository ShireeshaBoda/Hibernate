package com.taashee.training.HibernateTraining.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.taashee.training.HibernateTraining.entity.IndianCitizen;
@Repository
public interface CitizenRepository extends CrudRepository<IndianCitizen,Integer>{

	


}
