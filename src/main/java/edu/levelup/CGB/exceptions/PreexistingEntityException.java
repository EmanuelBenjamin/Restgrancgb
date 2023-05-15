/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.levelup.CGB.exceptions;

/**
 *
 * @author Asus
 */
public class PreexistingEntityException extends Exception{
    public PreexistingEntityException(String message, Throwable cause){
        super(message, cause);
    }
    public PreexistingEntityException(String message){
        super(message);
    }
}
