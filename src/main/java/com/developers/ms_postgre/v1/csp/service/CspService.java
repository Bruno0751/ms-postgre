package com.developers.ms_postgre.v1.csp.service;

import com.developers.ms_postgre.v1.csp.dto.CspQueryLimitDto;
import com.developers.ms_postgre.v1.csp.repository.CspRepository;
import com.developers.ms_postgre.v1.csp.repository.CspRepositoryQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CspService {

    @Autowired
    CspRepositoryQuery cspRepositoryQuery;
    @Autowired
    CspRepository cspRepository;
    @Value("${spring.key}")
    String key;

    public List<CspQueryLimitDto> findLimit(Integer limit) {
        return cspRepositoryQuery.findLimit(limit);
    }

    public long count() {
        return cspRepository.count();
    }

    public void teste() {
        System.out.println("key "+key);
    }


}
