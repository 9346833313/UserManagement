package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Staff;
import com.example.demo.repository.StaffRepository;

@Service
public class StaffService {
	@Autowired
	private StaffRepository staffRepository;

	public Staff createStaff(Staff staff) {
		// TODO Auto-generated method stub
		return staffRepository.save(staff);
	}

	public Staff getStaffById(Long staffId) {
		Optional<Staff> optional = staffRepository.findById(staffId);
		return optional.get();
	}

	public List<Staff> getAllStaff() {

		return staffRepository.findAll();
	}

	public Staff UpdateStaff(Staff staff) {
		Staff existingStaff = staffRepository.findById(staff.getId()).get();
		existingStaff.setName(staff.getName());
		existingStaff.setPhoneNo(staff.getPhoneNo());
		existingStaff.setEmail(staff.getEmail());
		Staff updatedStaff = staffRepository.save(existingStaff);
		return updatedStaff;
	}

	public void deleteStaff(Long staffId) {
		// TODO Auto-generated method stub
		staffRepository.deleteById(staffId);
	}
}
