package jp.sou4j.jaran.jws;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlCData;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlText;

public class HotelSearchResult {

	@JsonProperty("NumberOfResults")
	private int numberOfResults;

	@JsonProperty("DisplayPerPage")
	private int displayPerPage;

	@JsonProperty("DisplayFrom")
	private int displayFrom;

	@JsonProperty("APIVersion")
	private String apiVersion;

	@JacksonXmlElementWrapper(useWrapping=false)
	@JacksonXmlProperty(localName="Hotel")
	private List<Hotel> hotels;

	public int getNumberOfResults() {
		return numberOfResults;
	}

	public void setNumberOfResults(int numberOfResults) {
		this.numberOfResults = numberOfResults;
	}

	public int getDisplayPerPage() {
		return displayPerPage;
	}

	public void setDisplayPerPage(int displayPerPage) {
		this.displayPerPage = displayPerPage;
	}

	public int getDisplayFrom() {
		return displayFrom;
	}

	public void setDisplayFrom(int displayFrom) {
		this.displayFrom = displayFrom;
	}

	public String getApiVersion() {
		return apiVersion;
	}

	public void setApiVersion(String apiVersion) {
		this.apiVersion = apiVersion;
	}

	public List<Hotel> getHotels() {
		return hotels;
	}

	public void setHotels(List<Hotel> hotels) {
		this.hotels = hotels;
	}

	public static class Hotel {

		@JsonProperty("HotelID")
		private String hotelId;

		@JsonProperty("HotelName")
		private String hotelName;

		@JsonProperty("PostCode")
		private String postCode;

		@JsonProperty("HotelAddress")
		private String hotelAddress;

		@JsonProperty("Area")
		private Area area;

		@JsonProperty("HotelType")
		private String hotelType;

		@JsonProperty("HotelDetailURL")
		private String hotelDetailURL;

		@JsonProperty("HotelCatchCopy")
		private String hotelCatchCopy;

		@JsonProperty("HotelCaption")
		private String hotelCaption;

		@JsonProperty("PictureURL")
		private String pictureURL;

		@JsonProperty("PictureCaption")
		private String pictureCaption;

		@JacksonXmlElementWrapper(useWrapping=false)
		@JacksonXmlProperty(localName="AccessInformation")
		private List<AccessInformation> accessInformations;

		@JsonProperty("CheckInTime")
		private String checkInTime;

		@JsonProperty("CheckOutTime")
		private String checkOutTime;

		@JsonProperty("X")
		private Long x;

		@JsonProperty("Y")
		private Long y;

		@JsonProperty("LastUpdate")
		private LastUpdate lastUpdate;

		@JsonProperty("WifiHikariStation")
		private String wifiHikariStation;

		public String getHotelId() {
			return hotelId;
		}

		public void setHotelId(String hotelId) {
			this.hotelId = hotelId;
		}

		public String getHotelName() {
			return hotelName;
		}

		public void setHotelName(String hotelName) {
			this.hotelName = hotelName;
		}

		public String getPostCode() {
			return postCode;
		}

		public void setPostCode(String postCode) {
			this.postCode = postCode;
		}

		public String getHotelAddress() {
			return hotelAddress;
		}

		public void setHotelAddress(String hotelAddress) {
			this.hotelAddress = hotelAddress;
		}

		public Area getArea() {
			return area;
		}

		public void setArea(Area area) {
			this.area = area;
		}

		public String getHotelType() {
			return hotelType;
		}

		public void setHotelType(String hotelType) {
			this.hotelType = hotelType;
		}

		public String getHotelDetailURL() {
			return hotelDetailURL;
		}

		public void setHotelDetailURL(String hotelDetailURL) {
			this.hotelDetailURL = hotelDetailURL;
		}

		public String getHotelCatchCopy() {
			return hotelCatchCopy;
		}

		public void setHotelCatchCopy(String hotelCatchCopy) {
			this.hotelCatchCopy = hotelCatchCopy;
		}

		public String getHotelCaption() {
			return hotelCaption;
		}

		public void setHotelCaption(String hotelCaption) {
			this.hotelCaption = hotelCaption;
		}

		public String getPictureURL() {
			return pictureURL;
		}

		public void setPictureURL(String pictureURL) {
			this.pictureURL = pictureURL;
		}

		public String getPictureCaption() {
			return pictureCaption;
		}

		public void setPictureCaption(String pictureCaption) {
			this.pictureCaption = pictureCaption;
		}

		public List<AccessInformation> getAccessInformations() {
			if( accessInformations == null ) return new ArrayList<AccessInformation>();
			return accessInformations;
		}

		public void setAccessInformations(List<AccessInformation> accessInformations) {
			this.accessInformations = accessInformations;
		}

		public String getCheckInTime() {
			return checkInTime;
		}

		public void setCheckInTime(String checkInTime) {
			this.checkInTime = checkInTime;
		}

		public String getCheckOutTime() {
			return checkOutTime;
		}

		public void setCheckOutTime(String checkOutTime) {
			this.checkOutTime = checkOutTime;
		}

		public Long getX() {
			return x;
		}

		public void setX(Long x) {
			this.x = x;
		}

		public Long getY() {
			return y;
		}

		public void setY(Long y) {
			this.y = y;
		}

		public LastUpdate getLastUpdate() {
			return lastUpdate;
		}

		public void setLastUpdate(LastUpdate lastUpdate) {
			this.lastUpdate = lastUpdate;
		}

		public String getWifiHikariStation() {
			return wifiHikariStation;
		}

		public void setWifiHikariStation(String wifiHikariStation) {
			this.wifiHikariStation = wifiHikariStation;
		}

		public static class Area {

			@JsonProperty("Region")
			private String region;

			@JsonProperty("Prefecture")
			private String prefecture;

			@JsonProperty("LargeArea")
			private String largeArea;

			@JsonProperty("SmallArea")
			private String smallArea;

			public String getRegion() {
				return region;
			}

			public void setRegion(String region) {
				this.region = region;
			}

			public String getPrefecture() {
				return prefecture;
			}

			public void setPrefecture(String prefecture) {
				this.prefecture = prefecture;
			}

			public String getLargeArea() {
				return largeArea;
			}

			public void setLargeArea(String largeArea) {
				this.largeArea = largeArea;
			}

			public String getSmallArea() {
				return smallArea;
			}

			public void setSmallArea(String smallArea) {
				this.smallArea = smallArea;
			}
		}

		public static class AccessInformation {

			@JsonProperty("name")
			private String name;

			@JacksonXmlText
			@JacksonXmlCData
			private String value;

			public String getName() {
				return name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getValue() {
				return value;
			}

			public void setValue(String value) {
				this.value = value;
			}

		}

		public static class LastUpdate {

			@JacksonXmlProperty(isAttribute=true)
			private String day;

			@JacksonXmlProperty(isAttribute=true)
			private String month;

			@JacksonXmlProperty(isAttribute=true)
			private String year;

			public void setDay(String day) {
				this.day = day;
			}

			public void setMonth(String month) {
				this.month = month;
			}

			public void setYear(String year) {
				this.year = year;
			}

			public Date getDate() throws ParseException {
				return new SimpleDateFormat("yyyyMMdd").parse(this.year+this.month+this.day);
			}
		}
	}
}
