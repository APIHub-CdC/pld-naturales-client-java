package io.PLDNaturales.client.api;

import io.PLDNaturales.client.ApiException;
import io.PLDNaturales.client.model.Peticion;
import io.PLDNaturales.client.model.Respuesta;
import io.PLDNaturales.client.ApiClient;
import io.PLDNaturales.client.api.PldNaturalesApi;
import io.PLDNaturales.interceptor.SignerInterceptor;
import okhttp3.OkHttpClient;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.junit.Assert;
import org.junit.Before;

import java.util.concurrent.TimeUnit;

public class ApiTest {

	private Logger logger = LoggerFactory.getLogger(ApiTest.class.getName());

    private final PldNaturalesApi api = new PldNaturalesApi();
    private final SignerInterceptor interceptor = new SignerInterceptor();
	private ApiClient apiClient = null;

	@Before()
	public void setUp() {
		
		this.apiClient = api.getApiClient();
		this.apiClient.setBasePath("the_url");
    	OkHttpClient insecureClient = ApiClient.getClientNoSSLVerification();
    	OkHttpClient okHttpClient = insecureClient.newBuilder()
    			.readTimeout(60, TimeUnit.SECONDS)
    			.addInterceptor(interceptor)
    			.build();
    	apiClient.setHttpClient(okHttpClient);
	}

    @Test
    public void getReporteTest() throws ApiException {
		String xApiKey = "your_api_key";
		String username = "your_username";
		String password = "your_password";

        Peticion persona = new Peticion();
        
        persona.setFolioOtorgante("123456789");
        persona.setTipoDocumento("1");
        persona.setNumeroDocumento("00000088");
        persona.setNombre("NOMBRE");
        persona.setSegundoNombre("SEGUNDONOMBRE");
        persona.setApellidoPaterno("PATERNO");
        persona.setApellidoMaterno("MATERNO");
        
		try {
	        Respuesta response = api.pld(xApiKey, username, password, persona);
	        Assert.assertTrue(response != null);
	        if(response != null) {
	        	logger.info(response.toString());
	        }
		} catch (ApiException e) {
			logger.info(e.getResponseBody());
		}
    }
    
}