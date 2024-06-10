package co.edu.uco.fink.dto;

import co.edu.uco.fink.crosscutting.helpers.NumericHelper;
import co.edu.uco.fink.crosscutting.helpers.ObjectHelper;
import co.edu.uco.fink.crosscutting.helpers.TextHelper;

public class FincaDTO {

    private int identificador;
    private String nombre;
    private String direccion;
    private CiudadDTO ciudad;
    private String correo;
    private int numeroCelular;

    public FincaDTO() {
        setIdentificador(NumericHelper.ZERO);
        setNombre(TextHelper.EMPTY);
        setDireccion(TextHelper.EMPTY);
        setCiudad(CiudadDTO.build());
        setCorreo(TextHelper.EMPTY);
        setNumeroCelular(NumericHelper.ZERO);
    }

    public FincaDTO(final int identificador, final String nombre, final String direccion, final CiudadDTO ciudad, final String correo, final int numeroCelular) {
        setIdentificador(identificador);
        setNombre(nombre);
        setDireccion(direccion);
        setCiudad(ciudad);
        setCorreo(correo);
        setNumeroCelular(numeroCelular);
    }

    public static final FincaDTO build() {
        return new FincaDTO();
    }

    public final int getIdentificador() {
        return identificador;
    }

    public final FincaDTO setIdentificador(final int identificador) {
        this.identificador = identificador;
        return this;
    }

    public final String getNombre() {
        return nombre;
    }

    public final FincaDTO setNombre(final String nombre) {
        this.nombre = nombre;
        return this;
    }

    public final String getDireccion() {
        return direccion;
    }

    public final FincaDTO setDireccion(final String direccion) {
        this.direccion = direccion;
        return this;
    }

    public final CiudadDTO getCiudad() {
        return ciudad;
    }

    public final FincaDTO setCiudad(final CiudadDTO ciudad) {
        this.ciudad = ObjectHelper.getObjectHelper().getDefault(ciudad, CiudadDTO.build());
        return this;
    }

    public final String getCorreo() {
        return correo;
    }

    public final FincaDTO setCorreo(final String correo) {
        this.correo = correo;
        return this;
    }

    public final int getNumeroCelular() {
        return numeroCelular;
    }

    public final FincaDTO setNumeroCelular(final int numeroCelular) {
        this.numeroCelular = numeroCelular;
        return this;
    }
}
