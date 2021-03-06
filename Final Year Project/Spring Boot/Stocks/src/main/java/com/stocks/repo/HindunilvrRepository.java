package com.stocks.repo;

import com.stocks.model.Hindalco;
import com.stocks.model.Hindunilvr;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

/**
* Generated by Spring Data Generator on 08/04/2021
*/
@Repository
public interface HindunilvrRepository extends JpaRepository<Hindunilvr, Integer>, JpaSpecificationExecutor<Hindunilvr> {
	Hindunilvr findFirstByOrderBySidDesc();
}
