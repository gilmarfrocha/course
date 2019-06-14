package entities;

public class estudante {
private String Nome;
private String Email;
public estudante(String nome, String email) {
	super();
	Nome = nome;
	Email = email;
}
public String getNome() {
	return Nome;
}
public void setNome(String nome) {
	Nome = nome;
}
public String getEmail() {
	return Email;
}
public void setEmail(String email) {
	Email = email;
}
@Override
public String toString() {
	return  Nome + ", " + Email ;
}

}
