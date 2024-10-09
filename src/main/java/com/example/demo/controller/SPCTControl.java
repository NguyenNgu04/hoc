package com.example.demo.controller;

import com.example.demo.entities.SPCTCustom;
import com.example.demo.repository.SanPhamChiTietRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("spct")
public class SPCTControl {

    @Autowired
    private SanPhamChiTietRepo spctRS;

    @GetMapping("index")
    public String index(Model model,
                        @RequestParam(name = "page", defaultValue = "1") int page,
                        @RequestParam(name = "limit", defaultValue = "10") int limit) {
        Pageable pageable = PageRequest.of(page, limit);
        Page<SPCTCustom> ds = this.spctRS.findAllSP(pageable);
        model.addAttribute("data", ds);
        return "spct/index";
    }
}
