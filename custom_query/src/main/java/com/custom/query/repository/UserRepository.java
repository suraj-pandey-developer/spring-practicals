package com.custom.query.repository;

import com.custom.query.model.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {
    // hpa query of sort form it will converted automatically and then convert back to sql command.
    // Hence take time to execute.
    @Query(value = "From User")
    List<User> getAllUserHql() ;

    // native query annotation is required so that it can understand diff of hql and sql query type
    @Query(value = "select * from user_master", nativeQuery = true)
    List<User> getAllUserSql();

    @Query(value = "From User where country = :cname")
    List<User> getAllUserByCountry(String cname);

    @Query(value = "SELECT * FROM user_master WHERE USER_COUNTRY = :cname", nativeQuery = true)
    List<User> getAllUserByCountryUsingSql(@Param("cname") String cname);
}
