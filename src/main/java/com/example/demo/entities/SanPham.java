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

@Entity
@Table(name = "SanPham")

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class SanPham {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")

    private Integer id;

    @Column(name = "Ma")
    @NotBlank(message = "Không để trống!")
    private String ma;

    @Column(name = "Ten")
    @NotBlank(message = "Không để trống!")
    private String ten;

    @Column(name = "TrangThai")
    @NotNull(message = "Không để trống!")
    private int trangThai;

}
