package com.macOfBa.service;

import com.macOfBa.model.Customer;

public interface ICustomerService {
    boolean insertWithStoredProcedure(Customer customer);
}
