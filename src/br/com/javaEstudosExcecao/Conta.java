package br.com.javaEstudosExcecao;

//conceito
public abstract class Conta {
    protected double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;
    private static int total; //ele é um só para qualquer instancia de objeto.


        //construtor
    public Conta(int agencia, int numero) {
        Conta.total++; //acessando o atributo estático para realizar a contagem
        this.agencia = agencia;
        this.numero = numero;
        if (agencia < 1) {
            throw new IllegalArgumentException("Agência inválida");
        }
        if(numero < 1) {
            throw new IllegalArgumentException("Número da conta é inválido");
        }
        System.out.println("Criando conta " + this.numero);
    }

                //método
    public abstract void deposita(double valor);

    public void saca(double valor) throws SacaException {

        if(this.saldo < valor) {
            throw new SacaException("Saldo: " + this.saldo + ", Valor: " + valor);
        }
         this.saldo -= valor;
    }

    public void transfere(double valor, Conta destino) throws SacaException {
        this.saca(valor);
        destino.deposita(valor);
    }

    public double getSaldo() {

        return this.saldo;
    }

    public int getNumero() {

        return this.numero;
    }

    public void setNumero(int numero) {
        if(numero <= 0) {
            System.out.println("Não pode valor menor ou igual a zero");
            return;
        }
        this.numero = numero;
    }

    public int getAgencia() {
        return this.agencia;
    }

    public void setAgencia(int agencia) {
        if(agencia <= 0) {
            System.out.println("Não pode valor menor ou igual a zero");
            return;
        }
        this.agencia = agencia;
    }

    public void setTitular(Cliente titular) {

        this.titular = titular;
    }

    public Cliente getTitular() {

        return titular;
    }
        //atributo estático
    public static int getTotal() {

        return Conta.total;
    }
}
