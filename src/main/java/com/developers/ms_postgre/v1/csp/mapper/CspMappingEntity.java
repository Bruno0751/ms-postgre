package com.developers.ms_postgre.v1.csp.mapper;

import com.developers.ms_postgre.v1.csp.dto.CspQueryLimitDto;
import jakarta.persistence.*;

@Entity
@SqlResultSetMapping(name = "CspDtoMapping", classes = @ConstructorResult(
    targetClass = CspQueryLimitDto.class,
    columns = {@ColumnResult(name = "cd_pssoa", type = Long.class), @ColumnResult(name = "nm_pssoa", type = String.class)}
))
public class CspMappingEntity {

    @Id
    private Long id;

}
