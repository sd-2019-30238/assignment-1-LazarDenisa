package repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.design.software.Assignment2.model.User;

public interface BookRepository extends JpaRepository<User,String> {

}
