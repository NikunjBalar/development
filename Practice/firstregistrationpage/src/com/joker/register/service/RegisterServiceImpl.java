package com.joker.register.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.joker.register.Entity.RegisterEntityAddress;
import com.joker.register.Entity.RegisterEntityPersonal;
import com.joker.register.dao.AddDAO;
import com.joker.register.dao.PersonalDAO;
import com.joker.register.dto.RegisterDTO;

@Component
public class RegisterServiceImpl implements RegisterService {

	@Autowired
	private PersonalDAO personalDAO;

	@Autowired
	private AddDAO addDAO;

	public RegisterServiceImpl() {
		System.out.println("created \t" + this.getClass().getSimpleName());
	}

	@Override
	public boolean validAndSave(RegisterDTO dto) {
		boolean valid = true;
		try {
			System.out.println("invoked validAndSave()" + dto);
			RegisterEntityPersonal personal = new RegisterEntityPersonal();

			String email = dto.getEmail();
			String password = dto.getPassword();
			String cnfPassword = dto.getCnfPassword();

			System.out.println("starting validation");
			if (email != null && !email.isEmpty() && email.length() > 8 && email.length() < 50) {
				System.out.println("email is valid ");
				if (password != null && !password.isEmpty() && password.length() > 8 && password.length() < 16) {
					System.out.println("password is valid");
					if (cnfPassword != null && !cnfPassword.isEmpty() && cnfPassword.length() > 8
							&& cnfPassword.length() < 16) {
						System.out.println("cnfPassword is valid");
						if (password.equals(cnfPassword)) {
							System.out.println("both are same");
						} else {
							System.out.println("both are differant");
							valid = false;
						}
					} else {
						System.out.println("cnfPassword is invalid");
						valid = false;
					}
				} else {
					System.out.println("password is invalid");
					valid = false;
				}
			} else {
				System.out.println("email is invalid");
				valid = false;
			}
			System.out.println("validation ended");
			/*
			 * personal.setName(dto.getName()); personal.setEmail(dto.getEmail());
			 * personal.setPhoneNumber(dto.getPhoneNumber());
			 * personal.setPassword(dto.getPassword());
			 * personal.setCnfPassword(dto.getCnfPassword()); personal.setAdd(dto.getAdd());
			 */

			BeanUtils.copyProperties(dto, personal);
			this.personalDAO.save(personal);

			RegisterEntityAddress address = new RegisterEntityAddress();
			/*
			 * address.setStreet(dto.getStreet()); address.setCity(dto.getCity());
			 * address.setPincode(dto.getPincode());
			 */
			BeanUtils.copyProperties(dto, address);
			this.addDAO.save(address);

		} catch (Exception e) {
			System.err.println("exception in " + e.getMessage());
		}
		return valid;
	}
}
