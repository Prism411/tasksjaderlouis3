package application;

import java.time.format.DateTimeFormatter;
import java.util.Date;

import entities.Post;
import entities.comment;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class main {
	public static void main(String[] args) throws ParseException {
	
	SimpleDateFormat fmt = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	Post pp = new Post(fmt.parse("21/06/2018 13:05:44"), "Viajando para Nova Zelandia", "Vou visitar o pais maravilhoso!", 12);
	comment c1 = new comment("Incrivel! que legal!");
	comment c2 = new comment("Queria ir também!");
	
	pp.addComment(c1);
	pp.addComment(c2);
	System.out.println(pp);
	

	}
}
