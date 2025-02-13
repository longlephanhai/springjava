package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.domain.Truong;
import com.example.demo.repository.TruongRepository;

@Service
public class TruongService {
    private final TruongRepository truongRepository;

    public TruongService(TruongRepository truongRepository) {
        this.truongRepository = truongRepository;
    }

    public List<Truong> listTruong() {
        return this.truongRepository.findAll();
    }
    public Truong getTruong(String maTruong) {
        return this.truongRepository.findByMaTruong(maTruong);
    }

    

}
