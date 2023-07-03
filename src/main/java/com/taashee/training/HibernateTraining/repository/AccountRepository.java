package com.taashee.training.HibernateTraining.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.taashee.training.HibernateTraining.entity.Account;

@Repository
public interface AccountRepository extends CrudRepository<Account,Integer>{

}
