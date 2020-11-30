package com.example.demo.domain;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class Item {
  private Long id;

  @NotBlank(message = "商品名を記入してください。")
  private String name;

  @Min(value = 10, message = "10以上の数値を入力してください。")
  @Max(value = 10000, message = "1000以下の数値を入力してください。")
  private float price;

  @Size(max=50, message="ベーダー名は50文字を超えないでください。")
  private String vendor;

  @Size(max=15, message="カラー名は15文字を超えないでください。")
  private String color;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }
  
  public void setName(String name) {
    this.name = name;
  }
  
  public float getPrice() {
    return price;
  }
  
  public void setPrice(float price) {
    this.price = price;
  }
  
  public String getVendor() {
    return vendor;
  }

  public void setVendor(String vendor) {
    this.vendor = vendor;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }
}