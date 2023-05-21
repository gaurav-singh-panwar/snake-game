/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.snakegameproject;

/**
 *
 * @author sgaur
 */

 import javax.swing.*;

public class frame extends JFrame {
    frame(){
        this.add(new panel());
        this.setTitle("snakegame");
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
    }

}
