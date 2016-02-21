package com.theanh.first.service;

import java.util.Map;

import com.theanh.first.model.CustomerModel;
import com.theanh.first.model.DataTableJson;

public interface CustomerService {
	void save(Map<String, String> customer);
	DataTableJson getListCustomer(String sort, String order, int limit, int offset);
	void delete(Integer cusId);
	CustomerModel getCustomerById(Integer cusId);
	void edit(Map<String, String> data);
}
