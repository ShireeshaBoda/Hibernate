package com.taashee.training.HibernateTraining.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.taashee.training.HibernateTraining.entity.Account;
import com.taashee.training.HibernateTraining.entity.Person;

@Repository
public interface PersonRepository extends CrudRepository<Person,Integer>{

}
