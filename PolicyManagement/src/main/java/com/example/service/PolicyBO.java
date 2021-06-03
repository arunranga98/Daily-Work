package com.example.service;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Policy;
import com.example.model.Register;
import com.example.repository.PolicyDAO;

@Service
public class PolicyBO {

	@Autowired
	PolicyDAO policydao;

	public void registerentry(Register register) {
		policydao.registerentry(register);
	}

	public Register getobject(String mobileno) {

		Register register = policydao.getobject(mobileno);
		return register;
	}

	public void addthispolicy( Policy policy) {
		policydao.addthispolicy(policy);
		
	}

	public List<Policy> showpolicy(String userid) {
		List<Policy> pol=policydao.showpolicy(userid);
		
		return pol;
	}

	public Policy retrive(String policyid,String userid) {
		Policy policy=policydao.retrive(policyid,userid);
		return policy;
	}

	public boolean deletepolicy(String policyid,String userid) {
		int rows=policydao.deletepolicy(policyid,userid);
		if(rows<1) {
			return false;
		}
		return true;
		
	}

}
