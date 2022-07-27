
package conexionABases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Funsiones {
    PreparedStatement ps;
    ResultSet rs;
    Connection con;
    Conexion conectar = new Conexion();
    
    public void consultar(){
        String instruccion = "select * from alumno";
        try {
            con = conectar.Conectar();
            ps = con.prepareStatement(instruccion);
            rs = ps.executeQuery();
            
            while (rs.next()) {                
                System.out.println(rs.getInt(1));
                System.out.println(rs.getString(2));
                System.out.println(rs.getString(3));
                System.out.println(rs.getInt(4));
                System.out.println("---------------");
            }
            
        } catch (Exception e) {
        }
    }
    
    public void insertar(int cod, String nom, String dir, int num){
        String sql = "insert into alumno(Codigo,Nombre,Direccion,Telefono) values (?,?,?,?)";
        try {
            con = conectar.Conectar();
            ps = con.prepareStatement(sql);
            ps.setInt(1, cod);
            ps.setString(2, nom);
            ps.setString(3, dir);
            ps.setInt(4, num);
            ps.executeUpdate();
            
            
        } catch (Exception e) {
        }
    }
    
    public void modificar(int cod, String nom, String dir, int num){
        String sql = "update alumno set Nombre='" + nom + "', Direccion='" + dir + "', Telefono='" + num + "' where Codigo ='" + cod + "'";
        try {
            con = conectar.Conectar();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    public void eliminar(int id){
        String sql = "delete from alumno where Codigo = ?";
        try {
            con = conectar.Conectar();
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }
}
