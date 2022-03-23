package com.energizeglobal.sqlgenerator.service;

import com.energizeglobal.sqlgenerator.domain.CryptoConfig;
import com.energizeglobal.sqlgenerator.dto.CryptoConfigDTO;
import com.energizeglobal.sqlgenerator.mapper.Mapping;
import com.energizeglobal.sqlgenerator.repository.CryptoConfigRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CryptoConfigService {

private final Mapping mapping;

  private final CryptoConfigRepository cryptoConfigRepository;

  public CryptoConfigService(CryptoConfigRepository cryptoConfigRepository, Mapping mapping) {
    this.cryptoConfigRepository = cryptoConfigRepository;
    this.mapping = mapping;
  }

  public List<CryptoConfigDTO> getAllCryptoConfigs() {

    List<CryptoConfig> cryptoConfigs = cryptoConfigRepository.findAll();

    return mapping.mapList(cryptoConfigs, CryptoConfigDTO.class);
  }

  public CryptoConfigDTO getById(Long id) {

    CryptoConfig cryptoConfig = cryptoConfigRepository.getById(id);

    return mapping.convertToDto(cryptoConfig);
  }
}
