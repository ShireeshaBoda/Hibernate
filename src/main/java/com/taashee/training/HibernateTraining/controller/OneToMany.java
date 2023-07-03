package com.taashee.training.HibernateTraining.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.taashee.training.HibernateTraining.entity.AadharCard;
import com.taashee.training.HibernateTraining.entity.Account;
import com.taashee.training.HibernateTraining.entity.IndianCitizen;
import com.taashee.training.HibernateTraining.entity.Person;
import com.taashee.training.HibernateTraining.repository.AadharRepository;
import com.taashee.training.HibernateTraining.repository.AccountRepository;
import com.taashee.training.HibernateTraining.repository.CitizenRepository;
import com.taashee.training.HibernateTraining.repository.PersonRepository;

@RestController
@RequestMapping("/oneToMany")
public class OneToMany {
	@Autowired
	PersonRepository personRepo;
	@Autowired
	AccountRepository accountRepo;
   @GetMapping("/persons")
   public List<Person> getPersons(){
	   return (List<Person>)personRepo.findAll();
   }
   @PostMapping("/person")
   public Person savePerson(@RequestBody Person person)
   {
	   return personRepo.save(person);
   }
   @PostMapping("/account")
   public Account saveAccount(@RequestBody Account account)
   {
	   return accountRepo.save(account);
   }
   @GetMapping("/account/{:id}")
   public Account getAccount(@PathVariable int id){
	   return accountRepo.findById(id).get();
   }
}
