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

package com.aliyuncs.ahas_openapi.model.v20190901;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.ahas_openapi.transform.v20190901.EnableFlowRuleResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class EnableFlowRuleResponse extends AcsResponse {

	private String code;

	private String message;

	private String requestId;

	private Boolean success;

	private Data data;

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String refResource;

		private Integer clusterFallbackThreshold;

		private String namespace;

		private Integer statDurationMs;

		private String limitOrigin;

		private Integer clusterThresholdType;

		private Long ruleId;

		private Integer relationStrategy;

		private String resource;

		private String appName;

		private Integer maxQueueingTimeMs;

		private Integer controlBehavior;

		private Float clusterEstimatedMaxQps;

		private Integer warmUpPeriodSec;

		private Integer clusterFallbackStrategy;

		private Float threshold;

		private Boolean clusterMode;

		private Boolean enable;

		public String getRefResource() {
			return this.refResource;
		}

		public void setRefResource(String refResource) {
			this.refResource = refResource;
		}

		public Integer getClusterFallbackThreshold() {
			return this.clusterFallbackThreshold;
		}

		public void setClusterFallbackThreshold(Integer clusterFallbackThreshold) {
			this.clusterFallbackThreshold = clusterFallbackThreshold;
		}

		public String getNamespace() {
			return this.namespace;
		}

		public void setNamespace(String namespace) {
			this.namespace = namespace;
		}

		public Integer getStatDurationMs() {
			return this.statDurationMs;
		}

		public void setStatDurationMs(Integer statDurationMs) {
			this.statDurationMs = statDurationMs;
		}

		public String getLimitOrigin() {
			return this.limitOrigin;
		}

		public void setLimitOrigin(String limitOrigin) {
			this.limitOrigin = limitOrigin;
		}

		public Integer getClusterThresholdType() {
			return this.clusterThresholdType;
		}

		public void setClusterThresholdType(Integer clusterThresholdType) {
			this.clusterThresholdType = clusterThresholdType;
		}

		public Long getRuleId() {
			return this.ruleId;
		}

		public void setRuleId(Long ruleId) {
			this.ruleId = ruleId;
		}

		public Integer getRelationStrategy() {
			return this.relationStrategy;
		}

		public void setRelationStrategy(Integer relationStrategy) {
			this.relationStrategy = relationStrategy;
		}

		public String getResource() {
			return this.resource;
		}

		public void setResource(String resource) {
			this.resource = resource;
		}

		public String getAppName() {
			return this.appName;
		}

		public void setAppName(String appName) {
			this.appName = appName;
		}

		public Integer getMaxQueueingTimeMs() {
			return this.maxQueueingTimeMs;
		}

		public void setMaxQueueingTimeMs(Integer maxQueueingTimeMs) {
			this.maxQueueingTimeMs = maxQueueingTimeMs;
		}

		public Integer getControlBehavior() {
			return this.controlBehavior;
		}

		public void setControlBehavior(Integer controlBehavior) {
			this.controlBehavior = controlBehavior;
		}

		public Float getClusterEstimatedMaxQps() {
			return this.clusterEstimatedMaxQps;
		}

		public void setClusterEstimatedMaxQps(Float clusterEstimatedMaxQps) {
			this.clusterEstimatedMaxQps = clusterEstimatedMaxQps;
		}

		public Integer getWarmUpPeriodSec() {
			return this.warmUpPeriodSec;
		}

		public void setWarmUpPeriodSec(Integer warmUpPeriodSec) {
			this.warmUpPeriodSec = warmUpPeriodSec;
		}

		public Integer getClusterFallbackStrategy() {
			return this.clusterFallbackStrategy;
		}

		public void setClusterFallbackStrategy(Integer clusterFallbackStrategy) {
			this.clusterFallbackStrategy = clusterFallbackStrategy;
		}

		public Float getThreshold() {
			return this.threshold;
		}

		public void setThreshold(Float threshold) {
			this.threshold = threshold;
		}

		public Boolean getClusterMode() {
			return this.clusterMode;
		}

		public void setClusterMode(Boolean clusterMode) {
			this.clusterMode = clusterMode;
		}

		public Boolean getEnable() {
			return this.enable;
		}

		public void setEnable(Boolean enable) {
			this.enable = enable;
		}
	}

	@Override
	public EnableFlowRuleResponse getInstance(UnmarshallerContext context) {
		return	EnableFlowRuleResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
