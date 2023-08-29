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

import com.aliyuncs.AcsResponse;
import com.aliyuncs.paifeaturestore.transform.v20230621.GetProjectFeatureEntityHotIdsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetProjectFeatureEntityHotIdsResponse extends AcsResponse {

	private String requestId;

	private String hotIds;

	private Integer count;

	private String nextSeqNumber;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getHotIds() {
		return this.hotIds;
	}

	public void setHotIds(String hotIds) {
		this.hotIds = hotIds;
	}

	public Integer getCount() {
		return this.count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public String getNextSeqNumber() {
		return this.nextSeqNumber;
	}

	public void setNextSeqNumber(String nextSeqNumber) {
		this.nextSeqNumber = nextSeqNumber;
	}

	@Override
	public GetProjectFeatureEntityHotIdsResponse getInstance(UnmarshallerContext context) {
		return	GetProjectFeatureEntityHotIdsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
