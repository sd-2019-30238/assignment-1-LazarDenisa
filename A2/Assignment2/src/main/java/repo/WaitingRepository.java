package repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.design.software.Assignment2.model.Waiting;

public interface WaitingRepository extends JpaRepository<Waiting, Integer>{

}
