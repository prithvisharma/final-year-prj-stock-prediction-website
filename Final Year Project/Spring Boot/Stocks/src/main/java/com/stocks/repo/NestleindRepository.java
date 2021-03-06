package com.stocks.repo;

import com.stocks.model.Mm;
import com.stocks.model.Nestleind;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

/**
* Generated by Spring Data Generator on 08/04/2021
*/
@Repository
public interface NestleindRepository extends JpaRepository<Nestleind, Integer>, JpaSpecificationExecutor<Nestleind> {
	Nestleind findFirstByOrderBySidDesc();
}
