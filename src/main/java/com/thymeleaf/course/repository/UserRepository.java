package com.thymeleaf.course.repository;

import com.thymeleaf.course.domain.model.entity.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {
    private List<User> users = new ArrayList<>();
    public void save(User user){
        users.add(user);
    }
}
