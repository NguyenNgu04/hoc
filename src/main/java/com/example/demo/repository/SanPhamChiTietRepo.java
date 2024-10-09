package com.example.demo.repository;

import com.example.demo.entities.SPCTCustom;
import com.example.demo.entities.SanPhamChiTiet;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface SanPhamChiTietRepo extends JpaRepository<SanPhamChiTiet, Integer> {

    @Query("select new SPCTCustom (spct.id, spct.idMS, spct.idKT, sp.ten, spct.maSPCT, spct.soLuong, spct.donGia, spct.trangThai) from SanPhamChiTiet spct \n" +
            "join SanPham sp on spct.idSP = sp.id")
    public Page<SPCTCustom> findAllSP(Pageable pageable);
}
