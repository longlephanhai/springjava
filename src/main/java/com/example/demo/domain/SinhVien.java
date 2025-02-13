package com.example.demo.domain;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "sinhvien")
public class SinhVien {
  @Id
  private String soCMND;

  private String hoten;
  private String email;
  private String soDT;
  private String diaChi;

  @OneToMany(mappedBy = "sinhVien")
  private List<TotNghiep> totNghieps;

  @OneToMany(mappedBy = "sinhVien")
  private List<CongViec> congViecs;

  public List<CongViec> getCongViecs() {
    return congViecs;
  }

  public void setCongViecs(List<CongViec> congViecs) {
    this.congViecs = congViecs;
  }

  public List<TotNghiep> getTotNghieps() {
    return totNghieps;
  }

  public void setTotNghieps(List<TotNghiep> totNghieps) {
    this.totNghieps = totNghieps;
  }

  public String getSoCMND() {
    return soCMND;
  }

  public void setSoCMND(String soCMND) {
    this.soCMND = soCMND;
  }

  public String getHoten() {
    return hoten;
  }

  public void setHoten(String hoten) {
    this.hoten = hoten;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getSoDT() {
    return soDT;
  }

  public void setSoDT(String soDT) {
    this.soDT = soDT;
  }

  public String getDiaChi() {
    return diaChi;
  }

  public void setDiaChi(String diaChi) {
    this.diaChi = diaChi;
  }

}
