package com.developers.ms_postgre.v1.csp.repository;

import com.developers.ms_postgre.v1.csp.model.CspModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CspRepository extends JpaRepository<CspModel, Long> {}
