package model;

public class Service {
    
    private int id_serviço;
    private int id_professor;
    private String data_inicial;
    private String data_final;
    private int turma;
    private float md_coord;
    private float md_aluno;
    private float md_docente;

    public int getId_serviço() {
        return id_serviço;
    }
    public void setId_serviço(int id_serviço) {
        this.id_serviço = id_serviço;
    }

    public int getId_professor() {
        return id_professor;
    }
    public void setId_professor(int id_professor) {
        this.id_professor = id_professor;
    }

    public String getData_inicial() {
        return data_inicial;
    }
    public void setData_inicial(String data_inicial) {
        this.data_inicial = data_inicial;
    }

    public String getData_final() {
        return data_final;
    }
    public void setData_final(String data_final) {
        this.data_final = data_final;
    }

    public int getTurma() {
        return turma;
    }
    public void setTurma(int turma) {
        this.turma = turma;
    }

    public float getMd_coord() {
        return md_coord;
    }
    public void setMd_coord(float md_coord) {
        this.md_coord = md_coord;
    }

    public float getMd_aluno() {
        return md_aluno;
    }
    public void setMd_aluno(float md_aluno) {
        this.md_aluno = md_aluno;
    }

    public float getMd_docente() {
        return md_docente;
    }
    public void setMd_docente(float md_docente) {
        this.md_docente = md_docente;
    }
    
}