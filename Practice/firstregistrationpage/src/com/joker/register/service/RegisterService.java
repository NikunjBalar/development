package com.joker.register.service;

import com.joker.register.dto.RegisterDTO;

public interface RegisterService {
	public boolean validAndSave(RegisterDTO dto);
}
