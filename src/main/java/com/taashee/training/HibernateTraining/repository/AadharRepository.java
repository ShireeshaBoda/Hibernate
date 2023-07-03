package com.taashee.training.HibernateTraining.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.taashee.training.HibernateTraining.entity.AadharCard;
@Repository
public interface AadharRepository extends CrudRepository<AadharCard,Integer> {

	

}
