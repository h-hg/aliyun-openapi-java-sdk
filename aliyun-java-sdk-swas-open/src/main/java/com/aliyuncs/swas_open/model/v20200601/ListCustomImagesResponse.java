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

package com.aliyuncs.swas_open.model.v20200601;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.swas_open.transform.v20200601.ListCustomImagesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListCustomImagesResponse extends AcsResponse {

	private String requestId;

	private String totalCount;

	private String pageSize;

	private String pageNumber;

	private List<CustomImage> customImages;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(String totalCount) {
		this.totalCount = totalCount;
	}

	public String getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}

	public String getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(String pageNumber) {
		this.pageNumber = pageNumber;
	}

	public List<CustomImage> getCustomImages() {
		return this.customImages;
	}

	public void setCustomImages(List<CustomImage> customImages) {
		this.customImages = customImages;
	}

	public static class CustomImage {

		private String creationTime;

		private String dataSnapshotName;

		private String systemSnapshotId;

		private Boolean inShare;

		private String instanceId;

		private String dataSnapshotId;

		private String regionId;

		private String systemSnapshotName;

		private String description;

		private String name;

		private String imageId;

		private String status;

		private String instanceName;

		public String getCreationTime() {
			return this.creationTime;
		}

		public void setCreationTime(String creationTime) {
			this.creationTime = creationTime;
		}

		public String getDataSnapshotName() {
			return this.dataSnapshotName;
		}

		public void setDataSnapshotName(String dataSnapshotName) {
			this.dataSnapshotName = dataSnapshotName;
		}

		public String getSystemSnapshotId() {
			return this.systemSnapshotId;
		}

		public void setSystemSnapshotId(String systemSnapshotId) {
			this.systemSnapshotId = systemSnapshotId;
		}

		public Boolean getInShare() {
			return this.inShare;
		}

		public void setInShare(Boolean inShare) {
			this.inShare = inShare;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getDataSnapshotId() {
			return this.dataSnapshotId;
		}

		public void setDataSnapshotId(String dataSnapshotId) {
			this.dataSnapshotId = dataSnapshotId;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getSystemSnapshotName() {
			return this.systemSnapshotName;
		}

		public void setSystemSnapshotName(String systemSnapshotName) {
			this.systemSnapshotName = systemSnapshotName;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getImageId() {
			return this.imageId;
		}

		public void setImageId(String imageId) {
			this.imageId = imageId;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getInstanceName() {
			return this.instanceName;
		}

		public void setInstanceName(String instanceName) {
			this.instanceName = instanceName;
		}
	}

	@Override
	public ListCustomImagesResponse getInstance(UnmarshallerContext context) {
		return	ListCustomImagesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
