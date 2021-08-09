package com.example.demo.controller;

import com.example.demo.model.BoyModel;
import com.example.demo.repository.BoyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class BoyController {
    @Autowired
    private BoyRepository boyRepository;
@GetMapping("/boys")
    public List<BoyModel> boylist() {
        List<BoyModel> boyModels = new ArrayList<>();
        boyRepository.findAll().forEach(boyModels::add);

        return boyModels;
        }

    }


