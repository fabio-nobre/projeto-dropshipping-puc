package com.fabionobre.loja.services;

import org.springframework.mail.SimpleMailMessage;

import com.fabionobre.loja.domain.Cliente;
import com.fabionobre.loja.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);
	
	void sendNewPasswordEmail(Cliente cliente, String newPass);
}
