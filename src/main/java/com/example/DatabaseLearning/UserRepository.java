package com.example.DatabaseLearning;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Amresh Tripathy
 */

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}
