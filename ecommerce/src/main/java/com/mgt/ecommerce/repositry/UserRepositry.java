package com.mgt.ecommerce.repositry;

import com.mgt.ecommerce.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepositry extends JpaRepository<User,Long> {

    public User findByemail(String email);
}
