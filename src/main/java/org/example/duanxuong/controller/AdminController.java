package org.example.duanxuong.controller;import org.springframework.stereotype.Controller;import org.springframework.ui.Model;import org.springframework.web.bind.annotation.GetMapping;import org.springframework.web.bind.annotation.RequestMapping;@Controller@RequestMapping("/admin")public class AdminController {    @GetMapping("/trang-chu")    public String ViewTrangChu(Model model) {        model.addAttribute("currentPage", "trang-chu");        return "admin/home";    }    @GetMapping("/khoa-hoc")    public String ViewKhoaHoc(Model model) {        model.addAttribute("currentPage", "khoa-hoc");        return "admin/course";    }    @GetMapping("/chuyen-de")    public String ViewChuyenDe(Model model) {        model.addAttribute("currentPage", "chuyen-de");        return "admin/topic";    }    @GetMapping("/nguoi-dung")    public String ViewNguoiDung(Model model) {        model.addAttribute("currentPage", "nguoi-dung");        return "admin/user";    }}