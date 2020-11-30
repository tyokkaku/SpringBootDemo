package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.domain.Vendor;
import com.example.demo.mapper.VendorMapper;

@Service
public class VendorService {
  
  @Autowired
  private VendorMapper vendorMapper;

  @Transactional
  public List<Vendor> findAll() {
    return vendorMapper.findAll();
  }

  @Transactional
  public Vendor findOne(String name) {
    return vendorMapper.findOne(name);
  }

  @Transactional
  public void save(Vendor vendor) {
    vendorMapper.save(vendor);
  }

  @Transactional
  public void update(Vendor vendor) {
    vendorMapper.update(vendor);
  }

  @Transactional
  public void delete(Long id) {
    vendorMapper.delete(id);
  }
}
