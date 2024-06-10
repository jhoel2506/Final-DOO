package co.edu.uco.fink.data.dao;

import co.edu.uco.fink.data.dao.general.ActualizarDAO;
import co.edu.uco.fink.data.dao.general.ConsultarDAO;
import co.edu.uco.fink.data.dao.general.CrearDAO;
import co.edu.uco.fink.data.dao.general.EliminarDAO;
import co.edu.uco.fink.entity.FincaEntity;

public interface FincaDAO extends CrearDAO<FincaEntity>,ActualizarDAO<FincaEntity>,EliminarDAO,ConsultarDAO<FincaEntity>{
}