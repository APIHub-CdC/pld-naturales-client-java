package io.PLDNaturales.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;


public class Persona {
  @SerializedName("nombreCompleto")
  private String nombreCompleto = null;
  @SerializedName("lista")
  private String lista = null;
  @SerializedName("cargoPuesto")
  private String cargoPuesto = null;
  @SerializedName("entidad")
  private String entidad = null;
  @SerializedName("tipoDocumento")
  private String tipoDocumento = null;
  @SerializedName("numeroDocumento")
  private String numeroDocumento = null;
  @SerializedName("ubicacion")
  private String ubicacion = null;
  @SerializedName("fechaInicio")
  private String fechaInicio = null;
  @SerializedName("fechaFin")
  private String fechaFin = null;
  @SerializedName("resolucionNombramiento")
  private String resolucionNombramiento = null;


   
  @ApiModelProperty(example = "MARIA DE GUADALUPE SANCHEZ MATHEWS", value = "Nombre completo de la persona que se obtuvo de la consulta")
  public String getNombreCompleto() {
    return nombreCompleto;
  }
  public void setNombreCompleto(String nombreCompleto) {
    this.nombreCompleto = nombreCompleto;
  }
  public Persona lista(String lista) {
    this.lista = lista;
    return this;
  }
   
  @ApiModelProperty(example = "PEP", value = "<table><thead><tr>Listado donde se encontro la persona</tr><tr><th>Lista</th><th>Descripción</th></tr></thead><tbody><tr><td>PEP</td><td>Personas Políticamente Expuestas y Consanguíneos</td></tr><tr><td>PEPINT</td><td>PEPs Internacionales</td></tr><tr><td>OFAC</td><td>OFAC Consolidated List</td></tr><tr><td>OFAC</td><td>OFAC Specially Designated Nationals</td></tr><tr><td>OSFI</td><td>OSFI Sanctions</td></tr><tr><td>OSFI</td><td>OSFI Terrorist Names and Organizations</td></tr><tr><td>UNS</td><td>United Nations Sanctions</td></tr><tr><td>INTP</td><td>Interpol - Organización Internacional de Policía Criminal</td></tr><tr><td>GAFI</td><td>Grupo de Acción Financiera Internacional</td></tr><tr><td>OCDE</td><td>Organización para la Cooperación y el Desarrollo Económico</td></tr><tr><td>FBI</td><td>FBI Fugitives</td></tr><tr><td>FBI</td><td>FBI Seeking Information</td></tr><tr><td>DEA</td><td>Drug Enforcement Administration</td></tr><tr><td>ICE</td><td>U.S. Immigration and Customs Enforcement</td></tr><tr><td>BID</td><td>Banco Interamericano de Desarrollo</td></tr><tr><td>USC</td><td>US Dept of Commerce - Unverified</td></tr><tr><td>USS</td><td>US Dept of State - Debarred Parties</td></tr><tr><td>ATF</td><td>Bureau of Alcohol, Tobacco, Firearms and Explosives</td></tr><tr><td>BIS</td><td>Bureau of Industry and Security</td></tr><tr><td>CAR</td><td>Central African Republic</td></tr><tr><td>CBI</td><td>Central Bureau of Investigation</td></tr><tr><td>DFAT</td><td>Department of Foreign Affairs and Trade</td></tr><tr><td>DPRK</td><td>Democratic People's Republic of Korea</td></tr><tr><td>DRC</td><td>Democratic Republic of the Congo</td></tr><tr><td>EPA</td><td>Environmental Protection Agency</td></tr><tr><td>FINCEN</td><td>Financial Crimes Enforcement Network</td></tr><tr><td>PIS</td><td>Postal Inspection Service</td></tr><tr><td>REFIPRE</td><td>Régimen Fiscal Preferente</td></tr><tr><td>ADFAT</td><td>Australia Dept of Foreign Affairs and Trade</td></tr><tr><td>IRAN</td><td>Irán</td></tr><tr><td>IRAQ</td><td>Iraq</td></tr><tr><td>LIBY</td><td>Libia</td></tr><tr><td>GB</td><td>Guinea Bissau</td></tr><tr><td>SOMA</td><td>Somalia</td></tr><tr><td>SUDA</td><td>Sudán</td></tr><tr><td>ONUAQ</td><td>Al Qaeda</td></tr><tr><td>ONUTAL</td><td>Talibán</td></tr><tr><td>SSEU</td><td>Secret Service</td></tr><tr><td>BM</td><td>Banco Mundial</td></tr><tr><td>LMW</td><td>London Most Wanted</td></tr><tr><td>HMT</td><td>Her Majesty's Treasury</td></tr><tr><td>BOE</td><td>Bank of England </td></tr><tr><td>UE</td><td>European Sanction</td></tr></tbody></table>")
  public String getLista() {
    return lista;
  }
  public void setLista(String lista) {
    this.lista = lista;
  }


