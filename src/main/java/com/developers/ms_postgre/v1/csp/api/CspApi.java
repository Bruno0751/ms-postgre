package com.developers.ms_postgre.v1.csp.api;

import com.developers.ms_postgre.v1.csp.dto.CspDto;
import com.developers.ms_postgre.v1.csp.dto.CspQueryLimitDto;
import com.developers.ms_postgre.v1.csp.model.CspModel;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import java.util.List;

@Api(tags = {"CSP"})
@RequestMapping("/v1/csp")
public interface CspApi {

    @ApiOperation(value = "Cria um novo registro de pessoa", notes = "Este endpoint permite criar um novo registro de pessoa no sistema.")
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(value = "", produces = {MediaType.APPLICATION_JSON_VALUE})
    CspModel insert(@RequestBody @Valid CspDto cspDto);

    @ApiOperation(value = "Lista todos os registros de pessoa", notes = "Recupera todos os registros de pessoa cadastrados no sistema.")
    @ResponseStatus(HttpStatus.OK)
    @GetMapping(value = "", produces = {MediaType.APPLICATION_JSON_VALUE})
    List<CspModel> findAll();

    @ApiOperation(value = "Busca um registro de pessoa por ID", notes = "Recupera os dados de uma pessoa específica a partir do ID informado na URL.")
    @ResponseStatus(HttpStatus.OK)
    @GetMapping(value = "{id}", produces = {MediaType.APPLICATION_JSON_VALUE})
    Object findById(@PathVariable(value = "id") Long id);

    @ApiOperation(value = "Atualiza um registro de pessoa existente", notes = "Atualiza os dados de uma pessoa já cadastrado com base no ID informado na URL.")
    @ResponseStatus(HttpStatus.CREATED)
    @PutMapping(value = "{id}")
    ResponseEntity<Object> update(@PathVariable(value = "id") Long id,
                                  @RequestBody @Valid CspDto cspDto);

    @ApiOperation(value = "Remove um registro de pessoa por ID", notes = "Exclui permanentemente uma pessoa existente com base no ID informado na URL.")
    @ResponseStatus(HttpStatus.OK)
    @DeleteMapping(value = "{id}")
    ResponseEntity<Object> delete(@PathVariable(value = "id") Long id);

    @ApiOperation(value = "Retorna a quantidade total de registros de pessoa", notes = "Recupera o número total de registros de pessoa existentes no sistema.")
    @ResponseStatus(HttpStatus.OK)
    @GetMapping(value = "/count")
    long count();

    @ApiOperation(value = "Retorna a quantidade de registros desejada", notes = "Recupera o número desejado de registros existentes no sistema.")
    @ResponseStatus(HttpStatus.OK)
    @GetMapping(value = "/limit/{limit}", produces = {MediaType.APPLICATION_JSON_VALUE})
    List<CspQueryLimitDto> findLimit(@PathVariable(value = "limit") Integer limit);

    @GetMapping(value = "/teste")
    @ResponseStatus(HttpStatus.OK)
    void teste();

}
