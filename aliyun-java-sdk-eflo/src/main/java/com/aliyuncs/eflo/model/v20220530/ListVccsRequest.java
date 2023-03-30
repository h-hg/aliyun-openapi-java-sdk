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

package com.aliyuncs.eflo.model.v20220530;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ListVccsRequest extends RpcAcsRequest<ListVccsResponse> {
	   

	private String cenId;

	private Integer pageNumber;

	private String resourceGroupId;

	private Integer pageSize;

	private List<Tag> tags;

	private String vccId;

	private Integer bandwidth;

	private String exStatus;

	private String filterErId;

	private String vpdId;

	private String vpcId;

	private Boolean enablePage;

	private String status;
	public ListVccsRequest() {
		super("eflo", "2022-05-30", "ListVccs", "eflo");
		setMethod(MethodType.POST);
	}

	public String getCenId() {
		return this.cenId;
	}

	public void setCenId(String cenId) {
		this.cenId = cenId;
		if(cenId != null){
			putBodyParameter("CenId", cenId);
		}
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
		if(pageNumber != null){
			putBodyParameter("PageNumber", pageNumber.toString());
		}
	}

	public String getResourceGroupId() {
		return this.resourceGroupId;
	}

	public void setResourceGroupId(String resourceGroupId) {
		this.resourceGroupId = resourceGroupId;
		if(resourceGroupId != null){
			putBodyParameter("ResourceGroupId", resourceGroupId);
		}
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putBodyParameter("PageSize", pageSize.toString());
		}
	}

	public List<Tag> getTags() {
		return this.tags;
	}

	public void setTags(List<Tag> tags) {
		this.tags = tags;	
		if (tags != null) {
			for (int depth1 = 0; depth1 < tags.size(); depth1++) {
				putBodyParameter("Tag." + (depth1 + 1) + ".Value" , tags.get(depth1).getValue());
				putBodyParameter("Tag." + (depth1 + 1) + ".Key" , tags.get(depth1).getKey());
			}
		}	
	}

	public String getVccId() {
		return this.vccId;
	}

	public void setVccId(String vccId) {
		this.vccId = vccId;
		if(vccId != null){
			putBodyParameter("VccId", vccId);
		}
	}

	public Integer getBandwidth() {
		return this.bandwidth;
	}

	public void setBandwidth(Integer bandwidth) {
		this.bandwidth = bandwidth;
		if(bandwidth != null){
			putBodyParameter("Bandwidth", bandwidth.toString());
		}
	}

	public String getExStatus() {
		return this.exStatus;
	}

	public void setExStatus(String exStatus) {
		this.exStatus = exStatus;
		if(exStatus != null){
			putBodyParameter("ExStatus", exStatus);
		}
	}

	public String getFilterErId() {
		return this.filterErId;
	}

	public void setFilterErId(String filterErId) {
		this.filterErId = filterErId;
		if(filterErId != null){
			putBodyParameter("FilterErId", filterErId);
		}
	}

	public String getVpdId() {
		return this.vpdId;
	}

	public void setVpdId(String vpdId) {
		this.vpdId = vpdId;
		if(vpdId != null){
			putBodyParameter("VpdId", vpdId);
		}
	}

	public String getVpcId() {
		return this.vpcId;
	}

	public void setVpcId(String vpcId) {
		this.vpcId = vpcId;
		if(vpcId != null){
			putBodyParameter("VpcId", vpcId);
		}
	}

	public Boolean getEnablePage() {
		return this.enablePage;
	}

	public void setEnablePage(Boolean enablePage) {
		this.enablePage = enablePage;
		if(enablePage != null){
			putBodyParameter("EnablePage", enablePage.toString());
		}
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
		if(status != null){
			putBodyParameter("Status", status);
		}
	}

	public static class Tag {

		private String value;

		private String key;

		public String getValue() {
			return this.value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		public String getKey() {
			return this.key;
		}

		public void setKey(String key) {
			this.key = key;
		}
	}

	@Override
	public Class<ListVccsResponse> getResponseClass() {
		return ListVccsResponse.class;
	}

}
