package searching.and.filtering.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import searching.and.filtering.model.User;
import searching.and.filtering.repository.UserRepostory;

import java.util.List;

@Service
public class FilterService {

    @Autowired
    private UserRepostory repository;

    public List<User> listOfFilteredData(String name ,String gender, String country, Integer page) {
        User entity = new User();
        Example<User> example = Example.of(entity);
        entity.setName(name);
        entity.setGender(gender);
        entity.setCountry(country);

//        Pageable page = PageRequest.of(1 , 5, Sort.sort());

        List<User> users =  repository.findAll(example);
        return users;
    }

}
