package com.macOfBa.repository;

import com.macOfBa.model.Customer;

public interface ICustomerRepository {
    boolean insertWithStoredProcedure(Customer customer);
}
