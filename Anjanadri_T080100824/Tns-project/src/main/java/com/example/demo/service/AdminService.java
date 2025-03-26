package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Admin;
import com.example.demo.repository.AdminRepository;

@Service
public class AdminService {
	@Autowired
    public AdminRepository arepo;
	
	public Admin addAdmin(Admin admin) 
	{
		return arepo.save(admin);
		
	}

	public List<Admin> getAdmin()
	{
		
		
		return arepo.findAll();
	}
	
    public void  deleteAdmin(long id)
    {
    	arepo.deleteById(id);
    }

    public Admin updateAdmin(Admin admin)
	{
		long adminId=admin.getId();
		Admin c1=arepo.findById(adminId).get();
		c1.setAdminName(c1.getAdminName());
		return arepo.save(admin);
	}
}