  @ApiModelProperty(example = "CANDIDATO A REGIDOR DISTRITAL", value = "Cargo o puesto de acuerdo a la lista")
  public String getCargoPuesto() {
    return cargoPuesto;
  }
  public void setCargoPuesto(String cargoPuesto) {
    this.cargoPuesto = cargoPuesto;
  }
  public Persona entidad(String entidad) {
    this.entidad = entidad;
    return this;
  }
   
  @ApiModelProperty(example = "ALIANZA PARA EL PROGRESO", value = "Estado o país de pertenencia de la lista")
  public String getEntidad() {
    return entidad;
  }
  public void setEntidad(String entidad) {
    this.entidad = entidad;
  }



  public Persona tipoDocumento(String tipoDocumento) {
    this.tipoDocumento = tipoDocumento;
    return this;
  }
   
  @ApiModelProperty(example = "DNI", value = "Tipo documento reportado en la lista")
  public String getTipoDocumento() {
    return tipoDocumento;
  }
  public void setTipoDocumento(String tipoDocumento) {
    this.tipoDocumento = tipoDocumento;
  }
  public Persona numeroDocumento(String numeroDocumento) {
    this.numeroDocumento = numeroDocumento;
    return this;
  }
   
  @ApiModelProperty(example = "00003945", value = "Número de documento asociado al tipo documento")
  public String getNumeroDocumento() {
    return numeroDocumento;
  }
  public void setNumeroDocumento(String numeroDocumento) {
    this.numeroDocumento = numeroDocumento;
  }
  public Persona ubicacion(String ubicacion) {
    this.ubicacion = ubicacion;
    return this;
  }
   
  @ApiModelProperty(example = "UCAYALI / CORONEL PORTILLO / MANANTAY", value = "Ligar de registro de la persona en la lista")
  public String getUbicacion() {
    return ubicacion;
  }
  public void setUbicacion(String ubicacion) {
    this.ubicacion = ubicacion;
  }
  public Persona fechaInicio(String fechaInicio) {
    this.fechaInicio = fechaInicio;
    return this;
  }
   
  @ApiModelProperty(example = "19/06/2018", value = "Fecha de inicio del cargo")
  public String getFechaInicio() {
    return fechaInicio;
  }
  public void setFechaInicio(String fechaInicio) {
    this.fechaInicio = fechaInicio;
  }
  public Persona fechaFin(String fechaFin) {
    this.fechaFin = fechaFin;
    return this;
  }
   
  @ApiModelProperty(example = "07/10/2018", value = "Fecha de finalización del cargo")
  public String getFechaFin() {
    return fechaFin;
  }
  public void setFechaFin(String fechaFin) {
    this.fechaFin = fechaFin;
  }


  public Persona resolucionNombramiento(String resolucionNombramiento) {
    this.resolucionNombramiento = resolucionNombramiento;
    return this;
  }

  /**
   * Resolución de nombramiento
   * @return resolucionNombramiento
   **/
  @ApiModelProperty(example = "RESOLUCIÓN SUPREMA N° 201-2019-DE", value = "Resolución de nombramiento")
  public String getResolucionNombramiento() {
    return resolucionNombramiento;
  }

  public void setResolucionNombramiento(String resolucionNombramiento) {
    this.resolucionNombramiento = resolucionNombramiento;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Persona persona = (Persona) o;
    return
        Objects.equals(this.nombreCompleto, persona.nombreCompleto) &&
        Objects.equals(this.lista, persona.lista) &&
        Objects.equals(this.cargoPuesto, persona.cargoPuesto) &&
        Objects.equals(this.entidad, persona.entidad) &&
        Objects.equals(this.tipoDocumento, persona.tipoDocumento) &&
        Objects.equals(this.numeroDocumento, persona.numeroDocumento) &&
        Objects.equals(this.ubicacion, persona.ubicacion) &&
        Objects.equals(this.fechaInicio, persona.fechaInicio) &&
        Objects.equals(this.fechaFin, persona.fechaFin)&&
        Objects.equals(this.resolucionNombramiento, persona.resolucionNombramiento);
  }
  @Override
  public int hashCode() {
    return Objects.hash(nombreCompleto, lista,  cargoPuesto, entidad,  tipoDocumento, numeroDocumento, ubicacion, fechaInicio, fechaFin, resolucionNombramiento);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Persona {\n");

    sb.append("    nombreCompleto: ").append(toIndentedString(nombreCompleto)).append("\n");
    sb.append("    lista: ").append(toIndentedString(lista)).append("\n");
    sb.append("    cargoPuesto: ").append(toIndentedString(cargoPuesto)).append("\n");
    sb.append("    entidad: ").append(toIndentedString(entidad)).append("\n");
    sb.append("    tipoDocumento: ").append(toIndentedString(tipoDocumento)).append("\n");
    sb.append("    numeroDocumento: ").append(toIndentedString(numeroDocumento)).append("\n");
    sb.append("    ubicacion: ").append(toIndentedString(ubicacion)).append("\n");
    sb.append("    fechaInicio: ").append(toIndentedString(fechaInicio)).append("\n");
    sb.append("    fechaFin: ").append(toIndentedString(fechaFin)).append("\n");
    sb.append("    resolucionNombramiento: ").append(toIndentedString(resolucionNombramiento)).append("\n");
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
