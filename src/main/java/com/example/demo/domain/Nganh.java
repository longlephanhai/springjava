package com.example.demo.domain;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "nganh")
public class Nganh {
  @Id
  private String maNganh;

  private String tenNganh;
  private String loaiNganh;

  @OneToMany(mappedBy = "nganh")
  private List<TotNghiep> totNghieps;
  @OneToMany(mappedBy = "nganh")
  private List<CongViec> congViecs;
  public String getMaNganh() {
    return maNganh;
  }
  public void setMaNganh(String maNganh) {
    this.maNganh = maNganh;
  }
  public String getTenNganh() {
    return tenNganh;
  }
  public void setTenNganh(String tenNganh) {
    this.tenNganh = tenNganh;
  }
  public String getLoaiNganh() {
    return loaiNganh;
  }
  public void setLoaiNganh(String loaiNganh) {
    this.loaiNganh = loaiNganh;
  }
  public List<TotNghiep> getTotNghieps() {
    return totNghieps;
  }
  public void setTotNghieps(List<TotNghiep> totNghieps) {
    this.totNghieps = totNghieps;
  }
  public List<CongViec> getCongViecs() {
    return congViecs;
  }
  public void setCongViecs(List<CongViec> congViecs) {
    this.congViecs = congViecs;
  }

  

}
