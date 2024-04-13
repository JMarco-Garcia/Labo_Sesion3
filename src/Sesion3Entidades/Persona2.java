/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sesion3Entidades;

/**
 *
 * @author Estudiante
 */
public class Persona2 {

    private PersonaDatosBasicos personaB;
    private PersonaDatosContacto personaC;
    private PersonaDatosRegistro personaR;

    public Persona2(PersonaDatosBasicos personaB, PersonaDatosContacto personaC, PersonaDatosRegistro personaR) {
        this.personaB = personaB;
        this.personaC = personaC;
        this.personaR = personaR;
    }

    public PersonaDatosBasicos getPersonaB() {
        return personaB;
    }

    public PersonaDatosContacto getPersonaC() {
        return personaC;
    }

    public PersonaDatosRegistro getPersonaR() {
        return personaR;
    }

    public void setPersonaB(PersonaDatosBasicos personaB) {
        this.personaB = personaB;
    }

    public void setPersonaC(PersonaDatosContacto personaC) {
        this.personaC = personaC;
    }

    public void setPersonaR(PersonaDatosRegistro personaR) {
        this.personaR = personaR;
    }

}
