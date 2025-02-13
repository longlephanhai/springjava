package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.domain.SinhVien;
import com.example.demo.domain.TotNghiep;
import com.example.demo.repository.TotNghiepRepository;

@Service
public class TotNghiepService {
  private final TotNghiepRepository totNghiepRepository;

  public TotNghiepService(TotNghiepRepository totNghiepRepository) {
    this.totNghiepRepository = totNghiepRepository;
  }

  // lấy ngành tốt nghiệp theo số CMND
  public List<TotNghiep> getTotNghiep(SinhVien sinhVien) {
    return this.totNghiepRepository.findBysinhVien(sinhVien);
  }
}
