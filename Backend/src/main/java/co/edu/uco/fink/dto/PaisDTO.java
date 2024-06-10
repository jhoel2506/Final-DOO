package co.edu.uco.fink.dto;


import co.edu.uco.fink.business.domain.CiudadDomain;
import co.edu.uco.fink.crosscutting.helpers.TextHelper;

public final class PaisDTO {

    public static CiudadDomain build;
    private int id;
    private String nombre;

    public PaisDTO(final int id,final String nombre) {
        setId(id);
        setNombre(nombre);
    }

    public PaisDTO() {
        setNombre(TextHelper.EMPTY);
    }

    public static final PaisDTO build(){
        return new PaisDTO();
    }

    public final int getId() {
        return id;
    }

    public final PaisDTO setId(final int id) {
        this.id = id;
        return this;
    }

    public final String getNombre() {
        return nombre;
    }

    public final PaisDTO setNombre(final String nombre) {
        this.nombre = TextHelper.applyTrim(nombre);
        return this;
    }

}
