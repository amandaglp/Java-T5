package banco.domains;

/**
 *
 * @author lopes
 */
public class Cliente {
    
    private int id;
    private String nome;
    private String email;
    private String civil;
    private char sexo;

    public Cliente(String nome,char sexo, String email, String civil) {
        this.nome = nome; 
        this.sexo = sexo;
        this.email = email;
        this.civil = civil;
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCivil() {
        return civil;
    }

    public void setCivil(String civil) {
        this.civil = civil;
    }

}
