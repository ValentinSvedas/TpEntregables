package tp3;

import java.util.Objects;

public class Ciudad {
    private String id;
    private int estacionesServicio;
    private int talleresMecanicos;
    private boolean balanza;
    private boolean radares;

    public Ciudad(String id,boolean balanza, boolean radares, int estacionesServicio, int talleresMecanicos){
        this.id = id;
        this.balanza = balanza;
        this.radares = radares;
        this.estacionesServicio = estacionesServicio;
        this.talleresMecanicos = talleresMecanicos;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getEstacionesServicio() {
        return estacionesServicio;
    }

    public void setEstacionesServicio(int estacionesServicio) {
        this.estacionesServicio = estacionesServicio;
    }

    public int getTalleresMecanicos() {
        return talleresMecanicos;
    }

    public void setTalleresMecanicos(int talleresMecanicos) {
        this.talleresMecanicos = talleresMecanicos;
    }

    public boolean isBalanza() {
        return balanza;
    }

    public void setBalanza(boolean balanza) {
        this.balanza = balanza;
    }

    public boolean isRadares() {
        return radares;
    }

    public void setRadares(boolean radares) {
        this.radares = radares;
    }

    @Override
    public boolean equals(Object o){
        try{
        Ciudad c = (Ciudad) o;
        return Objects.equals(c.getId(),this.getId());
        }catch(Exception exc){
            return false;
        }
    }
    @Override
    public String toString(){
        return this.getId();
    }
}
