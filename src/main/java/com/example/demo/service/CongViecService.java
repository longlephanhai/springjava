package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.domain.CongViec;
import com.example.demo.domain.SinhVien;
import com.example.demo.repository.CongViecRepository;

@Service
public class CongViecService {
  private final CongViecRepository congViecRepository;

  public CongViecService(CongViecRepository congViecRepository) {
    this.congViecRepository = congViecRepository;
  }
  public List<CongViec> listCongViec(SinhVien sinhVien) {
    return this.congViecRepository.findBysinhVien(sinhVien);
  }
}
