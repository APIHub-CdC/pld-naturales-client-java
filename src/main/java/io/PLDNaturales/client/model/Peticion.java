package io.PLDNaturales.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;

public class Peticion {
  @SerializedName("folio")
  private String folio = null;
  @SerializedName("tipoDocumento")
  private String tipoDocumento = null;
  @SerializedName("numeroDocumento")
  private String numeroDocumento = null;
  @SerializedName("nombre")
  private String nombre = null;
  @SerializedName("segundoNombre")
  private String segundoNombre = null;
  @SerializedName("apellidoPaterno")
  private String apellidoPaterno = null;
  @SerializedName("apellidoMaterno")
  private String apellidoMaterno = null;

  public Peticion folio(String folio) {
    this.folio = folio;
    return this;
  }
   
  @ApiModelProperty(example = "000012", value = "Folio.")
  public String getFolio() {
    return folio;
  }
  public void setFolio(String folio) {
    this.folio = folio;
  }
  public Peticion tipoDocumento(String tipoDocumento) {
    this.tipoDocumento = tipoDocumento;
    return this;
  }
   
  @ApiModelProperty(example = "00003", required = true, value = "<table><thead><tr>Tipo de documento que corresponde al número de documento que se quiere consultar</tr><tr><th>Tipo documento</th><th>Descripción</th></tr></thead><tbody><tr><td>1</td><td>DNI</td></tr><tr><td>2</td><td>Carnet de extranjería</td></tr><tr><td>10</td><td>RUC</td></tr></tbody></table>")
  public String getTipoDocumento() {
    return tipoDocumento;
  }
  public void setTipoDocumento(String tipoDocumento) {
    this.tipoDocumento = tipoDocumento;
  }
  public Peticion numeroDocumento(String numeroDocumento) {
    this.numeroDocumento = numeroDocumento;
    return this;
  }
   
  @ApiModelProperty(example = "67544489", required = true, value = "Numero de documento de la persona que se quiera evaluar")
  public String getNumeroDocumento() {
    return numeroDocumento;
  }
  public void setNumeroDocumento(String numeroDocumento) {
    this.numeroDocumento = numeroDocumento;
  }
  public Peticion nombre(String nombre) {
    this.nombre = nombre;
    return this;
  }
   
  @ApiModelProperty(example = "MARCOS", required = true, value = "Nombre de la persona que se quiera consultar")
  public String getNombre() {
    return nombre;
  }
  public void setNombre(String nombre) {
    this.nombre = nombre;
  }
  public Peticion segundoNombre(String segundoNombre) {
    this.segundoNombre = segundoNombre;
    return this;
  }
   
  @ApiModelProperty(example = "ANTONIO", value = "Segundo nombre, si es que existe, de la persona que se quiera consultar")
  public String getSegundoNombre() {
    return segundoNombre;
  }
  public void setSegundoNombre(String segundoNombre) {
    this.segundoNombre = segundoNombre;
  }
  public Peticion apellidoPaterno(String apellidoPaterno) {
    this.apellidoPaterno = apellidoPaterno;
    return this;
  }
   
  @ApiModelProperty(example = "DIAZ", required = true, value = "Apellido paterno de la persona que se quiera consultar")
  public String getApellidoPaterno() {
    return apellidoPaterno;
  }
  public void setApellidoPaterno(String apellidoPaterno) {
    this.apellidoPaterno = apellidoPaterno;
  }
  public Peticion apellidoMaterno(String apellidoMaterno) {
    this.apellidoMaterno = apellidoMaterno;
    return this;
  }
   
  @ApiModelProperty(example = "HERNANDEZ", value = "Apellido materno de la persona que se quiera consultar")
  public String getApellidoMaterno() {
    return apellidoMaterno;
  }
  public void setApellidoMaterno(String apellidoMaterno) {
    this.apellidoMaterno = apellidoMaterno;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Peticion peticion = (Peticion) o;
    return Objects.equals(this.folio, peticion.folio) &&
        Objects.equals(this.tipoDocumento, peticion.tipoDocumento) &&
        Objects.equals(this.numeroDocumento, peticion.numeroDocumento) &&
        Objects.equals(this.nombre, peticion.nombre) &&
        Objects.equals(this.segundoNombre, peticion.segundoNombre) &&
        Objects.equals(this.apellidoPaterno, peticion.apellidoPaterno) &&
        Objects.equals(this.apellidoMaterno, peticion.apellidoMaterno);
  }
  @Override
  public int hashCode() {
    return Objects.hash(folio, tipoDocumento, numeroDocumento, nombre, segundoNombre, apellidoPaterno, apellidoMaterno);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Peticion {\n");
    
    sb.append("    folio: ").append(toIndentedString(folio)).append("\n");
    sb.append("    tipoDocumento: ").append(toIndentedString(tipoDocumento)).append("\n");
    sb.append("    numeroDocumento: ").append(toIndentedString(numeroDocumento)).append("\n");
    sb.append("    nombre: ").append(toIndentedString(nombre)).append("\n");
    sb.append("    segundoNombre: ").append(toIndentedString(segundoNombre)).append("\n");
    sb.append("    apellidoPaterno: ").append(toIndentedString(apellidoPaterno)).append("\n");
    sb.append("    apellidoMaterno: ").append(toIndentedString(apellidoMaterno)).append("\n");
    sb.append("}");
    return sb.toString();
  }
  
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
