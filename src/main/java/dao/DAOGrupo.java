package dao;

import conexion.Conexion;
import modelo.Grupo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DAOGrupo implements DAOGeneral<Integer, Grupo> {
    private Conexion conexion;

    public DAOGrupo() {
        conexion = new Conexion();
    }

    @Override
    public boolean agregar(Grupo elemento) {
        if(conexion.abrir()) {
            String sql = "INSERT INTO grupo(clave,nombre) VALUES (?,?)";
            Connection enlace = conexion.obtener();
            try {
                PreparedStatement pstm = enlace.prepareStatement(sql);
                pstm.setString(1, elemento.getClave());
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
