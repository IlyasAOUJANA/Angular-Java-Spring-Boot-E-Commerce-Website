package com.ilyasAOUJANA.springbootecommerce.service;

import com.ilyasAOUJANA.springbootecommerce.dto.Purchase;
import com.ilyasAOUJANA.springbootecommerce.dto.PurchaseResponse;

public interface CheckoutService {

    PurchaseResponse placeOrder(Purchase purchase);
}
