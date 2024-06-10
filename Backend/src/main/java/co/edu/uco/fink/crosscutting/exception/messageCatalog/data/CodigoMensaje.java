package co.edu.uco.fink.crosscutting.exception.messageCatalog.data;

import static co.edu.uco.fink.crosscutting.helpers.TextHelper.UNDERLINE;
import static co.edu.uco.fink.crosscutting.helpers.TextHelper.concatenate;

public enum CodigoMensaje {
    M00001(TipoMensaje.TECNICO, CategoriaMensaje.ERROR, "00001", true),
    M00002(TipoMensaje.USUARIO, CategoriaMensaje.ERROR, "00002", true),
    M00003(TipoMensaje.TECNICO, CategoriaMensaje.ERROR, "00003", true),
    M00004(TipoMensaje.TECNICO, CategoriaMensaje.ERROR, "00004", true),
    M00005(TipoMensaje.TECNICO, CategoriaMensaje.ERROR, "00005", true),
    M00006(TipoMensaje.TECNICO, CategoriaMensaje.ERROR, "00006", true),
    M00007(TipoMensaje.TECNICO, CategoriaMensaje.ERROR, "00007", true),
    M00008(TipoMensaje.TECNICO, CategoriaMensaje.ERROR, "00008", true),
    M00009(TipoMensaje.TECNICO, CategoriaMensaje.ERROR, "00009", true),
    M000010(TipoMensaje.TECNICO, CategoriaMensaje.ERROR, "000010", true),
    M000011(TipoMensaje.TECNICO, CategoriaMensaje.ERROR, "000011", true),
    M000012(TipoMensaje.TECNICO, CategoriaMensaje.ERROR, "000012", true),
    M000013(TipoMensaje.TECNICO, CategoriaMensaje.ERROR, "000013", true),
    M000014(TipoMensaje.TECNICO, CategoriaMensaje.ERROR, "000014", true),
    M000015(TipoMensaje.TECNICO, CategoriaMensaje.ERROR, "000015", true),
    M000016(TipoMensaje.TECNICO, CategoriaMensaje.ERROR, "000016", true),
    M000017(TipoMensaje.TECNICO, CategoriaMensaje.ERROR, "000017", true),
    M000018(TipoMensaje.TECNICO, CategoriaMensaje.ERROR, "000018", true),
    M000019(TipoMensaje.TECNICO, CategoriaMensaje.ERROR, "000019", true),
    M000020(TipoMensaje.TECNICO, CategoriaMensaje.ERROR, "000020", true),
    M000021(TipoMensaje.TECNICO, CategoriaMensaje.ERROR, "000021", true),
    M000022(TipoMensaje.TECNICO, CategoriaMensaje.ERROR, "000022", true),
    M000023(TipoMensaje.TECNICO, CategoriaMensaje.ERROR, "000023", true),
    M000024(TipoMensaje.TECNICO, CategoriaMensaje.ERROR, "000024", true),
    M000025(TipoMensaje.USUARIO, CategoriaMensaje.ERROR, "000025", false),
    M000026(TipoMensaje.USUARIO, CategoriaMensaje.EXITO, "000026", false),
    M000027(TipoMensaje.TECNICO, CategoriaMensaje.ERROR, "000027", true),
    M000028(TipoMensaje.TECNICO, CategoriaMensaje.ERROR, "000028", true),
    M000029(TipoMensaje.USUARIO, CategoriaMensaje.ERROR, "000029", true),
    M000030(TipoMensaje.TECNICO, CategoriaMensaje.ERROR, "000030", true),
    M000031(TipoMensaje.TECNICO, CategoriaMensaje.ERROR, "000031", true),
    M000032(TipoMensaje.TECNICO, CategoriaMensaje.ERROR, "000032", false),
    M000033(TipoMensaje.USUARIO, CategoriaMensaje.ERROR, "000033", false),
    M000034(TipoMensaje.TECNICO, CategoriaMensaje.ERROR, "000034", false),
    M000035(TipoMensaje.USUARIO, CategoriaMensaje.ERROR, "000035", false),
    M000036(TipoMensaje.TECNICO, CategoriaMensaje.ERROR, "000036", false),
    M000037(TipoMensaje.USUARIO, CategoriaMensaje.ERROR, "000037", false),
    M000038(TipoMensaje.TECNICO, CategoriaMensaje.ERROR, "000038", false),
    M000039(TipoMensaje.USUARIO, CategoriaMensaje.ERROR, "000039", false),
    M000040(TipoMensaje.TECNICO, CategoriaMensaje.ERROR, "000040", false),
    M000041(TipoMensaje.USUARIO, CategoriaMensaje.ERROR, "000041", false),
    M000042(TipoMensaje.TECNICO, CategoriaMensaje.ERROR, "000042", false),
    M000043(TipoMensaje.USUARIO, CategoriaMensaje.ERROR, "000043", false),
    M000044(TipoMensaje.TECNICO, CategoriaMensaje.ERROR, "000044", false);

    private TipoMensaje tipo;
    private CategoriaMensaje categoria;
    private String codigo;
    private boolean base;

    private CodigoMensaje(final TipoMensaje tipo, final CategoriaMensaje categoria, final String codigo,
                          final boolean base) {
        setTipo(tipo);
        setCategoria(categoria);
        setCodigo(codigo);
        setBase(base);
    }

    public final TipoMensaje getTipo() {
        return tipo;
    }

    public final CategoriaMensaje getCategoria() {
        return categoria;
    }

    public final String getCodigo() {
        return codigo;
    }

    public final boolean isBase() {
        return base;
    }

    private final void setTipo(final TipoMensaje tipo) {
        this.tipo = tipo;
    }

    private final void setCategoria(final CategoriaMensaje categoria) {
        this.categoria = categoria;
    }

    private final void setCodigo(final String codigo) {
        this.codigo = codigo;
    }

    private final void setBase(final boolean base) {
        this.base = base;
    }

    public final String getIdentificador() {
        return concatenate(getTipo().name(), UNDERLINE, getCategoria().name(), UNDERLINE, getCodigo());
    }
}
