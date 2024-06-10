package co.edu.uco.fink.business.domain;

import co.edu.uco.fink.crosscutting.helpers.NumericHelper;
import co.edu.uco.fink.crosscutting.helpers.ObjectHelper;
import co.edu.uco.fink.crosscutting.helpers.TextHelper;

public class FincaDomain {

    private int identificador;
    private String nombre;
    private String direccion;
    private CiudadDomain ciudad;
    private String correo;
    private int numeroCelular;

    private FincaDomain() {
        setIdentificador(NumericHelper.ZERO);
        setNombre(TextHelper.EMPTY);
        setDireccion(TextHelper.EMPTY);
        setCiudad(CiudadDomain.crear());
        setCorreo(TextHelper.EMPTY);
        setNumeroCelular(NumericHelper.ZERO);
    }

    private FincaDomain(final int identificador, final String nombre, final String direccion, final CiudadDomain ciudad, final String correo, final int numeroCelular) {
        setIdentificador(identificador);
        setNombre(nombre);
        setDireccion(direccion);
        setCiudad(ciudad);
        setCorreo(correo);
        setNumeroCelular(numeroCelular);
    }

    public final int getIdentificador() {
        return identificador;
    }

    private final void setIdentificador(final int identificador) {
        this.identificador = identificador;
    }

    public final String getNombre() {
        return nombre;
    }

    public final void setNombre(final String nombre) {
        this.nombre = nombre;
    }

    public final String getDireccion() {
        return direccion;
    }

    public final void setDireccion(final String direccion) {
        this.direccion = direccion;
    }

    public final CiudadDomain getCiudad() {
        return ciudad;
    }

    private final void setCiudad(final CiudadDomain ciudad) {
        this.ciudad = ObjectHelper.getObjectHelper().getDefault(ciudad, CiudadDomain.crear());
    }

    public final String getCorreo() {
        return correo;
    }

    public final void setCorreo(final String correo) {
        this.correo = correo;
    }

    public final int getNumeroCelular() {
        return numeroCelular;
    }

    public final void setNumeroCelular(final int numeroCelular) {
        this.numeroCelular = numeroCelular;
    }

    public static final FincaDomain crear(final int identificador, final String nombre, final String direccion, final CiudadDomain ciudad, final String correo, final int numeroCelular) {
        return new FincaDomain(identificador, nombre, direccion, ciudad, correo, numeroCelular);
    }

    public static final FincaDomain crear() {
        return new FincaDomain();
    }
}
