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

package com.aliyuncs.imm.model.v20200930;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.imm.transform.v20200930.DetectImageLabelsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DetectImageLabelsResponse extends AcsResponse {

	private String requestId;

	private List<LabelsItem> labels;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<LabelsItem> getLabels() {
		return this.labels;
	}

	public void setLabels(List<LabelsItem> labels) {
		this.labels = labels;
	}

	public static class LabelsItem {

		private String language;

		private String labelName;

		private Long labelLevel;

		private Float labelConfidence;

		private String parentLabelName;

		private Float centricScore;

		public String getLanguage() {
			return this.language;
		}

		public void setLanguage(String language) {
			this.language = language;
		}

		public String getLabelName() {
			return this.labelName;
		}

		public void setLabelName(String labelName) {
			this.labelName = labelName;
		}

		public Long getLabelLevel() {
			return this.labelLevel;
		}

		public void setLabelLevel(Long labelLevel) {
			this.labelLevel = labelLevel;
		}

		public Float getLabelConfidence() {
			return this.labelConfidence;
		}

		public void setLabelConfidence(Float labelConfidence) {
			this.labelConfidence = labelConfidence;
		}

		public String getParentLabelName() {
			return this.parentLabelName;
		}

		public void setParentLabelName(String parentLabelName) {
			this.parentLabelName = parentLabelName;
		}

		public Float getCentricScore() {
			return this.centricScore;
		}

		public void setCentricScore(Float centricScore) {
			this.centricScore = centricScore;
		}
	}

	@Override
	public DetectImageLabelsResponse getInstance(UnmarshallerContext context) {
		return	DetectImageLabelsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
