package com.energizeglobal.sqlgenerator.domain;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "CryptoConfig")
public class CryptoConfig {

  @Id
  @Column
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(columnDefinition = "text")
  //        @Type(type = "com.worldline.acs.config.crypto.one.JsonCryptoConfig")
  //        private CryptoConfigurationMap3DS1 protocolOne;
  private String protocolOne;

  @Column(columnDefinition = "text")
  // @Type(type = "com.worldline.acs.config.crypto.two.JsonCryptoConfig")
  // private CryptoConfigurationMap3DS2 protocolTwo;
  private String protocolTwo;

  // this field is only here for convenience with SQL scripts and as a discriminator among crypto
  // configurations in DB
  @Column
  private String description;

  //  @OneToMany(mappedBy = "cryptoConfigurationEntity")
  //  @JsonIgnore
  //  private List<SubIssuer> linkedSubIssuers = new ArrayList<>();
  //
  //  @OneToMany(mappedBy = "cryptoConfigurationEntity")
  //  @JsonIgnore
  //  private List<BinRange> linkedBinRanges = new ArrayList<>();
}
