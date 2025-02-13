package com.example.demo.domain;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "truong")
public class Truong {
  @Id
  private String maTruong;

  private String tenTruong;
  private String diaChi;
  private String soDT;
  @OneToMany(mappedBy = "truong")
  private List<TotNghiep> totNghieps;

  public List<TotNghiep> getTotNghieps() {
    return totNghieps;
  }

  public void setTotNghieps(List<TotNghiep> totNghieps) {
    this.totNghieps = totNghieps;
  }


  public String getMaTruong() {
    return maTruong;
  }

  public void setMaTruong(String maTruong) {
    this.maTruong = maTruong;
  }

  public String getTenTruong() {
    return tenTruong;
  }

  public void setTenTruong(String tenTruong) {
    this.tenTruong = tenTruong;
  }

  public String getDiaChi() {
    return diaChi;
  }

  public void setDiaChi(String diaChi) {
    this.diaChi = diaChi;
  }

  public String getSoDT() {
    return soDT;
  }

  public void setSoDT(String soDT) {
    this.soDT = soDT;
  }

}
