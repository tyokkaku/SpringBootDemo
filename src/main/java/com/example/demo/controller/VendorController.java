package com.example.demo.controller;

import com.example.demo.service.VendorService;
import com.example.demo.domain.Vendor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

@Controller
@RequestMapping("/vendors")
public class VendorController {

  String redirect = "redirect:/vendors";
  private static final String ATTRIBUTE_NAME = "vendor";
  
  @Autowired
  private VendorService vendorService;

  @GetMapping
  public String index(Model model) {
    model.addAttribute("vendors", vendorService.findAll());

    return "vendors/index";
  }

  @GetMapping("{name}")
  public String show(@PathVariable String name, Model model) {
    model.addAttribute(ATTRIBUTE_NAME, vendorService.findOne(name));
    return "vendors/show";
  }

  @GetMapping("new")
  public String newVendor(@ModelAttribute(ATTRIBUTE_NAME) Vendor vendor, Model model) {
    return "new";
  }

  @GetMapping("{id}/edit")
  public String edit(@PathVariable String name, @ModelAttribute("vendor") Vendor vendor, Model model) {
    model.addAttribute(ATTRIBUTE_NAME, vendorService.findOne(name));
    return "edit";
  }

  @PostMapping
  public String create(@ModelAttribute(ATTRIBUTE_NAME) @Validated Vendor vendor, BindingResult result, Model model) {
    if (result.hasErrors()) {
      return "new";
    } else {
      vendorService.save(vendor);
      return redirect;
    }
  }

  @PutMapping("{id}")
  public String update(@PathVariable Long id, @ModelAttribute("vendor") @Validated Vendor vendor, BindingResult result, Model model) {
    if (result.hasErrors()) {
      model.addAttribute(ATTRIBUTE_NAME, vendor);
      return "edit";
    } else {
      vendor.setId(id);
      vendorService.update(vendor);
      return redirect;
    }
  }

  @DeleteMapping("{id}")
  public String delete(@PathVariable Long id) {
    vendorService.delete(id);
    return redirect;
  }
}
