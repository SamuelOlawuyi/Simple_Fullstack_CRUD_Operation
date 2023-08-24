package dev.sammywealth.fullstackbackend.repository;

import dev.sammywealth.fullstackbackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
