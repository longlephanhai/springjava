package com.example.demo.domain;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "congviec")
public class CongViec {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    // soCMND
    @ManyToOne
    @JoinColumn(name = "soCMND")
    private SinhVien sinhVien;

    private Date ngayVaoCongTy;
    
    @ManyToOne
    @JoinColumn(name = "maNganh")
    private Nganh nganh;

    private String tenCongViec;
    private String tenCongTy;
    private String diaChiCongTy;
    private String thoiGianlamViec;
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public Date getNgayVaoCongTy() {
        return ngayVaoCongTy;
    }
    public void setNgayVaoCongTy(Date ngayVaoCongTy) {
        this.ngayVaoCongTy = ngayVaoCongTy;
    }
    public Nganh getNganh() {
        return nganh;
    }
    public void setNganh(Nganh nganh) {
        this.nganh = nganh;
    }
    public String getTenCongViec() {
        return tenCongViec;
    }
    public void setTenCongViec(String tenCongViec) {
        this.tenCongViec = tenCongViec;
    }
    public String getTenCongTy() {
        return tenCongTy;
    }
    public void setTenCongTy(String tenCongTy) {
        this.tenCongTy = tenCongTy;
    }
    public String getDiaChiCongTy() {
        return diaChiCongTy;
    }
    public void setDiaChiCongTy(String diaChiCongTy) {
        this.diaChiCongTy = diaChiCongTy;
    }
    public String getThoiGianlamViec() {
        return thoiGianlamViec;
    }
    public void setThoiGianlamViec(String thoiGianlamViec) {
        this.thoiGianlamViec = thoiGianlamViec;
    }
    public SinhVien getSinhVien() {
        return sinhVien;
    }
    public void setSinhVien(SinhVien sinhVien) {
        this.sinhVien = sinhVien;
    }
    
}
