package com.stocks.repo;

import com.stocks.model.Tatasteel;
import com.stocks.model.Tcs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

/**
* Generated by Spring Data Generator on 08/04/2021
*/
@Repository
public interface TcsRepository extends JpaRepository<Tcs, Integer>, JpaSpecificationExecutor<Tcs> {
	Tcs findFirstByOrderBySidDesc();
}