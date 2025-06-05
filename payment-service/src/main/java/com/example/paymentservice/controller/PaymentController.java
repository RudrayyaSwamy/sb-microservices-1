package com.example.paymentservice.controller;


import com.example.paymentservice.model.Payment;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/api/payments")
public class PaymentController {

    private static final List<Payment> payments = new ArrayList<>(List.of(
            new Payment("P401", "E301", 2999.0, "PAID"),
            new Payment("P402", "E302", 2499.0, "PAID")
    ));

    @GetMapping
    public List<Payment> getAll() {
        return payments;
    }

    @PostMapping
    public Payment addPayment(@RequestBody Payment payment) {
        payments.add(payment);
        return payment;
    }
}
