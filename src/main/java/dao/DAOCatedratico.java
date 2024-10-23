package dao;

import conexion.Conexion;
import modelo.Catedratico;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DAOCatedratico implements DAOGeneral<Integer, Catedratico> {
    private Conexion conexion;

    public DAOCatedratico() {
        conexion = new Conexion();
    }

    @Override
    public boolean agregar(Catedratico elemento) {
        if(conexion.abrir()) {
            String sql = "INSERT INTO catedratico(rfc,nombre) VALUES (?,?)";
            Connection enlace = conexion.obtener();
            try {
                PreparedStatement pstm = enlace.prepareStatement(sql);
                pstm.setString(1, elemento.getRfc());
                pstm.setString(2, elemento.getNombre());
                pstm.execute();
                return true;
            } catch (SQLException e) {
                return false;
            }
        }
        return false;
    }
}

