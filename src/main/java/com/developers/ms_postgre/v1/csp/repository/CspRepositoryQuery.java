package com.developers.ms_postgre.v1.csp.repository;

import com.developers.ms_postgre.v1.csp.dto.CspQueryLimitDto;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class CspRepositoryQuery {

    @PersistenceContext
    private EntityManager entityManager;

//    @Query(value = "SELECT cd_pssoa, nm_pssoa " +
//            "FROM tb_pssoa_ " +
//            "LIMIT :limit", nativeQuery = true)
    public List<CspQueryLimitDto> findLimit(int limit) {
        return entityManager.createNativeQuery("SELECT cd_pssoa, nm_pssoa FROM tb_pssoa_ LIMIT :limit", "CspDtoMapping")
                .setParameter("limit", limit).getResultList();
    }
}
