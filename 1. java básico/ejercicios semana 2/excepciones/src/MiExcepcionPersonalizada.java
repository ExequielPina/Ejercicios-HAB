public class MiExcepcionPersonalizada  extends  Exception{
    public MiExcepcionPersonalizada(){
        super();
    }

    public MiExcepcionPersonalizada(String mensaje){
        super(mensaje);
    }

    public void miMetodo() throws MiExcepcionPersonalizada {
        if(day) {
            throw new MiExcepcionPersonalizada(" la has cagado");
        }
    }
}
