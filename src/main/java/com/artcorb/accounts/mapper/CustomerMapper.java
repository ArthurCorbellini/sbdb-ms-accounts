package com.artcorb.accounts.mapper;

import com.artcorb.accounts.dto.CustomerDetailsDto;
import com.artcorb.accounts.dto.CustomerDto;
import com.artcorb.accounts.entity.Customer;

public class CustomerMapper {

  public static CustomerDto mapToCustomerDto(Customer customer, CustomerDto customerDto) {
    customerDto.setName(customer.getName());
    customerDto.setEmail(customer.getEmail());
    customerDto.setMobileNumber(customer.getMobileNumber());
    return customerDto;
  }

  public static CustomerDetailsDto mapToCustomerDetailsDto(Customer customer,
      CustomerDetailsDto customerDtoDetailsDto) {
    customerDtoDetailsDto.setName(customer.getName());
    customerDtoDetailsDto.setEmail(customer.getEmail());
    customerDtoDetailsDto.setMobileNumber(customer.getMobileNumber());
    return customerDtoDetailsDto;
  }

  public static Customer mapToCustomer(CustomerDto customerDto, Customer customer) {
    customer.setName(customerDto.getName());
    customer.setEmail(customerDto.getEmail());
    customer.setMobileNumber(customerDto.getMobileNumber());
    return customer;
  }
}
