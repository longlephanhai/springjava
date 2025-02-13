package com.example.demo.domain;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "totnghiep")
public class TotNghiep {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  // soCMND
  @ManyToOne
  @JoinColumn(name = "soCMND")
  private SinhVien sinhVien;
  // maTruong
  @ManyToOne
  @JoinColumn(name = "maTruong")
  private Truong truong;
  // maNganh
  @ManyToOne
  @JoinColumn(name = "maNganh")
  private Nganh nganh;

  private String heTN;
  private LocalDate ngayTN;
  private String loaiTN;

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public SinhVien getSinhVien() {
    return sinhVien;
  }

  public void setSinhVien(SinhVien sinhVien) {
    this.sinhVien = sinhVien;
  }

  public Truong getTruong() {
    return truong;
  }

  public void setTruong(Truong truong) {
    this.truong = truong;
  }

  public Nganh getNganh() {
    return nganh;
  }

  public void setNganh(Nganh nganh) {
    this.nganh = nganh;
  }

  public String getHeTN() {
    return heTN;
  }

  public void setHeTN(String heTN) {
    this.heTN = heTN;
  }

  public LocalDate getNgayTN() {
    return ngayTN;
  }

  public void setNgayTN(LocalDate ngayTN) {
    this.ngayTN = ngayTN;
  }

  public String getLoaiTN() {
    return loaiTN;
  }

  public void setLoaiTN(String loaiTN) {
    this.loaiTN = loaiTN;
  }

}
