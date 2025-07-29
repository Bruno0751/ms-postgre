package com.developers.ms_postgre.v1.csp.service;

import com.developers.ms_postgre.v1.csp.dto.CspDto;
import com.developers.ms_postgre.v1.csp.model.CspModel;
import com.developers.ms_postgre.v1.csp.repository.CspRepository;
import jakarta.validation.ConstraintViolationException;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CspService {

    @Autowired
    CspRepository cspRepository;
}
