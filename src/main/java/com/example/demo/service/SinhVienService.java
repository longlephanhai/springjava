package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.domain.Nganh;
import com.example.demo.domain.SinhVien;
import com.example.demo.domain.TotNghiep;
import com.example.demo.domain.Truong;
import com.example.demo.domain.dto.CreateSinhVienDTO;
import com.example.demo.repository.NganhRepository;
import com.example.demo.repository.SinhVienRepository;
import com.example.demo.repository.TotNghiepRepository;
import com.example.demo.repository.TruongRepository;

@Service
public class SinhVienService {
  private final SinhVienRepository sinhVienRepository;
  private final TotNghiepRepository totNghiepRepository;
  private final TruongService truongService;
  private final NganhService nganhService;
  private final NganhRepository nganhRepository;
  private final TruongRepository truongRepository;

  public SinhVienService(SinhVienRepository sinhVienRepository, TotNghiepRepository totNghiepRepository,
      TruongService truongService, NganhService nganhService, NganhRepository nganhRepository,
      TruongRepository truongRepository) {
    this.sinhVienRepository = sinhVienRepository;
    this.totNghiepRepository = totNghiepRepository;
    this.truongService = truongService;
    this.nganhService = nganhService;
    this.nganhRepository = nganhRepository;
    this.truongRepository = truongRepository;
  }

  public void createSinhVien(CreateSinhVienDTO dto) {
    SinhVien sinhVien = new SinhVien();
    sinhVien.setSoCMND(dto.getSoCMND());
    sinhVien.setHoten(dto.getHoten());
    sinhVien.setEmail(dto.getEmail());
    sinhVien.setSoDT(dto.getSoDT());
    sinhVien.setDiaChi(dto.getDiaChi());
    this.sinhVienRepository.save(sinhVien);
    TotNghiep totNghiep = new TotNghiep();
    totNghiep.setSinhVien(sinhVien);
    totNghiep.setHeTN(dto.getHeTN());
    totNghiep.setNgayTN(dto.getNgayTN());
    totNghiep.setLoaiTN(dto.getLoaiTN());
    Truong truong = this.truongService.getTruong(dto.getMaTruong());
    Nganh nganh = this.nganhService.getNganh(dto.getMaNganh());
    totNghiep.setTruong(truong);
    totNghiep.setNganh(nganh);
    this.totNghiepRepository.save(totNghiep);
  }

  // lấy thông tin sinh viên theo maCMND
  public SinhVien getSinhVien(String soCMND) {
    return this.sinhVienRepository.findBySoCMND(soCMND);
  }

}
