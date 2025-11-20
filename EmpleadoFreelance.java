package Empresa;

public class EmpleadoFreelance extends Empleado implements Beneficiable {
    private int horasTrabajadas;
    private double tarifaHora;

    public EmpleadoFreelance(String nombre, String id, double salarioBase, int horasTrabajadas, double tarifaHora) {
        super(nombre, id, salarioBase);
        this.horasTrabajadas = horasTrabajadas;
        this.tarifaHora = tarifaHora;
    }

    @Override
    public double calcularBonificacion() {
        double salarioBaseCalculado = this.horasTrabajadas * this.tarifaHora;
        if (this.horasTrabajadas > 160) {
            return salarioBaseCalculado * 0.05;
        }
        return 0;
    }

    @Override
    public double aplicarDescuentoSeguro() {
        double salarioTotal = this.calcularSalario();
        return salarioTotal * 0.03;
    }

    @Override
    public double calcularSalario() {
        double salarioBaseCalculado = this.horasTrabajadas * this.tarifaHora;
        double bonificacion = this.calcularBonificacion();
        return salarioBaseCalculado + bonificacion;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public double getTarifaHora() {
        return tarifaHora;
    }

    public void setTarifaHora(double tarifaHora) {
        this.tarifaHora = tarifaHora;
    }

    @Override
    public String toString() {
        return super.toString() + " | Freelance horasTrabajadas=" + horasTrabajadas + ", tarifaHora=" + tarifaHora + ", Salario Total=" + calcularSalario();
    }
}