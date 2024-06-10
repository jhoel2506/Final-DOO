package co.edu.uco.fink.data.dao.sql.postgresql;

import co.edu.uco.fink.crosscutting.exception.messageCatalog.MessageCatalogStrategy;
import co.edu.uco.fink.crosscutting.exception.messageCatalog.custom.DataFinKException;
import co.edu.uco.fink.crosscutting.exception.messageCatalog.data.CodigoMensaje;
import co.edu.uco.fink.crosscutting.helpers.TextHelper;
import co.edu.uco.fink.data.dao.FincaDAO;
import co.edu.uco.fink.data.dao.sql.SQLconnection;
import co.edu.uco.fink.entity.CiudadEntity;
import co.edu.uco.fink.entity.FincaEntity;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FincaPostgreSQLDAO extends SQLconnection implements FincaDAO {

    public FincaPostgreSQLDAO(final Connection connection) {
        super(connection);
    }

    @Override
    public List<FincaEntity> consultar(FincaEntity entidad) {
        final var listaFincas = new ArrayList<FincaEntity>();
        final var sentenciaSql = new StringBuilder();
        sentenciaSql.append("SELECT identificador, nombre, direccion, ciudad, correo, numero_celular ");
        sentenciaSql.append("FROM finca ");
        sentenciaSql.append("ORDER BY nombre ASC");

        try (final PreparedStatement sentenciaPreparada = getConnection().prepareStatement(sentenciaSql.toString())){
            try (final ResultSet resultado = sentenciaPreparada.executeQuery()){
                while (resultado.next()){
                    CiudadEntity ciudadTMP = CiudadEntity.build(resultado.getInt("ciudad")); // Asumiendo que hay un método en CiudadEntity para construir con un identificador
                    FincaEntity fincaTMP = FincaEntity.build(
                            resultado.getInt("identificador"),
                            resultado.getString("nombre"),
                            resultado.getString("direccion"),
                            ciudadTMP,
                            resultado.getString("correo"),
                            resultado.getInt("numero_celular")
                    );
                    listaFincas.add(fincaTMP);
                }
            }
        } catch (final SQLException exception){
            var mensajeUsuario = TextHelper.replaceParams(MessageCatalogStrategy.getContenidoMensaje(CodigoMensaje.M00002));
            var mensajeTecnico = TextHelper.replaceParams(MessageCatalogStrategy.getContenidoMensaje(CodigoMensaje.M000028), "SELECT", "fincas", "finca");
            throw new DataFinKException(mensajeTecnico, mensajeUsuario, exception);
        } catch (final DataFinKException exception){
            throw exception;
        } catch (final Exception exception) {
            var mensajeUsuario = TextHelper.replaceParams(MessageCatalogStrategy.getContenidoMensaje(CodigoMensaje.M00002));
            var mensajeTecnico = TextHelper.replaceParams(MessageCatalogStrategy.getContenidoMensaje(CodigoMensaje.M000030), "SELECT", "fincas", "finca");
            throw new DataFinKException(mensajeTecnico, mensajeUsuario, exception);
        }
        return listaFincas;
    }

    @Override
    public List<FincaEntity> consultarEmpleado(FincaEntity entidad) {
        return List.of();
    }

    @Override
    public void actualizar(FincaEntity entidad) {

    }

    @Override
    public void crear(FincaEntity entidad) {

    }

    @Override
    public void eliminar(int id) {

    }
}
