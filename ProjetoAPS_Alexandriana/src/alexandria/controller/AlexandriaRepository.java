package alexandria.controller;

import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlexandriaRepository extends JpaRepository<User, Long> {
	
}
