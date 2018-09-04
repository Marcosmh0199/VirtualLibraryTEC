package Proyecto1;

import java.io.*;

public class Libro {
	String Issn, Nombre, Tema, Descripcion;
	int CantidadVendida, CantidadDisponible, Precio;
	File FotoLibro;
	
	public Libro(String pIssn,String pNombre,String pTema,String pDescripcion, int pCantidadVendida,int pCantidadDisponible, int pPrecio, File pFotoLibro) {
		Issn = pIssn;
		Nombre = pNombre;
		Tema = pTema;
		Descripcion = pDescripcion;
		CantidadVendida = pCantidadVendida;
		CantidadDisponible = pCantidadDisponible;
		Precio = pPrecio;
		FotoLibro = pFotoLibro;
	}
	public Libro() {
		
	}
	public void setIssn(String pIssn) {
		Issn = pIssn;
	}
	public void setNombre(String pNombre) {
		Nombre = pNombre;
	}
	public void setTema(String pTema) {
		Tema = pTema;
	}
	public void setDescripcion(String pDescripcion) {
		Descripcion = pDescripcion;
	}
	public void setCantidadVendida(int pCantidadVendida) {
		CantidadVendida = pCantidadVendida;
	}
	public void setCantidadDisponible(int pCantidadDisponible) {
		CantidadDisponible = pCantidadDisponible;
	}
	public void setPrecio(int pPrecio) {
		Precio = pPrecio;
	}
	public void setFotoLibro(File pFotoLibro) {
		FotoLibro = pFotoLibro;
	}
	public String getIssn() {
		return Issn;
	}
	public String getNombre() {
		return Nombre;
	}
	public String getTema() {
		return Tema;
	}
	public String getDescripcion() {
		return Descripcion;
	}
	public int getCantidadVendida() {
		return CantidadVendida;
	}
	public int getCantidadDisponible() {
		return CantidadDisponible;
	}
	public int getPrecio() {
		return Precio;
	}
	public File getFotoLibro() {
		return FotoLibro;
	}
}
