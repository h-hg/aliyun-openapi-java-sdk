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

package com.aliyuncs.oos.model.v20190601;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.oos.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreatePatchBaselineRequest extends RpcAcsRequest<CreatePatchBaselineResponse> {
	   

	private String clientToken;

	private String approvalRules;

	private String description;

	private String operationSystem;

	@SerializedName("rejectedPatches")
	private List<String> rejectedPatches;

	private String rejectedPatchesAction;

	private String name;
	public CreatePatchBaselineRequest() {
		super("oos", "2019-06-01", "CreatePatchBaseline", "oos");
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
			putQueryParameter("ClientToken", clientToken);
		}
	}

	public String getApprovalRules() {
		return this.approvalRules;
	}

	public void setApprovalRules(String approvalRules) {
		this.approvalRules = approvalRules;
		if(approvalRules != null){
			putQueryParameter("ApprovalRules", approvalRules);
		}
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putQueryParameter("Description", description);
		}
	}

	public String getOperationSystem() {
		return this.operationSystem;
	}

	public void setOperationSystem(String operationSystem) {
		this.operationSystem = operationSystem;
		if(operationSystem != null){
			putQueryParameter("OperationSystem", operationSystem);
		}
	}

	public List<String> getRejectedPatches() {
		return this.rejectedPatches;
	}

	public void setRejectedPatches(List<String> rejectedPatches) {
		this.rejectedPatches = rejectedPatches;	
		if (rejectedPatches != null) {
			putQueryParameter("RejectedPatches" , new Gson().toJson(rejectedPatches));
		}	
	}

	public String getRejectedPatchesAction() {
		return this.rejectedPatchesAction;
	}

	public void setRejectedPatchesAction(String rejectedPatchesAction) {
		this.rejectedPatchesAction = rejectedPatchesAction;
		if(rejectedPatchesAction != null){
			putQueryParameter("RejectedPatchesAction", rejectedPatchesAction);
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

	@Override
	public Class<CreatePatchBaselineResponse> getResponseClass() {
		return CreatePatchBaselineResponse.class;
	}

}
