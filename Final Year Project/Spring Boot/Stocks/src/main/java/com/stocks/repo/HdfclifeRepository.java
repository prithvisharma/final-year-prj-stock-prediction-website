package com.stocks.repo;

import com.stocks.model.Hdfcbank;
import com.stocks.model.Hdfclife;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

/**
* Generated by Spring Data Generator on 08/04/2021
*/
@Repository
public interface HdfclifeRepository extends JpaRepository<Hdfclife, Integer>, JpaSpecificationExecutor<Hdfclife> {
	Hdfclife findFirstByOrderBySidDesc();
}
