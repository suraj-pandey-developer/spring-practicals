package com.mapping.onetooneunidirectional.controller;

import com.mapping.onetooneunidirectional.entity.Address;
import com.mapping.onetooneunidirectional.entity.Employee;
import com.mapping.onetooneunidirectional.repository.EmployeeRepository;
import com.mapping.onetooneunidirectional.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestMap {
    @Autowired
    private EmployeeRepository empRepo;

    @Autowired
    private AddressRepository userRepo;


    @GetMapping("/welcome")
    private Address addEmployee() {
        Employee e = new Employee();
        e.setName("Naveen");
        e.setSection("D");
        e.setBatchId("122");
        Address a = new Address();
        a.setCity("Haldwani");
        a.setStreet("Delhi");
        a.setState("Uttarakhand");
        userRepo.save(a);
        e.setAddress(a);
        empRepo.save(e);
//        a.setEmployee(e);

        return a ;
    }

}
