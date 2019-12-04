package io.PLDNaturales.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import io.PLDNaturales.client.model.Persona;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


public class Respuesta {
  @SerializedName("folioConsultaOtorgante")
  private String folioConsultaOtorgante = null;
  @SerializedName("numConsulta")
  private BigDecimal numConsulta = null;
  @SerializedName("personas")
  private List<Persona> personas = null;
  public Respuesta folioConsultaOtorgante(String folioConsultaOtorgante) {
    this.folioConsultaOtorgante = folioConsultaOtorgante;
    return this;
  }
   
  @ApiModelProperty(example = "123456789", value = "Es el identificador de la consulta realizada por parte del otorgante. Este folio se regresa de manera integra en el elemento respuesta.")
  public String getFolioConsultaOtorgante() {
    return folioConsultaOtorgante;
  }
  public void setFolioConsultaOtorgante(String folioConsultaOtorgante) {
    this.folioConsultaOtorgante = folioConsultaOtorgante;
  }
  public Respuesta numConsulta(BigDecimal numConsulta) {
    this.numConsulta = numConsulta;
    return this;
  }
   
  @ApiModelProperty(example = "123.0", value = "Número de consulta")
  public BigDecimal getNumConsulta() {
    return numConsulta;
  }
  public void setNumConsulta(BigDecimal numConsulta) {
    this.numConsulta = numConsulta;
  }
  public Respuesta personas(List<Persona> personas) {
    this.personas = personas;
    return this;
  }
  public Respuesta addPersonasItem(Persona personasItem) {
    if (this.personas == null) {
      this.personas = new ArrayList<Persona>();
    }
    this.personas.add(personasItem);
    return this;
  }
   
  @ApiModelProperty(value = "")
  public List<Persona> getPersonas() {
    return personas;
  }
  public void setPersonas(List<Persona> personas) {
    this.personas = personas;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Respuesta respuesta = (Respuesta) o;
    return Objects.equals(this.folioConsultaOtorgante, respuesta.folioConsultaOtorgante) &&
        Objects.equals(this.numConsulta, respuesta.numConsulta) &&
        Objects.equals(this.personas, respuesta.personas);
  }
  @Override
  public int hashCode() {
    return Objects.hash(folioConsultaOtorgante, numConsulta, personas);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Respuesta {\n");
    
    sb.append("    folioConsultaOtorgante: ").append(toIndentedString(folioConsultaOtorgante)).append("\n");
    sb.append("    numConsulta: ").append(toIndentedString(numConsulta)).append("\n");
    sb.append("    personas: ").append(toIndentedString(personas)).append("\n");
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
