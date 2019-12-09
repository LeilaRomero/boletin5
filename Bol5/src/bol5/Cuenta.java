package bol5;

/**
 *
 * @author Leila
 */
public class Cuenta {
    
    private String cliente;
    private String cuenta;
    private double saldo;
    
    public Cuenta(){
    
}

    public Cuenta(String cliente, String cuenta, double saldo) {
        this.cliente = cliente;
        this.cuenta = cuenta;
        this.saldo = saldo;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public void setIngresos(double saldo) {

        this.saldo = this.saldo + saldo;
        if (saldo<0){
            System.out.println("Error la cantidad ingresada es negativa");
            this.saldo= this.saldo - saldo;
        }
            else {                  
            System.out.println("Cantidad actual de tu saldo es de "+ this.saldo);
            }
        }
    

    public void setReintegro(double saldo) {

        this.saldo = this.saldo - saldo;
        if(saldo<0){
            System.out.println("Error la cantidad a retirar es negativa");
            this.saldo= this.saldo+saldo;
        }
        else if (this.saldo < 0){
            System.out.println("Error no puede retirar esa cantidad");
            this.saldo= this.saldo + saldo;
        }
        else{
            System.out.println("Cantidad actual de tu saldo es de "+ this.saldo);
        }
        }
        

    public void datosCliente() {
        System.out.println("Cliente= " + cliente + ". Conta= " + cuenta + ". Saldo= " + saldo);
    }
    
}
