package entities;

import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {
	private static SimpleDateFormat fmt = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	Date moment;
	String titulo;
	String counteudo;
	Integer likes;
	List<comment>comentarios = new ArrayList<>();

	public Post(Date moment, String titulo, String counteudo, int likes) {
		this.moment = moment;
		this.titulo = titulo;
		this.counteudo = counteudo;
		this.likes = likes;
	}
	public Date getMoment() {
		return moment;
	}
	public void setMoment(Date moment) {
		this.moment = moment;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getCounteudo() {
		return counteudo;
	}
	public void setCounteudo(String counteudo) {
		this.counteudo = counteudo;
	}
	public Integer getLikes() {
		return likes;
	}
	public void setLikes(Integer likes) {
		this.likes = likes;
	}
	
	public void addComment(comment comentario) {
		comentarios.add(comentario);
	}
	
	public void removeComment(comment comentario) {
		comentarios.remove(comentario);
	}

	public String toString() {
	StringBuilder sb = new StringBuilder();
	sb.append(titulo + "\n");
	sb.append(likes);
	sb.append(" Likes - ");
	sb.append(fmt.format(moment) + "\n");
	sb.append(counteudo + "\n");
	sb.append("Comments: \n");
	for (comment c : comentarios) {
		sb.append(c.getText() + "\n");
	}
	 return sb.toString();
	}
	

	
}
