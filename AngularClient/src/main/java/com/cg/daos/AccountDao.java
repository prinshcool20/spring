package com.cg.daos;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.cg.model.Account;



public interface AccountDao extends CrudRepository<Account, Long> {
	List<Account> findBymobileno(long mobileno);
}