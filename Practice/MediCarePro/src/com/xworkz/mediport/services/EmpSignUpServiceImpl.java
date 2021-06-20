package com.xworkz.mediport.services;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Component;

import com.xworkz.mediport.Util.RndomPasswordGenerate;
import com.xworkz.mediport.dao.EmpSignUpDao;
import com.xworkz.mediport.dto.RegistrationDto;
import com.xworkz.mediport.entity.LoginEntity;
import com.xworkz.mediport.entity.RegistrationEntity;

@Component
public class EmpSignUpServiceImpl implements EmployeeService {

	@Autowired
	private EmpSignUpDao empSignUpDao;

	/*
	 * @Autowired private RegistrationDto registrationDto;
	 */

	@Autowired
	private MailSender sender;

	public EmpSignUpServiceImpl() {
		System.out.println("Created \t" + this.getClass().getTypeName());
	}

	@Override
	public boolean validateAndSave(RegistrationDto registrationDto) {
		try {
			System.out.println("involked save validate method" + registrationDto);
			boolean valid = true;
			if (registrationDto != null) {
				String employeeid = registrationDto.getEmployeeid();
				String email = registrationDto.getEmail();
				String password = registrationDto.getPassword();
				String cpassword = registrationDto.getCpassword();

				if (employeeid != null && !employeeid.isEmpty() && employeeid.length() >= 5) {
					System.out.println("employeeid is valid ");
				} else {
					System.out.println("invalid employeeid");
					valid = false;
				}

				if (email != null && !email.isEmpty() && email.length() > 8 && email.length() < 60) {
					System.out.println("email is valid ");
				} else {
					System.out.println("invalid email");
					valid = false;
				}
				if (password != null && !password.isEmpty() && password.length() > 8 && password.length() < 16) {
					System.out.println("password is valid ");
				} else {
					System.out.println("invalid password");
					valid = false;
				}
				if (cpassword != null && !cpassword.isEmpty() && cpassword.length() > 8 && cpassword.length() < 16) {
					System.out.println("password is valid ");
				} else {
					System.out.println("invalid password");
					valid = false;
				}
				if (password.equals(cpassword)) {
					System.out.println("password is matching valid ");
				} else {
					System.out.println("invalid password change and retry");
					valid = false;

				}
			}
			if (valid) {
				/*
				 * String randpassword = new RndomPasswordGenerate().generatePassword();
				 * registrationDto.setPassword(randpassword); System.out.println(randpassword);
				 */
				registrationDto.getPassword();
				RegistrationEntity registrationEntity = new RegistrationEntity();
				BeanUtils.copyProperties(registrationDto, registrationEntity);
				System.out.println("involked save validate method" + registrationDto);
				this.empSignUpDao.save(registrationEntity);
				if (valid == true) {
					System.out.println("sending mail to user");
					this.mailSender(registrationDto);
				}
			}
			return valid;

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		return false;
	}

	@Override
	public boolean loginexist(LoginEntity loginEntity) {

		System.out.println("involked save validate method" + loginEntity);
		boolean valid = true;
		if (loginEntity != null) {
			String employeeid = loginEntity.getEmpid();
			// String email = loginEntity.getEmail();
			String password = loginEntity.getPassword();
			this.empSignUpDao.chacklogin(employeeid, password);

		}

		return valid;

	}

	private boolean mailSender(RegistrationDto registrationDto) {
		try {
			System.out.println("signup mail sending started");
			System.out.println(registrationDto);
			SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
			simpleMailMessage.setTo(registrationDto.getEmail());
			simpleMailMessage.setFrom("kunj.hasi103@gmail.com");
			simpleMailMessage.setSubject("successfully registration............");
			simpleMailMessage.setText("Mr/Mrs" + registrationDto.getEmail() + "you have successfully registered"
					+ "your employee id is " + registrationDto.getEmployeeid());
			sender.send(simpleMailMessage);
			System.out.println("mail to send on" + registrationDto.getEmail());
			return true;
		} catch (Exception e) { // System.out.println(e.getMessage());
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean forgetPassword(String email) {

		System.out.println("involked save validate method" + email);
		boolean valid = true;
		if (email != null) {
			this.empSignUpDao.forgetPassword(email);
		}

		// this.mailSender(email);

		return valid;

	}

	private void mailSender(String email) {
		try {
			String randpassword = new RndomPasswordGenerate().generatePassword();
			RegistrationDto registrationDto = null;
			registrationDto.setPassword(randpassword);
			System.out.println(randpassword);
			System.out.println("signup mail sending started");
			System.out.println(email);
			SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
			simpleMailMessage.setTo(registrationDto.getEmail());
			simpleMailMessage.setFrom("parasjitaliya@gmail.com");
			simpleMailMessage.setSubject("your password is............" + randpassword);
			simpleMailMessage.setText("Mr/Mrs" + registrationDto.getEmail() + "your password is ");
			sender.send(simpleMailMessage);
			System.out.println("mail to send on" + email);

		} catch (Exception e) { // System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}

}