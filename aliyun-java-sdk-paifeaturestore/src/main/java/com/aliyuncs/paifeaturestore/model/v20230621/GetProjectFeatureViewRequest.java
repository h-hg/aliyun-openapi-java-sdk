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

package com.aliyuncs.paifeaturestore.model.v20230621;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class GetProjectFeatureViewRequest extends RoaAcsRequest<GetProjectFeatureViewResponse> {
	   

	private String instanceId;

	private String featureViewName;

	private String projectId;
	public GetProjectFeatureViewRequest() {
		super("PaiFeatureStore", "2023-06-21", "GetProjectFeatureView");
		setUriPattern("/api/v1/instances/[InstanceId]/projects/[ProjectId]/featureviews/[FeatureViewName]");
		setMethod(MethodType.GET);
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putPathParameter("InstanceId", instanceId);
		}
	}

	public String getFeatureViewName() {
		return this.featureViewName;
	}

	public void setFeatureViewName(String featureViewName) {
		this.featureViewName = featureViewName;
		if(featureViewName != null){
			putPathParameter("FeatureViewName", featureViewName);
		}
	}

	public String getProjectId() {
		return this.projectId;
	}

	public void setProjectId(String projectId) {
		this.projectId = projectId;
		if(projectId != null){
			putPathParameter("ProjectId", projectId);
		}
	}

	@Override
	public Class<GetProjectFeatureViewResponse> getResponseClass() {
		return GetProjectFeatureViewResponse.class;
	}

}
