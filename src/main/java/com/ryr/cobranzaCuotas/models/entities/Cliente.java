package com.ryr.cobranzaCuotas.models.entities;

import java.util.Date;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Clientes")
public class Cliente {

	@Id
	private ObjectId IdCliente;
	
	private Long CliCodigo;
	
	private String CliRazonSocial;
	
	private String CliTipoDoc; 
	
	private String CliNumDoc;
	
	private int IvaCodigo;
	
	private String CliDireccion;
	
	private String CliLocalidad;
	
	private String CliProvincia;
	
	private String CliCPostal;
	
	private String CliTelefono;
	
	private String CliEmail;
	
	private int CliEstado;
	
	private String CliObservaciones;
	
	private Date CliFechaAlta;
	
	private double CliMontoDisponible;
	
	private String CliTipoCliente;
	
	private int CliActualiza;
	
	private int CliCtaDias;
	
	private int VendCodigo;
	
	private int cli_recargas;
	
	private int cli_recargas_toner;
	
	private int idtransporte;

	public ObjectId getIdCliente() {
		return IdCliente;
	}

	public void setIdCliente(ObjectId idCliente) {
		IdCliente = idCliente;
	}

	public Long getCliCodigo() {
		return CliCodigo;
	}

	public void setCliCodigo(Long cliCodigo) {
		CliCodigo = cliCodigo;
	}

	public String getCliRazonSocial() {
		return CliRazonSocial;
	}

	public void setCliRazonSocial(String cliRazonSocial) {
		CliRazonSocial = cliRazonSocial;
	}

	public String getCliTipoDoc() {
		return CliTipoDoc;
	}

	public void setCliTipoDoc(String cliTipoDoc) {
		CliTipoDoc = cliTipoDoc;
	}

	public String getCliNumDoc() {
		return CliNumDoc;
	}

	public void setCliNumDoc(String cliNumDoc) {
		CliNumDoc = cliNumDoc;
	}

	public int getIvaCodigo() {
		return IvaCodigo;
	}

	public void setIvaCodigo(int ivaCodigo) {
		IvaCodigo = ivaCodigo;
	}

	public String getCliDireccion() {
		return CliDireccion;
	}

	public void setCliDireccion(String cliDireccion) {
		CliDireccion = cliDireccion;
	}

	public String getCliLocalidad() {
		return CliLocalidad;
	}

	public void setCliLocalidad(String cliLocalidad) {
		CliLocalidad = cliLocalidad;
	}

	public String getCliProvincia() {
		return CliProvincia;
	}

	public void setCliProvincia(String cliProvincia) {
		CliProvincia = cliProvincia;
	}

	public String getCliCPostal() {
		return CliCPostal;
	}

	public void setCliCPostal(String cliCPostal) {
		CliCPostal = cliCPostal;
	}

	public String getCliTelefono() {
		return CliTelefono;
	}

	public void setCliTelefono(String cliTelefono) {
		CliTelefono = cliTelefono;
	}

	public String getCliEmail() {
		return CliEmail;
	}

	public void setCliEmail(String cliEmail) {
		CliEmail = cliEmail;
	}

	public int getCliEstado() {
		return CliEstado;
	}

	public void setCliEstado(int cliEstado) {
		CliEstado = cliEstado;
	}

	public String getCliObservaciones() {
		return CliObservaciones;
	}

	public void setCliObservaciones(String cliObservaciones) {
		CliObservaciones = cliObservaciones;
	}

	public Date getCliFechaAlta() {
		return CliFechaAlta;
	}

	public void setCliFechaAlta(Date cliFechaAlta) {
		CliFechaAlta = cliFechaAlta;
	}

	public double getCliMontoDisponible() {
		return CliMontoDisponible;
	}

	public void setCliMontoDisponible(double cliMontoDisponible) {
		CliMontoDisponible = cliMontoDisponible;
	}

	public String getCliTipoCliente() {
		return CliTipoCliente;
	}

	public void setCliTipoCliente(String cliTipoCliente) {
		CliTipoCliente = cliTipoCliente;
	}

	public int getCliActualiza() {
		return CliActualiza;
	}

	public void setCliActualiza(int cliActualiza) {
		CliActualiza = cliActualiza;
	}

	public int getCliCtaDias() {
		return CliCtaDias;
	}

	public void setCliCtaDias(int cliCtaDias) {
		CliCtaDias = cliCtaDias;
	}

	public int getVendCodigo() {
		return VendCodigo;
	}

	public void setVendCodigo(int vendCodigo) {
		VendCodigo = vendCodigo;
	}

	public int getCli_recargas() {
		return cli_recargas;
	}

	public void setCli_recargas(int cli_recargas) {
		this.cli_recargas = cli_recargas;
	}

	public int getCli_recargas_toner() {
		return cli_recargas_toner;
	}

	public void setCli_recargas_toner(int cli_recargas_toner) {
		this.cli_recargas_toner = cli_recargas_toner;
	}

	public int getIdtransporte() {
		return idtransporte;
	}

	public void setIdtransporte(int idtransporte) {
		this.idtransporte = idtransporte;
	}
	
}