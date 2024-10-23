package dao;

import conexion.Conexion;
import modelo.Materia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DAOMateria implements DAOGeneral<Integer, Materia> {
    private Conexion conexion;

    public DAOMateria() {
        conexion = new Conexion();
    }

    @Override
    public boolean agregar(Materia elemento) {
        if(conexion.abrir()) {
            String sql = "INSERT INTO materia(clave,nombre) VALUES (?,?)";
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
