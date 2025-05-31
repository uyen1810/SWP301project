package group4.example.SWP301_project.service;

import group4.example.SWP301_project.entity.NongSan;

import java.util.List;

public interface NongSanService {
    List<NongSan> findAll();
    NongSan save(NongSan nongSan);
}

