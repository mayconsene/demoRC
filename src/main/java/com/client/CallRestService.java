package com.client;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.model.Pessoa;

@Component
public class CallRestService implements CommandLineRunner {
	
	private static void callRestService() {
		RestTemplate restTemplate = new RestTemplate();
		Pessoa pessoa = restTemplate.getForObject("https://sistemaagely.com.br:8345/recrutamentoagely/covid?service=uf&filter=mg", Pessoa.class);
		System.out.println("O hash de estado é " + pessoa.hashCode());
	}

	@Override
	public void run(String... args) throws Exception {
		callRestService();
		
	}

}
