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

package com.aliyuncs.ecd.model.v20200930;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ecd.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class GetAsyncTaskRequest extends RpcAcsRequest<GetAsyncTaskResponse> {
	   

	private String cdsId;

	private String asyncTaskId;
	public GetAsyncTaskRequest() {
		super("ecd", "2020-09-30", "GetAsyncTask");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getCdsId() {
		return this.cdsId;
	}

	public void setCdsId(String cdsId) {
		this.cdsId = cdsId;
		if(cdsId != null){
			putQueryParameter("CdsId", cdsId);
		}
	}

	public String getAsyncTaskId() {
		return this.asyncTaskId;
	}

	public void setAsyncTaskId(String asyncTaskId) {
		this.asyncTaskId = asyncTaskId;
		if(asyncTaskId != null){
			putQueryParameter("AsyncTaskId", asyncTaskId);
		}
	}

	@Override
	public Class<GetAsyncTaskResponse> getResponseClass() {
		return GetAsyncTaskResponse.class;
	}

}
