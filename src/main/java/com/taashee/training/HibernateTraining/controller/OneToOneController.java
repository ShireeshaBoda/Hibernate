package com.taashee.training.HibernateTraining.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.taashee.training.HibernateTraining.entity.AadharCard;
import com.taashee.training.HibernateTraining.entity.IndianCitizen;
import com.taashee.training.HibernateTraining.repository.AadharRepository;
import com.taashee.training.HibernateTraining.repository.CitizenRepository;

@RestController
@RequestMapping("/oneToOne")
public class OneToOneController {
	@Autowired
	CitizenRepository citizenRepo;
	@Autowired
	AadharRepository aadharRepo;
   @GetMapping("/citizens")
   public List<IndianCitizen> getCitizens(){
	   return (List<IndianCitizen>)citizenRepo.findAll();
   }
   @GetMapping("/aadhar/{id}")
   public AadharCard getAadhar(@PathVariable int id){
	   return aadharRepo.findById(id).get();
   }
   @PostMapping("/citizen")
   public IndianCitizen saveCitizen(@RequestBody IndianCitizen citizen)
   {
	   return citizenRepo.save(citizen);
   }
   @PostMapping("/aadhar")
   public AadharCard saveAadhar(@RequestBody AadharCard aadhar)
   {
	   return aadharRepo.save(aadhar);
   }
}
