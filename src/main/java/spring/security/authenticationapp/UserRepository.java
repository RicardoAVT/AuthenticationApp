package spring.security.authenticationapp;

import org.springframework.data.jpa.repository.JpaRepository;
import spring.security.authenticationapp.model.User;

import java.util.Optional;


public interface UserRepository extends JpaRepository<User,Integer> {

    Optional<User>findByUserName(String userName);
}
