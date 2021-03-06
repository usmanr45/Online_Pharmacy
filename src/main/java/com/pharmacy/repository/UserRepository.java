package com.pharmacy.repository;



import com.pharmacy.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("userRepository")
public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
    //Collection<User> getAllUsers();
    //Optional<User> getUserById(long id);
}
