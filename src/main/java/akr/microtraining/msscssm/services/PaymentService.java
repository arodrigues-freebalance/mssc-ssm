package akr.microtraining.msscssm.services;

import org.springframework.statemachine.StateMachine;

import akr.microtraining.msscssm.domain.Payment;
import akr.microtraining.msscssm.domain.PaymentEvent;
import akr.microtraining.msscssm.domain.PaymentState;

public interface PaymentService {

    Payment newPayment(Payment payment);

    StateMachine<PaymentState, PaymentEvent> preAuth(Long paymentId);

    StateMachine<PaymentState, PaymentEvent> authorizePayment(Long paymentId);

    StateMachine<PaymentState, PaymentEvent> declineAuth(Long paymentId);		
}

