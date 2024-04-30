
package model;
import java.util.ArrayList;
import dao.AlunoDAO;

public class Aluno extends Pessoa{
    private String curso;
    private int fase;

    public Aluno(String curso, int fase) {
        this.curso = curso;
        this.fase = fase;
    }

    public Aluno(String curso, int fase, int id, String nome, int idade) {
        super(id, nome, idade);
        this.curso = curso;
        this.fase = fase;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getFase() {
        return fase;
    }

    public void setFase(int fase) {
        this.fase = fase;
    }
    
    @Override
    public String toString(){
        return super.toString() + "curso=" + curso + "fase=" + fase;
    }
    
    // BD
    
    public ArrayList getMinhaLista(){
        return AlunoDAO.getMinhaLista();
    }
    
    public boolean insertAlunoBD(String nome, int idade, String curso, int fase){
        int id = this.maiorID() + 1;
        Aluno objeto = new Aluno(id, nome, idade, curso, fase);
        getMinhaLista().add(objeto);
        return true;
    }
    
    
}
