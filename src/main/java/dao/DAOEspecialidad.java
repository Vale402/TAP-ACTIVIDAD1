package dao;

import conexion.Conexion;
import modelo.Especialidad;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DAOEspecialidad implements DAOGeneral<Integer, Especialidad> {
    private Conexion conexion;

    public DAOEspecialidad() {
        conexion = new Conexion();
    }
    @Override
    public boolean agregar(Especialidad elemento) {
        if(conexion.abrir()) {
            String sql = "INSERT INTO especialidad(clave,nombre) VALUES (?,?)";
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
