/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.generics;

import java.sql.PreparedStatement;
import telas.SisCadastro;


/**
 *
 * @author Alex
 */
public interface metodos {

   
    public static void cadastrar(){
        PreparedStatement stmt;
        String sql = "INSERT INTO cliente (?,?,?,?)";
        //stmt.setString(1, );
    }
}
