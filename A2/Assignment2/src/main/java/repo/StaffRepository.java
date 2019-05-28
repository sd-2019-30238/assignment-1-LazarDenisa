package repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.design.software.Assignment2.model.Staff;

public interface StaffRepository extends JpaRepository<Staff,Integer> {

}
