package com.dev_nasimuzzaman.repository;

import com.dev_nasimuzzaman.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<Users,Integer> {
    Optional<Users> findByEmail(String email);
}
