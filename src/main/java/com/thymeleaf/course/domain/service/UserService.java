package com.thymeleaf.course.domain.service;

import com.thymeleaf.course.domain.model.dto.UserSignUpRequest;
import com.thymeleaf.course.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserService {
    @Autowired
    UserRepository userRepository;

    public void saveUser(UserSignUpRequest request) {
       userRepository.save(request);
    }
}
