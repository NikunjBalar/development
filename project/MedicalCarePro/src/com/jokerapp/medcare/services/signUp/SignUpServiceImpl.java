package com.jokerapp.medcare.services.signUp;

import java.util.logging.Logger;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Service;

import com.jokerapp.medcare.dao.SignUp.SignUpDAO;
import com.jokerapp.medcare.dto.MedicalCareDTO;
import com.jokerapp.medcare.entity.SignUp;

@Service
public class SignUpServiceImpl implements SignUpService {

	@Autowired
	private MailSender sender;

	Logger logger = Logger.getLogger(SignUpServiceImpl.class.getName());

	@Autowired
	private SignUpDAO signUpDAO;

	public SignUpServiceImpl() {
		System.out.println("created \t" + this.getClass().getSimpleName());
	}

	@Override
	public boolean suValidAndSave(MedicalCareDTO dto) {
		boolean valid = true;
		try {
			SignUp signUpEntity = new SignUp();
			//Master masterEntity = new Master();

			String employId = dto.getEmployeeId();
			String email = dto.getEmail();
			String password = dto.getPassword();
			String cPassword = dto.getCPassword();

			if (employId != null && !employId.isEmpty()) {
				if (email != null && !email.isEmpty()) {
					if (password != null && !password.isEmpty() && password.length() > 6 && password.length() < 16) {
						if (cPassword != null && !cPassword.isEmpty() && cPassword.length() > 6
								&& cPassword.length() < 16) {
							if (password.equals(cPassword)) {
								logger.info("both are same");
							} else {
								valid = false;
							}
						} else {
							valid = false;
						}
					} else {
						valid = false;
					}
				} else {
					valid = false;
				}
			} else {
				valid = false;
			}
			BeanUtils.copyProperties(dto, signUpEntity);
			this.signUpDAO.signUp(signUpEntity);

			SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
			simpleMailMessage.setTo(signUpEntity.getEmail());
			simpleMailMessage.setFrom("kunj.hasi103@gmail.com");
			simpleMailMessage.setSubject("Registration");
			simpleMailMessage.setText("Dear Friend,/n Happy New Year"+dto.getEmployeeId());

			sender.send(simpleMailMessage);
			logger.info("send mail to :" + signUpEntity.getEmail());

		} catch (Exception e) {
			System.out.println("exception in " + e.getMessage());
			logger.info("exception in SignUpServiceImpl" + e.getMessage());
		}
		return valid;
	}
}