package jp.sou4j.jaran.jws;

import java.io.IOException;
import java.net.URISyntaxException;

import org.apache.http.HttpStatus;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import jp.sou4j.util.StringUtils;

/**
 * <p>じゃらん宿表示APIのクライアントクラスです。</p>
 * @author OSCA
 * @since 0.1.0
 */
public class HotelSearch {

	/**
	 * <p>宿表示APIでの検索を実行し、検索結果を返却します。</p>
	 * @param request
	 * @return 検索結果
	 * @throws JWSException
	 */
	public HotelSearchResult search(HotelSearchRequest request) throws JWSException {
		try( CloseableHttpClient httpClient = HttpClients.createDefault(); ) {
			URIBuilder uriBuilder = new URIBuilder().setScheme("http").setHost("jws.jalan.net").setPath("/APILite/HotelSearch/V1/");
			if(!StringUtils.isNullOrEmpty(request.getKey())  ) uriBuilder.addParameter("key",    request.getKey()) ;
			if(!StringUtils.isNullOrEmpty(request.getPref()) ) uriBuilder.addParameter("pref",   request.getPref()) ;
			if(!StringUtils.isNullOrEmpty(request.getLArea())) uriBuilder.addParameter("l_area", request.getLArea()) ;
			if(!StringUtils.isNullOrEmpty(request.getSArea())) uriBuilder.addParameter("s_area", request.getSArea()) ;
			if(!StringUtils.isNullOrEmpty(request.gethId())  ) uriBuilder.addParameter("h_id",   request.gethId()) ;
			if(request.getHType()    != null) uriBuilder.addParameter("h_type",    request.getHType().toString());
			if(request.getOPool()    != null) uriBuilder.addParameter("o_pool",    request.getOPool().toString());
			if(request.getParking()  != null) uriBuilder.addParameter("parking",   request.getParking().toString());
			if(request.getPubBath()  != null) uriBuilder.addParameter("pub_bath",  request.getPubBath().toString());
			if(request.getOnsen()    != null) uriBuilder.addParameter("onsen",     request.getOnsen().toString());
			if(request.getPrvBath()  != null) uriBuilder.addParameter("prv_bath",  request.getPrvBath().toString());
			if(request.getVBath()    != null) uriBuilder.addParameter("v_bath",    request.getVBath().toString());
			if(request.getSauna()    != null) uriBuilder.addParameter("sauna",     request.getSauna().toString());
			if(request.getJacz()     != null) uriBuilder.addParameter("jacz",      request.getJacz().toString());
			if(request.getMssg()     != null) uriBuilder.addParameter("mssg",      request.getMssg().toString());
			if(request.getRSki()     != null) uriBuilder.addParameter("r_ski",     request.getRSki().toString());
			if(request.getRBrd()     != null) uriBuilder.addParameter("r_brd",     request.getRBrd().toString());
			if(request.getPet()      != null) uriBuilder.addParameter("pet",       request.getPet().toString());
			if(request.getEsthe()    != null) uriBuilder.addParameter("esthe",     request.getEsthe().toString());
			if(request.getPPong()    != null) uriBuilder.addParameter("p_pong",    request.getPPong().toString());
			if(request.getLimo()     != null) uriBuilder.addParameter("limo",      request.getLimo().toString());
			if(request.getLateOut()  != null) uriBuilder.addParameter("late_out",  request.getLateOut().toString());
			if(request.getPictSize() != null) uriBuilder.addParameter("pict_size", request.getPictSize().toString());
			if(request.getOrder()    != null) uriBuilder.addParameter("order",     request.getOrder().toString());
			if(request.getStart()    != null) uriBuilder.addParameter("start",     request.getStart().toString());
			if(request.getCount()    != null) uriBuilder.addParameter("count",     request.getCount().toString());

			HttpGet httpGet = new HttpGet(uriBuilder.build().toString());
			try ( CloseableHttpResponse httpResponse = httpClient.execute(httpGet); ) {
				String xml = EntityUtils.toString(httpResponse.getEntity());
				int statusCode = httpResponse.getStatusLine().getStatusCode();
				if( statusCode == HttpStatus.SC_OK ) {
					return new XmlMapper().readValue(xml, HotelSearchResult.class);
				}
				else {
					JWSException exception = new XmlMapper().readValue(xml, JWSException.class);
					exception.setStatusCode(statusCode);
					throw exception;
				}
			}
		}
		catch(IOException | URISyntaxException e) {
			throw new JWSException(e.getMessage(), e);
		}
	}
}
