package com.fluffy.security.service;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;

import com.fluffy.security.dao.ValamiDao;

@Service
public class ValamiService {

//	@PostAuthorize("returnObject.getData() == 'Assd'")
//	@PostAuthorize("a == 1")
	@PreAuthorize("hasAuthority('ADMIN')")
	public ValamiDao getValami(){
		int a=1;
		return new ValamiDao("Asd");
	}
	
}
