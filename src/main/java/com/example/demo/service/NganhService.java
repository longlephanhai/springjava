package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.domain.Nganh;
import com.example.demo.repository.NganhRepository;

@Service
public class NganhService {
    private final NganhRepository nganhRepository;

    public NganhService(NganhRepository nganhRepository) {
        this.nganhRepository = nganhRepository;
    }
    public List<Nganh> listNganh() {
        return this.nganhRepository.findAll();
    }
    public Nganh getNganh(String maNganh) {
        return this.nganhRepository.findByMaNganh(maNganh);
    }

   

    

    
}
