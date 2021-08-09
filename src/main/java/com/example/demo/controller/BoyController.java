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
        @GetMapping("/boys/{id}")
        public BoyModel boyone(@PathVariable ("id") int id) {
            return boyRepository.findById(id).get();
        }

        @PostMapping("/boys")
        //response entity to return the current ID
        public BoyModel boyone(@RequestBody BoyModel boyModel) {
            return boyRepository.save(boyModel);
        }

    }


