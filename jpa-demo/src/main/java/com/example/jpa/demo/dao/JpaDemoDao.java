package com.example.jpa.demo.dao;

import com.example.jpa.demo.po.JpaDemo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaDemoDao extends JpaRepository<JpaDemo,Integer> {

}
