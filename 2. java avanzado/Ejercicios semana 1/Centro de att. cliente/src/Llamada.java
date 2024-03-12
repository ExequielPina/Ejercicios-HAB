class Llamada {
    private Cliente cliente;
    private String consulta;

    public Llamada(Cliente cliente, String consulta) {
        this.cliente = cliente;
        this.consulta = consulta;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public String getConsulta() {
        return consulta;
    }
}