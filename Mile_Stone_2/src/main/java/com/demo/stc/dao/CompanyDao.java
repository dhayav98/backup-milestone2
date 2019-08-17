package com.demo.stc.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.stc.model.Company;

public interface CompanyDao extends JpaRepository<Company, Integer>{

}
