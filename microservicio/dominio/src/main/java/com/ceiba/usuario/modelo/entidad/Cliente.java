package com.ceiba.usuario.modelo.entidad;

import lombok.Getter;

import java.time.LocalDateTime;

import static com.ceiba.dominio.ValidadorArgumento.validarObligatorio;

@Getter
public class Cliente {
	
	private static final String SE_DEBE_INGRESAR_EL_NOMBRE_DEL_CLIENTE = "Se debe ingresar el nombre del cliente";
	private static final String SE_DEBE_INGRESAR_LA_CEDULA_DEL_CLIENTE = "Se debe ingresar la cedula del cliente";
	private static final String SE_DEBE_INGRESAR_EL_GENERO_DEL_CLIENTE = "Se debe ingresar el genero del cliente";
	private static final String SE_DEBE_INGRESAR_LA_FECHA_DE_NACIMIENTO_DEL_CLIENTE = "Se debe ingresar la fecha de nacimiento del cliente";
	
	private Long id;
    private String nombre;
    private String cedula;
    private String genero;
    private LocalDateTime fechaNacimiento;

    public Cliente(Long id,String nombre, String cedula,String genero, LocalDateTime fechaCreacion) {
        validarObligatorio(nombre, SE_DEBE_INGRESAR_EL_NOMBRE_DEL_CLIENTE);
        validarObligatorio(cedula, SE_DEBE_INGRESAR_LA_CEDULA_DEL_CLIENTE);
        validarObligatorio(genero, SE_DEBE_INGRESAR_EL_GENERO_DEL_CLIENTE);        
        validarObligatorio(fechaCreacion, SE_DEBE_INGRESAR_LA_FECHA_DE_NACIMIENTO_DEL_CLIENTE);

        this.id = id;
        this.nombre = nombre;
        this.cedula = cedula;
        this.genero = genero;
        this.fechaNacimiento = fechaCreacion;
        
    }
}
