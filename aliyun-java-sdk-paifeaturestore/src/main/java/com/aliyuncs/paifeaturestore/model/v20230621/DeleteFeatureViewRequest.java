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
public class DeleteFeatureViewRequest extends RoaAcsRequest<DeleteFeatureViewResponse> {
	   

	private String instanceId;

	private String featureViewId;
	public DeleteFeatureViewRequest() {
		super("PaiFeatureStore", "2023-06-21", "DeleteFeatureView");
		setUriPattern("/api/v1/instances/[InstanceId]/featureviews/[FeatureViewId]");
		setMethod(MethodType.DELETE);
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

	public String getFeatureViewId() {
		return this.featureViewId;
	}

	public void setFeatureViewId(String featureViewId) {
		this.featureViewId = featureViewId;
		if(featureViewId != null){
			putPathParameter("FeatureViewId", featureViewId);
		}
	}

	@Override
	public Class<DeleteFeatureViewResponse> getResponseClass() {
		return DeleteFeatureViewResponse.class;
	}

}
