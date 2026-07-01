package com.example.techportal.service;

import com.example.techportal.model.TechItem;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class TechService {
    private List<TechItem> activeTechList = new ArrayList<>();

    public List<TechItem> fetchAllModules() {
        return activeTechList;
    }

    public void registerNewModule(TechItem incomingModule) {
        activeTechList.add(incomingModule);
    }
}