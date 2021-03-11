/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;

import java.util.Objects;

/**
 *
 * @author raquel
 */
public class Administrativo {

    private String grupo;

    public Administrativo(String grupo) {
        this.grupo = grupo;
    }

    public void registrarDocumento() {

    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.grupo);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Administrativo other = (Administrativo) obj;
        if (!Objects.equals(this.grupo, other.grupo)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Administrativo{" + "grupo=" + grupo + '}';
    }

}
