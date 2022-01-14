package com.example.iasfpraticalsem4.Repository;

import com.example.iasfpraticalsem4.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    @Query(
            value = "SELECT e FROM User e where e.name = :name and e.age = :name and e.salary = :salary",
            nativeQuery = true)
    User findUser(String name, int age, double salary);
}
