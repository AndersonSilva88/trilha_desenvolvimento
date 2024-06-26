package com.anderson.localizacao;

import com.anderson.localizacao.domain.entity.Cidade;
import com.anderson.localizacao.domain.repository.CidadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.Transactional;

@SpringBootApplication
public class LocalizacaoApplication implements CommandLineRunner {

    @Autowired
    private CidadeRepository cidadeRepository;


    @Override
    public void run(String... args) throws Exception {
        System.out.println("Iniciando localizacao...");

        listarCidadesPorNome();
        listarCidadesPorHabitantes();
    }

    public void listarCidadesPorNome() {
        cidadeRepository.findByNome("São Paulo").forEach(System.out::println);
    }

    public void listarCidadesPorHabitantes() {
        cidadeRepository.findByHabitantes(123854965L).forEach(System.out::println);
    }

    @Transactional
    public void salvarCidade() {
        var cidade = new Cidade(1L, "São Paulo", 1234567L);
        cidadeRepository.save(cidade);
    }

    public void listarCidades() {
        cidadeRepository.findAll().forEach(System.out::println);
    }


    public static void main(String[] args) {
        SpringApplication.run(LocalizacaoApplication.class, args);
    }


}
