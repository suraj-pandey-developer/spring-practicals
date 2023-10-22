package com.custom.query.service;

import com.custom.query.repository.UserRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Objects;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void insertUser(Integer id, String name, String ugender, String ucountry, Integer age) {
        if(Objects.isNull(userRepository)) System.out.println(" user repository is null");
        userRepository.insertDataIntoInSql(id, name, ugender, ucountry, age);
    }
}
