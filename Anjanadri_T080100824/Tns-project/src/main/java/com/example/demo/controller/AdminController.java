package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Admin;
import com.example.demo.service.AdminService;

@RestController
public class AdminController {
	@Autowired
	public AdminService aserv ;
	@PostMapping("/addAdmin")
	public Admin regAdmin(@RequestBody Admin admin)
	{
 	   return aserv.addAdmin(admin);
    }
	 @GetMapping("/getAdmin")
	   public List<Admin> getAdmin()
	   {
		   return aserv.getAdmin();
     }
	 @DeleteMapping("/deleteAdmin/{id}")
	 public void deleteAdmin(@PathVariable  Long id)
	 {
		 aserv.deleteAdmin(id);
	 }
	 
	 @PutMapping("/updateAdmin")
	   public Admin updateClg(@RequestBody Admin admin)
	   {
		   return aserv.updateAdmin(admin);
	   }
	   
}
	 
