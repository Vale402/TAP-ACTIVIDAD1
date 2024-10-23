
package dao;

import conexion.Conexion;
import modelo.Alumno;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DAOAlumno implements DAOGeneral<Integer, Alumno> {
    private Conexion conexion;

    public DAOAlumno() {
        conexion = new Conexion();
    }

    @Override
    public boolean agregar(Alumno elemento) {
        if(conexion.abrir()) {
            String sql = "INSERT INTO alumno(num_control,nombre) VALUES (?,?)";
            Connection enlace = conexion.obtener();
            try {
                PreparedStatement pstm = enlace.prepareStatement(sql);
                pstm.setInt(1, elemento.getNumControl());
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


