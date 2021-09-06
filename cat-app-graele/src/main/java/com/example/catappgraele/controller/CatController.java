package com.example.catappgraele.controller;


import com.example.catappgraele.dto.CatDto;
import com.example.catappgraele.entity.Cat;
import com.example.catappgraele.service.CatService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cats")
@RequiredArgsConstructor
public class CatController {

    public final CatService catService;

    @PostMapping
    public Cat save(@RequestBody CatDto cat){
        return catService.save(cat);
    }

    @GetMapping
    public Iterable getAll(){
        return catService.getAll();
    }

}
