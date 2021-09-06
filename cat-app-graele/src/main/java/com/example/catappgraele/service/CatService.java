package com.example.catappgraele.service;


import com.example.catappgraele.dto.CatDto;
import com.example.catappgraele.entity.Cat;
import com.example.catappgraele.repository.CatRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class CatService {

    public final CatRepository catRepository;

    public Cat save(CatDto catDto){
         Cat cat = new Cat()
                 .setBirthDay(catDto.getBirthDay())
                 .setCreatedAt(LocalDateTime.now())
                 .setName(catDto.getName())
                 .setId(UUID.randomUUID().toString());

       return   catRepository.save(cat);

    };

    public Iterable<Cat> getAll(){
            return catRepository.findAll();

    }


}
