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
  @SerializedName("porcentaje")
  private String porcentaje = null;
  @SerializedName("idPersona")
  private String idPersona = null;
  @SerializedName("nombreCompleto")
  private String nombreCompleto = null;
  @SerializedName("lista")
  private String lista = null;
  @SerializedName("estatus")
  private String estatus = null;
  @SerializedName("cargoPuesto")
  private String cargoPuesto = null;
  @SerializedName("entidad")
  private String entidad = null;
  @SerializedName("dependencia")
  private String dependencia = null;
  @SerializedName("fecNacimiento")
  private String fecNacimiento = null;
  @SerializedName("rfc")
  private String rfc = null;
  @SerializedName("sexo")
  private String sexo = null;
  @SerializedName("curp")
  private String curp = null;
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
  
  @JsonAdapter(OrdenEnum.Adapter.class)
  public enum OrdenEnum {
    _0("0"),
    
    _1("1");
    private String value;
    OrdenEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }
    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static OrdenEnum fromValue(String text) {
      for (OrdenEnum b : OrdenEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<OrdenEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final OrdenEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }
      @Override
      public OrdenEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return OrdenEnum.fromValue(String.valueOf(value));
      }
    }
  }
  @SerializedName("orden")
  private OrdenEnum orden = null;
  public Persona porcentaje(String porcentaje) {
    this.porcentaje = porcentaje;
    return this;
  }
   
  @ApiModelProperty(example = "100", value = "Nivel de coincidencia entre los parámetros de entrada y los resultados obtenidos.")
  public String getPorcentaje() {
    return porcentaje;
  }
  public void setPorcentaje(String porcentaje) {
    this.porcentaje = porcentaje;
  }
  public Persona idPersona(String idPersona) {
    this.idPersona = idPersona;
    return this;
  }
   
  @ApiModelProperty(example = "100000003945001", value = "Número asignado a la consulta para cada persona")
  public String getIdPersona() {
    return idPersona;
  }
  public void setIdPersona(String idPersona) {
    this.idPersona = idPersona;
  }
  public Persona nombreCompleto(String nombreCompleto) {
    this.nombreCompleto = nombreCompleto;
    return this;
  }
   
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
  public Persona estatus(String estatus) {
    this.estatus = estatus;
    return this;
  }
   
  @ApiModelProperty(example = "INDEFINIDO", value = "Estatús de la persona en la lista")
  public String getEstatus() {
    return estatus;
  }
  public void setEstatus(String estatus) {
    this.estatus = estatus;
  }
  public Persona cargoPuesto(String cargoPuesto) {
    this.cargoPuesto = cargoPuesto;
    return this;
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
  public Persona dependencia(String dependencia) {
    this.dependencia = dependencia;
    return this;
  }
   
  @ApiModelProperty(example = "INDEFINIDO", value = "Dependencia de acuerdo al listado")
  public String getDependencia() {
    return dependencia;
  }
  public void setDependencia(String dependencia) {
    this.dependencia = dependencia;
  }
  public Persona fecNacimiento(String fecNacimiento) {
    this.fecNacimiento = fecNacimiento;
    return this;
  }
   
  @ApiModelProperty(example = "19/06/2018", value = "Fecha de nacimiento de la persona")
  public String getFecNacimiento() {
    return fecNacimiento;
  }
  public void setFecNacimiento(String fecNacimiento) {
    this.fecNacimiento = fecNacimiento;
  }
  public Persona rfc(String rfc) {
    this.rfc = rfc;
    return this;
  }
   
  @ApiModelProperty(example = "INDEFINIDO", value = "NA")
  public String getRfc() {
    return rfc;
  }
  public void setRfc(String rfc) {
    this.rfc = rfc;
  }
  public Persona sexo(String sexo) {
    this.sexo = sexo;
    return this;
  }
   
  @ApiModelProperty(example = "INDEFINIDO", value = "sexo de la persona")
  public String getSexo() {
    return sexo;
  }
  public void setSexo(String sexo) {
    this.sexo = sexo;
  }
  public Persona curp(String curp) {
    this.curp = curp;
    return this;
  }
   
  @ApiModelProperty(example = "INDEFINIDO", value = "NA")
  public String getCurp() {
    return curp;
  }
  public void setCurp(String curp) {
    this.curp = curp;
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
  public Persona orden(OrdenEnum orden) {
    this.orden = orden;
    return this;
  }
   
  @ApiModelProperty(example = "1", value = "Estatus de la persona en la lista. <br> 1 - Activo <br> 0 - Inactivo ")
  public OrdenEnum getOrden() {
    return orden;
  }
  public void setOrden(OrdenEnum orden) {
    this.orden = orden;
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
    return Objects.equals(this.porcentaje, persona.porcentaje) &&
        Objects.equals(this.idPersona, persona.idPersona) &&
        Objects.equals(this.nombreCompleto, persona.nombreCompleto) &&
        Objects.equals(this.lista, persona.lista) &&
        Objects.equals(this.estatus, persona.estatus) &&
        Objects.equals(this.cargoPuesto, persona.cargoPuesto) &&
        Objects.equals(this.entidad, persona.entidad) &&
        Objects.equals(this.dependencia, persona.dependencia) &&
        Objects.equals(this.fecNacimiento, persona.fecNacimiento) &&
        Objects.equals(this.rfc, persona.rfc) &&
        Objects.equals(this.sexo, persona.sexo) &&
        Objects.equals(this.curp, persona.curp) &&
        Objects.equals(this.tipoDocumento, persona.tipoDocumento) &&
        Objects.equals(this.numeroDocumento, persona.numeroDocumento) &&
        Objects.equals(this.ubicacion, persona.ubicacion) &&
        Objects.equals(this.fechaInicio, persona.fechaInicio) &&
        Objects.equals(this.fechaFin, persona.fechaFin) &&
        Objects.equals(this.orden, persona.orden);
  }
  @Override
  public int hashCode() {
    return Objects.hash(porcentaje, idPersona, nombreCompleto, lista, estatus, cargoPuesto, entidad, dependencia, fecNacimiento, rfc, sexo, curp, tipoDocumento, numeroDocumento, ubicacion, fechaInicio, fechaFin, orden);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Persona {\n");
    
    sb.append("    porcentaje: ").append(toIndentedString(porcentaje)).append("\n");
    sb.append("    idPersona: ").append(toIndentedString(idPersona)).append("\n");
    sb.append("    nombreCompleto: ").append(toIndentedString(nombreCompleto)).append("\n");
    sb.append("    lista: ").append(toIndentedString(lista)).append("\n");
    sb.append("    estatus: ").append(toIndentedString(estatus)).append("\n");
    sb.append("    cargoPuesto: ").append(toIndentedString(cargoPuesto)).append("\n");
    sb.append("    entidad: ").append(toIndentedString(entidad)).append("\n");
    sb.append("    dependencia: ").append(toIndentedString(dependencia)).append("\n");
    sb.append("    fecNacimiento: ").append(toIndentedString(fecNacimiento)).append("\n");
    sb.append("    rfc: ").append(toIndentedString(rfc)).append("\n");
    sb.append("    sexo: ").append(toIndentedString(sexo)).append("\n");
    sb.append("    curp: ").append(toIndentedString(curp)).append("\n");
    sb.append("    tipoDocumento: ").append(toIndentedString(tipoDocumento)).append("\n");
    sb.append("    numeroDocumento: ").append(toIndentedString(numeroDocumento)).append("\n");
    sb.append("    ubicacion: ").append(toIndentedString(ubicacion)).append("\n");
    sb.append("    fechaInicio: ").append(toIndentedString(fechaInicio)).append("\n");
    sb.append("    fechaFin: ").append(toIndentedString(fechaFin)).append("\n");
    sb.append("    orden: ").append(toIndentedString(orden)).append("\n");
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
