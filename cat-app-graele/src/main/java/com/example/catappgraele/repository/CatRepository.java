package com.example.catappgraele.repository;

import com.example.catappgraele.entity.Cat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CatRepository extends JpaRepository<Cat,String> {
}
