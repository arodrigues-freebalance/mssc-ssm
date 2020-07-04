package akr.microtraining.msscssm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import akr.microtraining.msscssm.domain.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Long> {

}