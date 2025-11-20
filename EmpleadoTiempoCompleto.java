package Empresa;

public class EmpleadoTiempoCompleto extends Empleado implements Beneficiable {
    private int antiguedad;
    private String departamento;

    public EmpleadoTiempoCompleto(String nombre, String id, double salarioBase, int antiguedad, String departamento) {
        super(nombre, id, salarioBase);
        this.antiguedad = antiguedad;
        this.departamento = departamento;
    }

    @Override
    public double calcularBonificacion() {
        return this.salarioBase * 0.10 * this.antiguedad;
    }

    @Override
    public double aplicarDescuentoSeguro() {
        double salarioTotal = this.calcularSalario();
        return salarioTotal * 0.05;
    }

    @Override
    public double calcularSalario() {
        double bonificacion = this.calcularBonificacion();
        return this.salarioBase + bonificacion;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return super.toString() + " | Tiempo Completo antiguedad=" + antiguedad + ", departamento=" + departamento + ", Salario Total=" + calcularSalario();
    }
}
