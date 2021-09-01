package com.bana.studentmanager;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.querydsl.QPageRequest;

import com.bana.studentmanager.dao.EtudiantRepository;
import com.bana.studentmanager.entity.Etudiant;

@SpringBootApplication
public class StudentmanagerApplication {

	public static void main(String[] args) throws ParseException {
		ApplicationContext ctx=SpringApplication.run(StudentmanagerApplication.class, args);
		EtudiantRepository etudiantRepository=ctx.getBean(EtudiantRepository.class);
		DateFormat df=new SimpleDateFormat("yyyy-MM-dd");
		etudiantRepository.save(new Etudiant("Sory Bana", df.parse("1992-02-02"), 
				"sorybana92@gmail.com", "bana.jpg"));
		etudiantRepository.save(new Etudiant("Mohamed Morcire", df.parse("1987-06-22"), 
				"morcire@gmail.com", "morcire.jpg"));
		etudiantRepository.save(new Etudiant("Mousto Kaba", df.parse("1991-04-26"), 
				"mousto@gmail.com", "mousto.jpg"));
		
	}

}
