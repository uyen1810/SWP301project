package group4.example.SWP301_project.service;

import group4.example.SWP301_project.entity.NongSan;
import group4.example.SWP301_project.entity.NongSanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NongSanServiceImpl implements NongSanService {

    @Autowired
    private NongSanRepository repository;

    public List<NongSan> findAll() {
        return repository.findAll();
    }

    public NongSan save(NongSan nongSan) {
        return repository.save(nongSan);
    }
}