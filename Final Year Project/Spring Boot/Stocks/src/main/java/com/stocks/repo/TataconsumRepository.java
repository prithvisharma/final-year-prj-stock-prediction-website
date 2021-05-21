package com.stocks.repo;

import com.stocks.model.Sunpharma;
import com.stocks.model.Tataconsum;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

/**
* Generated by Spring Data Generator on 08/04/2021
*/
@Repository
public interface TataconsumRepository extends JpaRepository<Tataconsum, Integer>, JpaSpecificationExecutor<Tataconsum> {
	Tataconsum findFirstByOrderBySidDesc();
}
