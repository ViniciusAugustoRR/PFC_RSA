package model;

public class Teacher {
    private int id_professor;
    private String nome;
    private String cpf;
    private String email;
    private String local;
    private String telefone;

    public int getId_professor(){
        return id_professor;
    }
    public void setId_professor(int id_professor) {
        this.id_professor = id_professor;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public boolean checkCpf(String cpf){
        if(!this.cpf.isEmpty()){
            if(this.cpf.length() == 11){
                return true;
            }
        }
        return false;
    } 
    
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getLocal() {
        return local;
    }
    public void setLocal(String local) {
        this.local = local;
    }

    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public boolean checkTel(String telefone){
        if(!this.telefone.isEmpty()){
            if(this.telefone.length() == 11){
                return true;
            }
        }
        return false;
    } 
   
}
