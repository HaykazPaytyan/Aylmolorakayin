package com.energizeglobal.sqlgenerator.controller;

import com.energizeglobal.sqlgenerator.dto.CryptoConfigDTO;
import com.energizeglobal.sqlgenerator.service.CryptoConfigService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/crypto")
public class CryptoConfigController {

  private final CryptoConfigService cryptoConfigService;

  public CryptoConfigController(CryptoConfigService cryptoConfigService) {
    this.cryptoConfigService = cryptoConfigService;
  }

  @GetMapping
  private ResponseEntity<List<CryptoConfigDTO>> getAllCryptoConfigs() {

    List<CryptoConfigDTO> cryptoConfigDTOS = cryptoConfigService.getAllCryptoConfigs();
    return ResponseEntity.ok(cryptoConfigDTOS);
  }

  @GetMapping("/{id}")
  private ResponseEntity<CryptoConfigDTO> getById(@PathVariable Long id) {
    CryptoConfigDTO cryptoConfigDTO = cryptoConfigService.getById(id);
    return ResponseEntity.ok(cryptoConfigDTO);
  }
}
