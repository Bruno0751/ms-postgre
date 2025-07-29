package com.developers.ms_postgre.v1.csp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;
//import jakarta.persistence.SequenceGenerator;
//import jakarta.validation.constraints.NotBlank;
//import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.hateoas.RepresentationModel;
import java.io.Serializable;
import java.time.LocalDate;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table( schema = "public", name = "tb_pssoa_")
public class CspModel {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "cd_pssoa")
//    @SequenceGenerator(name = "PessoaJuridicaGen", sequenceName = "tb_pssoa_jurid__cd_pssoa_Jurid_seq", schema = "intelligence", allocationSize = 1)
//    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PessoaJuridicaGen")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long cdPpssoa;

    @Column(name = "nm_pssoa")
    private String nmPssoa;

    @Column(name = "cd_sexo")
    private String cdSexo;

    @Column(name = "dt_nasc_pssoa")
    private String dtNascPssoa;

//    @Column(name = "cd_pssoa_vnclo")
//    private Long cd_pssoa_vnclo;

//    @Column(name = "ds_bleto")
//    private Long ds_bleto;

//    @Column(name = "cd_senha")
//    private Long cd_senha;

//    @Column(name = "cd_tpo_ctrl")
//    private Long cd_tpo_ctrl;

}
