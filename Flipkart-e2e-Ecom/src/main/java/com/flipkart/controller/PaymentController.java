package com.flipkart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.flipkart.service.IPaymentService;

@Controller
public class PaymentController {

    @Autowired
    private IPaymentService payment;

    @GetMapping("/paymentPage")
    public String payment() {

        payment.paymentUpdate();

        return "view-products";
    }
    @GetMapping("/home")
    public String homedir() {
    	return "index";
    }
}