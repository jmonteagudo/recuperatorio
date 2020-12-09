package ar.edu.unlam.pb2.eva03;

import static org.junit.Assert.*;

import org.junit.Test;

public class Recuperatorio {

	@Test
	public void queSePuedaCrearUnObjetoVolador() {
		Vehiculo avion = new Volador();
	
		assertEquals(0.0, avion.getAltura());
	}
	
	@Test
	public void queSePuedaCrearUnObjetoTerrestre() {
		Vehiculo tanque = new Terrestre();
	
		assertEquals(0.0, tanque.getVelocidad());
	}
	
	@Test
	public void queSePuedaCrearUnObjetoAcuatico() {
		Vehiculo submarino = new Acuatico();
	
		assertEquals(0.0, submarino.getProfundidad());
	}
	
	@Test
	public void queSePuedaCrearUnObjetoAnfibio() {
		Vehiculo var = new Anfibio();
	
		assertEquals(0.0, var.getVelocidad());
		assertEquals(0.0, var.getProfundidad());
	}
	
	@Test
	public void queSePuedaCrearUnHidroavion() {
		Vehiculo ag600 = new HidroAvion();
	
		assertEquals(0.0, ag600.getAltitud());
		assertEquals(0.0, ag600.getProfundidad());
	}
	
	@Test
	public void queSePuedaArmarElConvoy() {
		FuerzaArmada argentina = new FuerzaArmada();
	
		argentina.agregarVehiculo(new Avion("0001", "A-10"));
		argentina.agregarVehiculo(new Avion("0002", "A-10"));
		argentina.agregarVehiculo(new Avion("0003", "F-102"));
		argentina.agregarVehiculo(new Avion("0004", "F-15"));
		argentina.agregarVehiculo(new Tanque("0005", "Renault FT"));
		argentina.agregarVehiculo(new Camion("0006", "T-72"));
		argentina.agregarVehiculo(new Camion("0007", "T-72"));
		argentina.agregarVehiculo(new Submarino("0008", "A-10"));
		argentina.agregarVehiculo(new Portaviones("0009", "A-10"));
		argentina.agregarVehiculo(new Destructor("0010", "A-10"));
		argentina.agregarVehiculo(new Destructor("0011", "A-10"));
		argentina.agregarVehiculo(new Hidroavion("0012", "A-10"));
		argentina.agregarVehiculo(new Anfibio("0012", "A-10"));
		
		assertEquals(12, argentina.getCapacidadDeDefensa());
	}
	
	@Test
	public void queSePuedaCrearUnaBatalla() {
		FuerzaArmada argentina = new FuerzaArmada();
		
		argentina.crearBatalla("San Lorenzo", TipoDeBatalla.TERRESTRE, 100.5, 20.3)
		
		assertEquals(100.5, argentina.getBatalla("San Lorenzo").getLatitud());
		assertEquals(20.3, argentina.getBatalla("San Lorenzo").getLongitud());

	}
	
	
	@Test
	public void queSePuedaPlanearLaBatallaSobreElOceano() {
		FuerzaArmada argentina = new FuerzaArmada();
	
		argentina.agregarVehiculo(new Avion("0001", "A-10"));
		argentina.agregarVehiculo(new Avion("0002", "A-10"));
		argentina.agregarVehiculo(new Avion("0003", "F-102"));
		argentina.agregarVehiculo(new Avion("0004", "F-15"));
		argentina.agregarVehiculo(new Tanque("0005", "Renault FT"));
		argentina.agregarVehiculo(new Camion("0006", "T-72"));
		argentina.agregarVehiculo(new Camion("0007", "T-72"));
		argentina.agregarVehiculo(new Submarino("0008", "A-10"));
		argentina.agregarVehiculo(new Portaviones("0009", "A-10"));
		argentina.agregarVehiculo(new Destructor("0010", "A-10"));
		argentina.agregarVehiculo(new Destructor("0011", "A-10"));
		argentina.agregarVehiculo(new Hidroavion("0012", "A-10"));
		argentina.agregarVehiculo(new Anfibio("0012", "A-10"));
		
		argentina.crearBatalla("Terrestre", 100.5, 20.3, "San Lorenzo")
		
		argentina.presentarBatalla()
		
		assertEquals(12, argentina.getCapacidadDeDefensa());
	}

}
