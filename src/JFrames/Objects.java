/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JFrames;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.CallableStatement;
import java.sql.Statement;

/**
 *
 * @author JCM
 */
public class Objects {

    public static Connection con;
    public static PreparedStatement pst = null;
      public static Statement st;
    public static ResultSet rs = null;

    public static CallableStatement cst = null;

}
