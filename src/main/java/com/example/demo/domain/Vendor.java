package com.example.demo.domain;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class Vendor {
  private Long id;

  @NotBlank(message = "ベーダー名を記入してください。")
  private String name;

  @Size(max=50, message="創設者名は50文字を超えないでください。")
  private String founder;

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

  public String getFounder() {
    return founder;
  }

  public void setFounder(String founder) {
    this.founder = founder;
  }
}
