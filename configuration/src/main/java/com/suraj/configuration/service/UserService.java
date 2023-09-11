package com.suraj.configuration.service;

import com.suraj.configuration.configuration.Config;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    // this file service object bean will be come from app config file
    private final FileService fileService;
    public UserService(Config config, FileService fileService) {
        this.fileService = fileService;
        System.out.println("userservice ::: run");
    }
}
