/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;
import java.util.List;

/**
 *
 * @author Christophe
 */
public class Session {
    private UV uv;
    private Date date;
    private String lieu;
    private Integer nbMin;
    private Integer nbMax;
    private Integer nbFormateur;
    private List<Agent> listeApprenants;
    private List<Agent> listeFormateurs;
    
}
