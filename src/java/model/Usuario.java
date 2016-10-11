/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Henrique
 */
public class Usuario 
{
    private String email;
    private String nome;
    private String senha;
    private String cpf;
    
    public Usuario(String email, String nome, String senha, String cpf)
    {
        this.email = email;
        this.nome = nome;
        this.senha = senha;
        this.cpf = cpf;
    }
    
    public void salvar()
    {
        try
        {
            String URL = "jdbc:derby://localhost:1527/system";

            Connection connection = DriverManager.getConnection(URL,"rodrigo","vasco1");
            System.out.println("Connected successfully");


            String SQL = "INSERT INTO RODRIGO.USUARIO_ (EMAIL,NOME,SENHA,CPF) VALUES (?,?,?,?)";

            PreparedStatement pst = connection.prepareStatement(SQL);

            pst.setString(1, email);
            pst.setString(2, nome);
            pst.setString(3, senha);
            pst.setString(4, cpf);

            pst.executeUpdate();

            System.out.println("SQL executed"); 
                //connection.close();
        }
        catch (SQLException ex) 
        {
            //Logger.getLogger(TrabalhoServlet.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Connection failed");
        }  
    }
}
