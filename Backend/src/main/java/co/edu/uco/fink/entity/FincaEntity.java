package co.edu.uco.fink.entity;

import co.edu.uco.fink.crosscutting.helpers.NumericHelper;
import co.edu.uco.fink.crosscutting.helpers.ObjectHelper;
import co.edu.uco.fink.crosscutting.helpers.TextHelper;

public class FincaEntity {
    private int identificador;
    private String nombre;
    private String direccion;
    private CiudadEntity ciudad;
    private String correo;
    private int numeroCelular;

    private FincaEntity(final int identificador) {
        setIdentificador(identificador);
        setNombre(TextHelper.EMPTY);
        setDireccion(TextHelper.EMPTY);
        setCiudad(CiudadEntity.build());
        setCorreo(TextHelper.EMPTY);
        setNumeroCelular(NumericHelper.ZERO);
    }

    private FincaEntity(final int identificador, final String nombre, final String direccion, final CiudadEntity ciudad, final String correo, final int numeroCelular) {
        setIdentificador(identificador);
        setNombre(nombre);
        setDireccion(direccion);
        setCiudad(ciudad);
        setCorreo(correo);
        setNumeroCelular(numeroCelular);
    }

    public static final FincaEntity Build(final int identificador) {
        return new FincaEntity(identificador);
    }

    public static final FincaEntity build(final int identificador, final String nombre, final String direccion, final CiudadEntity ciudad, final String correo, final int numeroCelular) {
        return new FincaEntity(identificador, nombre, direccion, ciudad, correo, numeroCelular);
    }

    protected static final FincaEntity build() {
        return new FincaEntity(NumericHelper.ZERO);
    }

    public final int getIdentificador() {
        return identificador;
    }

    public final void setIdentificador(final int identificador) {
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

    public final CiudadEntity getCiudad() {
        return ciudad;
    }

    public final void setCiudad(final CiudadEntity ciudad) {
        this.ciudad = ObjectHelper.getObjectHelper().getDefault(ciudad, CiudadEntity.build());
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
}
