/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.trademark.model.v20180724;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.trademark.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class StoreMaterialTemporarilyRequest extends RpcAcsRequest<StoreMaterialTemporarilyResponse> {
	   

	private String contactEmail;

	private String eAddress;

	private String country;

	private String legalNoticeOssKey;

	private String contactNumber;

	private String city;

	private String type;

	private String contactName;

	private String passportOssKey;

	private String province;

	private String contactProvince;

	private Long personalType;

	private String loaOssKey;

	private String idCardName;

	private String contactAddress;

	private String idCardNumber;

	private String address;

	private String town;

	private String idCardOssKey;

	private String contactZipcode;

	private String eName;

	private String contactDistrict;

	private String businessLicenceOssKey;

	private String name;

	private String cardNumber;

	private Integer principalName;

	private String region;

	private String contactCounty;

	private String contactCity;
	public StoreMaterialTemporarilyRequest() {
		super("Trademark", "2018-07-24", "StoreMaterialTemporarily");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getContactEmail() {
		return this.contactEmail;
	}

	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
		if(contactEmail != null){
			putQueryParameter("ContactEmail", contactEmail);
		}
	}

	public String getEAddress() {
		return this.eAddress;
	}

	public void setEAddress(String eAddress) {
		this.eAddress = eAddress;
		if(eAddress != null){
			putQueryParameter("EAddress", eAddress);
		}
	}

	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
		if(country != null){
			putQueryParameter("Country", country);
		}
	}

	public String getLegalNoticeOssKey() {
		return this.legalNoticeOssKey;
	}

	public void setLegalNoticeOssKey(String legalNoticeOssKey) {
		this.legalNoticeOssKey = legalNoticeOssKey;
		if(legalNoticeOssKey != null){
			putQueryParameter("LegalNoticeOssKey", legalNoticeOssKey);
		}
	}

	public String getContactNumber() {
		return this.contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
		if(contactNumber != null){
			putQueryParameter("ContactNumber", contactNumber);
		}
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
		if(city != null){
			putQueryParameter("City", city);
		}
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
		if(type != null){
			putQueryParameter("Type", type);
		}
	}

	public String getContactName() {
		return this.contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
		if(contactName != null){
			putQueryParameter("ContactName", contactName);
		}
	}

	public String getPassportOssKey() {
		return this.passportOssKey;
	}

	public void setPassportOssKey(String passportOssKey) {
		this.passportOssKey = passportOssKey;
		if(passportOssKey != null){
			putQueryParameter("PassportOssKey", passportOssKey);
		}
	}

	public String getProvince() {
		return this.province;
	}

	public void setProvince(String province) {
		this.province = province;
		if(province != null){
			putQueryParameter("Province", province);
		}
	}

	public String getContactProvince() {
		return this.contactProvince;
	}

	public void setContactProvince(String contactProvince) {
		this.contactProvince = contactProvince;
		if(contactProvince != null){
			putQueryParameter("ContactProvince", contactProvince);
		}
	}

	public Long getPersonalType() {
		return this.personalType;
	}

	public void setPersonalType(Long personalType) {
		this.personalType = personalType;
		if(personalType != null){
			putQueryParameter("PersonalType", personalType.toString());
		}
	}

	public String getLoaOssKey() {
		return this.loaOssKey;
	}

	public void setLoaOssKey(String loaOssKey) {
		this.loaOssKey = loaOssKey;
		if(loaOssKey != null){
			putQueryParameter("LoaOssKey", loaOssKey);
		}
	}

	public String getIdCardName() {
		return this.idCardName;
	}

	public void setIdCardName(String idCardName) {
		this.idCardName = idCardName;
		if(idCardName != null){
			putQueryParameter("IdCardName", idCardName);
		}
	}

	public String getContactAddress() {
		return this.contactAddress;
	}

	public void setContactAddress(String contactAddress) {
		this.contactAddress = contactAddress;
		if(contactAddress != null){
			putQueryParameter("ContactAddress", contactAddress);
		}
	}

	public String getIdCardNumber() {
		return this.idCardNumber;
	}

	public void setIdCardNumber(String idCardNumber) {
		this.idCardNumber = idCardNumber;
		if(idCardNumber != null){
			putQueryParameter("IdCardNumber", idCardNumber);
		}
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
		if(address != null){
			putQueryParameter("Address", address);
		}
	}

	public String getTown() {
		return this.town;
	}

	public void setTown(String town) {
		this.town = town;
		if(town != null){
			putQueryParameter("Town", town);
		}
	}

	public String getIdCardOssKey() {
		return this.idCardOssKey;
	}

	public void setIdCardOssKey(String idCardOssKey) {
		this.idCardOssKey = idCardOssKey;
		if(idCardOssKey != null){
			putQueryParameter("IdCardOssKey", idCardOssKey);
		}
	}

	public String getContactZipcode() {
		return this.contactZipcode;
	}

	public void setContactZipcode(String contactZipcode) {
		this.contactZipcode = contactZipcode;
		if(contactZipcode != null){
			putQueryParameter("ContactZipcode", contactZipcode);
		}
	}

	public String getEName() {
		return this.eName;
	}

	public void setEName(String eName) {
		this.eName = eName;
		if(eName != null){
			putQueryParameter("EName", eName);
		}
	}

	public String getContactDistrict() {
		return this.contactDistrict;
	}

	public void setContactDistrict(String contactDistrict) {
		this.contactDistrict = contactDistrict;
		if(contactDistrict != null){
			putQueryParameter("ContactDistrict", contactDistrict);
		}
	}

	public String getBusinessLicenceOssKey() {
		return this.businessLicenceOssKey;
	}

	public void setBusinessLicenceOssKey(String businessLicenceOssKey) {
		this.businessLicenceOssKey = businessLicenceOssKey;
		if(businessLicenceOssKey != null){
			putQueryParameter("BusinessLicenceOssKey", businessLicenceOssKey);
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putQueryParameter("Name", name);
		}
	}

	public String getCardNumber() {
		return this.cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
		if(cardNumber != null){
			putQueryParameter("CardNumber", cardNumber);
		}
	}

	public Integer getPrincipalName() {
		return this.principalName;
	}

	public void setPrincipalName(Integer principalName) {
		this.principalName = principalName;
		if(principalName != null){
			putQueryParameter("PrincipalName", principalName.toString());
		}
	}

	public String getRegion() {
		return this.region;
	}

	public void setRegion(String region) {
		this.region = region;
		if(region != null){
			putQueryParameter("Region", region);
		}
	}

	public String getContactCounty() {
		return this.contactCounty;
	}

	public void setContactCounty(String contactCounty) {
		this.contactCounty = contactCounty;
		if(contactCounty != null){
			putQueryParameter("ContactCounty", contactCounty);
		}
	}

	public String getContactCity() {
		return this.contactCity;
	}

	public void setContactCity(String contactCity) {
		this.contactCity = contactCity;
		if(contactCity != null){
			putQueryParameter("ContactCity", contactCity);
		}
	}

	@Override
	public Class<StoreMaterialTemporarilyResponse> getResponseClass() {
		return StoreMaterialTemporarilyResponse.class;
	}

}
