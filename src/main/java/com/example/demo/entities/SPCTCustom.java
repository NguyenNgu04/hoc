package com.example.demo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class SPCTCustom {
    @Id
    private Integer id;

    private Integer idMS;
    private Integer idKT;
    private String tenSP;
    private String maSPCT;
    private int soLuong;
    private Double donGia;
    private int trangThai;


}
