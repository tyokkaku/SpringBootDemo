package com.example.demo.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import com.example.demo.domain.Vendor;

@Mapper
public interface VendorMapper {
  List<Vendor> findAll();
  
  Vendor findOne(String name);
  
  void save(Vendor vendor);
  
  void update(Vendor vendor);
  
  void delete(Long id);  
}