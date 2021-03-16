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

package com.aliyuncs.scsp.model.v20200702;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.scsp.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class TransferCallToAgentRequest extends RpcAcsRequest<TransferCallToAgentResponse> {
	   

	private String clientToken;

	private String instanceId;

	private String accountName;

	private String targetAccountName;

	private String callId;

	private String jobId;

	private String connectionId;

	private String holdConnectionId;

	private Integer type;

	private String isSingleTransfer;
	public TransferCallToAgentRequest() {
		super("scsp", "2020-07-02", "TransferCallToAgent");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getClientToken() {
		return this.clientToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
		if(clientToken != null){
			putBodyParameter("ClientToken", clientToken);
		}
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putBodyParameter("InstanceId", instanceId);
		}
	}

	public String getAccountName() {
		return this.accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
		if(accountName != null){
			putBodyParameter("AccountName", accountName);
		}
	}

	public String getTargetAccountName() {
		return this.targetAccountName;
	}

	public void setTargetAccountName(String targetAccountName) {
		this.targetAccountName = targetAccountName;
		if(targetAccountName != null){
			putBodyParameter("TargetAccountName", targetAccountName);
		}
	}

	public String getCallId() {
		return this.callId;
	}

	public void setCallId(String callId) {
		this.callId = callId;
		if(callId != null){
			putBodyParameter("CallId", callId);
		}
	}

	public String getJobId() {
		return this.jobId;
	}

	public void setJobId(String jobId) {
		this.jobId = jobId;
		if(jobId != null){
			putBodyParameter("JobId", jobId);
		}
	}

	public String getConnectionId() {
		return this.connectionId;
	}

	public void setConnectionId(String connectionId) {
		this.connectionId = connectionId;
		if(connectionId != null){
			putBodyParameter("ConnectionId", connectionId);
		}
	}

	public String getHoldConnectionId() {
		return this.holdConnectionId;
	}

	public void setHoldConnectionId(String holdConnectionId) {
		this.holdConnectionId = holdConnectionId;
		if(holdConnectionId != null){
			putBodyParameter("HoldConnectionId", holdConnectionId);
		}
	}

	public Integer getType() {
		return this.type;
	}

	public void setType(Integer type) {
		this.type = type;
		if(type != null){
			putBodyParameter("Type", type.toString());
		}
	}

	public String getIsSingleTransfer() {
		return this.isSingleTransfer;
	}

	public void setIsSingleTransfer(String isSingleTransfer) {
		this.isSingleTransfer = isSingleTransfer;
		if(isSingleTransfer != null){
			putBodyParameter("IsSingleTransfer", isSingleTransfer);
		}
	}

	@Override
	public Class<TransferCallToAgentResponse> getResponseClass() {
		return TransferCallToAgentResponse.class;
	}

}
