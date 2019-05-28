package repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.design.software.Assignment2.model.PaymentPlan;

public interface PaymentPlanRepository extends JpaRepository<PaymentPlan,Integer> {

}
