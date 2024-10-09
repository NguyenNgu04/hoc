package com.example.demo.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.CodePointLength;

@Entity
@Table(name = "SanPhamChiTiet")

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class SanPhamChiTiet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;

    @Column(name = "IdMauSac")
    @NotNull
    private Integer idMS;

    @Column(name = "IdKichThuoc")
    @NotNull
    private Integer idKT;

    @Column(name = "IdSanPham")
    @NotNull
    private Integer idSP;

    @Column(name = "MaSPCT")
    @NotBlank(message = "Không để trống!")
    private String maSPCT;

    @Column(name = "SoLuong")
    @NotNull
    private int soLuong;

    @Column(name = "DonGia")
    @NotNull
    private Double donGia;

    @Column(name = "TrangThai")
    @NotNull
    private int trangThai;

}
