package org.example;

public record PersonaRegistro(String nombre, String apellidos) {
    @Override
    public String toString(){
        //Comente la linea de codigo que consideros se puede eliminar
        //System.out.println("Esta instruccion es inservible");
        return "%s %s".formatted(nombre, apellidos);
    }
}
