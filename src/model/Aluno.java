package model;

public class Aluno extends Pessoa {
    private int mat;

    public int getMat() {
        return mat;
    }

    public void setMat(int mat) {
        this.mat = mat;
    }

    public String toString() {
        return super.toString() + "model.Aluno{" +
                "mat=" + mat +
                '}';
    }

    @Override
    public void quemSouEu() {
        System.out.println("Sou aluno");
    }

    @Override
    public void minhaAtividade() {
        System.out.println("Estudar");
    }
}
