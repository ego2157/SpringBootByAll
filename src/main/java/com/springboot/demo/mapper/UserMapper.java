package com.springboot.demo.mapper;

import com.springboot.demo.eneity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {

    User Sel(int id);
}
