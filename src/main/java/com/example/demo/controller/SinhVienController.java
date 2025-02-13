package com.example.demo.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.domain.CongViec;
import com.example.demo.domain.Nganh;
import com.example.demo.domain.SinhVien;
import com.example.demo.domain.TotNghiep;
import com.example.demo.domain.Truong;
import com.example.demo.domain.dto.CreateSinhVienDTO;
import com.example.demo.service.CongViecService;
import com.example.demo.service.NganhService;
import com.example.demo.service.SinhVienService;
import com.example.demo.service.TotNghiepService;
import com.example.demo.service.TruongService;

import jakarta.validation.Valid;

@Controller
public class SinhVienController {
  private final SinhVienService sinhVienService;
  private final TruongService truongService;
  private final NganhService nganhService;
  private final TotNghiepService totNghiepService;
  private final CongViecService congViecService;
 

  public SinhVienController(SinhVienService sinhVienService, TruongService truongService, NganhService nganhService,
      TotNghiepService totNghiepService, CongViecService congViecService) {
    this.sinhVienService = sinhVienService;
    this.truongService = truongService;
    this.nganhService = nganhService;
    this.totNghiepService = totNghiepService;
    this.congViecService = congViecService;
  }

  @GetMapping("/create")
  public String getPageCreate(Model model) {
    List<Truong> listTruong = this.truongService.listTruong();
    List<Nganh> listNganh = this.nganhService.listNganh();
    model.addAttribute("sinhvien", new CreateSinhVienDTO());
    model.addAttribute("listTruong", listTruong);
    model.addAttribute("listNganh", listNganh);
    return "sinhvien/create";
  }

  @PostMapping("/create")
  public String createSinhVien(@ModelAttribute("sinhvien") @Valid CreateSinhVienDTO dto,
      BindingResult newUserBindingResult) {
    List<FieldError> errors = newUserBindingResult.getFieldErrors();
    for (FieldError error : errors) {
      System.out.println(">>>>error" + error.getField() + " - " + error.getDefaultMessage());
    }
    if (newUserBindingResult.hasErrors()) {
      return "index";
    }
    this.sinhVienService.createSinhVien(dto);
    return "redirect:/create";
  }

  @GetMapping("/find")
  public String getPageFind(Model model) {
    model.addAttribute("sinhVien", new CreateSinhVienDTO());
    return "sinhvien/find";
  }

  @PostMapping("/find")
  public String postCMND(@ModelAttribute("sinhVien") CreateSinhVienDTO dto, Model model) {
    SinhVien sinhvien = this.sinhVienService.getSinhVien(dto.getSoCMND());
    model.addAttribute("sinhvien", sinhvien);
    return "sinhvien/find";
  }

  @GetMapping("/find2")
  public String getPageFind2(Model model) {
    model.addAttribute("sinhVien", new CreateSinhVienDTO());
    return "sinhvien/find2";
  }

  @PostMapping("/find2")
  public String postCMND2(@ModelAttribute("sinhVien") CreateSinhVienDTO dto, Model model) {
    SinhVien sinhvien = this.sinhVienService.getSinhVien(dto.getSoCMND());
    model.addAttribute("sinhvien", sinhvien);
    List<TotNghiep> totNghieps =this.totNghiepService.getTotNghiep(sinhvien);
    model.addAttribute("totNghieps", totNghieps);
    List<CongViec> congViecs =this.congViecService.listCongViec(sinhvien);
    model.addAttribute("listMaNganhCTY", congViecs);
    return "sinhvien/find2";
  }
}
