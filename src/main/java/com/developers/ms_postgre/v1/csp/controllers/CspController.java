package com.developers.ms_postgre.v1.csp.controllers;

import com.developers.ms_postgre.v1.csp.api.CspApi;
import com.developers.ms_postgre.v1.csp.dto.CspDto;
import com.developers.ms_postgre.v1.csp.dto.CspQueryLimitDto;
import com.developers.ms_postgre.v1.csp.model.CspModel;
import com.developers.ms_postgre.v1.csp.repository.CspRepository;
import com.developers.ms_postgre.v1.csp.repository.CspRepositoryQuery;
import org.springframework.beans.factory.annotation.Autowired;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@Component
@RestController
public class CspController implements CspApi {

    @Autowired
    CspRepository cspRepository;
    @Autowired
    CspRepositoryQuery cspRepositoryQuery;

//    @Transactional
    @Override
    public CspModel insert(CspDto cspDto) {
//        var cspModel = new CspModel();
//        BeanUtils.copyProperties(cspDto, cspModel);
//        try {
//            return cspRepository.save(cspModel);
//        } catch (ConstraintViolationException e) {
//            e.getConstraintViolations().forEach(violation -> {
//                System.out.println(violation.getMessage());
//            });
//        }
        return null;
    }

    @Override
    public List<CspModel> findAll() {
//        List<CspModel> listaCspModel = cspRepository.findAll();
//        if (!listaCspModel.isEmpty()) {
//            for (CspModel cspModel : listaCspModel) {
//                Long id = cspModel.getCdPpssoa();
//                cspModel.add(linkTo(methodOn(CspController.class).findOne(id)).withSelfRel());
//            }
//        }
        return cspRepository.findAll();
    }


    @Override
    public Object findById(Long id) {
        Optional<CspModel> optionalCspModel = cspRepository.findById(id);
        if (optionalCspModel.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("NAO ENCONTRADO");
        }
        return ResponseEntity.status(HttpStatus.OK).body(optionalCspModel.get());
    }

    @Transactional
    @Override
    public ResponseEntity<Object> update(Long id, CspDto cspDto) {
//        Optional<CspModel> optionalCspModel = cspRepository.findById(id);
//        if (optionalCspModel.isEmpty()) {
//            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("NAO ENCONTRADO");
//        }
//        var cspModel = optionalCspModel.get();
//        BeanUtils.copyProperties(cspDto, cspModel);
//        return ResponseEntity.status(HttpStatus.CREATED).body(cspRepository.save(cspModel));\
        return null;
    }

    @Transactional
    @Override
    public ResponseEntity<Object> delete(Long id) {
//        Optional<CspModel> optionalCspModel = cspRepository.findById(id);
//        if (optionalCspModel.isEmpty()) {
//            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("NAO ENCONTRADO");
//        }
//        cspRepository.delete(optionalCspModel.get());
//        return ResponseEntity.status(HttpStatus.OK).body("PESSOA DELETADO");
        return null;
    }

    @Override
    public long count() {
        return cspRepository.count();
    }

    @Override
    public List<CspQueryLimitDto> findLimit(Integer limit) {
        return cspRepositoryQuery.findLimit(limit);
    }
}
