package com.ejer.demo.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ejer.demo.dto.UserDto;
import com.ejer.demo.entity.User;
import com.ejer.demo.repository.UserRepository;

@Service
public class UserServiceImp implements Userservice {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDto newUser(UserDto userDto) {
        User user = mapDtoToEntity(userDto);
        userRepository.save(user);
        UserDto uDto = mapEntityToDto(user);
        return uDto;

    }


    private UserDto mapEntityToDto(User user) {
        UserDto userDto = new UserDto();
        userDto.setId(user.getId());
        userDto.setName(user.getName());
        userDto.setCuenta(user.getCuenta());
       
        return userDto;
    }

    private User mapDtoToEntity(UserDto uDto) {
        User user = new User();
        user.setId(uDto.getId());
        user.setName(uDto.getName());
        user.setCuenta(uDto.getCuenta());
      
        return user;
    }

}
