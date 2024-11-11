package model;

import enums.Cargo;

public final class Professor extends Pessoa implements Remuneravel {
    private double salario;

    public Cargo cargo;

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }



    @Override
    public void quemSouEu() {
        System.out.println("Sou professor");
    }

    @Override
    public void minhaAtividade() {
        System.out.println("Ensinar");
    }


    @Override
    public void calcularSalario() {
        int salario;
    }

    @Override
    public void aplicarBonus() {
        salario += salario * 0.15;
    }
    @Override
    public String toString() {
        return super.toString() + "model.Professor{" +
                "salario=" + salario +
                '}';
    }
}