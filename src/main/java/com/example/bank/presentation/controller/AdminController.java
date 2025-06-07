package com.example.bank.presentation.controller;

import com.example.bank.application.dto.AdminDto;
import com.example.bank.application.service.AdminService;
import com.example.bank.domain.model.admin.Admin;
import com.example.bank.domain.model.admin.AdminId;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

/**
 * 管理者APIコントローラ（DDD: プレゼンテーション層／コントローラ）
 * <p>
 * 管理者の登録・削除・権限変更・一覧取得APIのエンドポイントを提供します。
 */
@RestController
@RequestMapping("/admins")
public class AdminController {
    private final AdminService adminService;

    public AdminController(AdminService adminService) {
        this.adminService = adminService;
    }

    /**
     * 管理者登録API
     */
    @PostMapping("/register")
    public void register(@RequestBody AdminDto dto) {
        Admin admin = new Admin(
                new AdminId(dto.getAdminId()),
                dto.getName(),
                dto.getEmail(),
                "dummyHash", // パスワードは本来ハッシュ化して管理
                dto.getRole()
        );
        adminService.register(admin);
    }

    /**
     * 管理者削除API
     */
    @DeleteMapping("/{adminId}")
    public void delete(@PathVariable String adminId) {
        adminService.delete(new AdminId(adminId));
    }

    /**
     * 管理者権限変更API
     */
    @PostMapping("/role/{adminId}")
    public void changeRole(@PathVariable String adminId, @RequestParam String newRole) {
        adminService.changeRole(new AdminId(adminId), newRole);
    }

    /**
     * 管理者一覧取得API
     */
    @GetMapping("")
    public List<AdminDto> getAll() {
        List<Admin> admins = adminService.getAll();
        return admins.stream()
                .map(a -> new AdminDto(
                        a.getId().getValue(),
                        a.getName(),
                        a.getEmail(),
                        a.getRole()
                ))
                .collect(Collectors.toList());
    }
} 