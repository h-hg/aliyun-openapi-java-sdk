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

package com.aliyuncs.cloudauth.model.v20190307;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.cloudauth.transform.v20190307.VerifyMaterialResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class VerifyMaterialResponse extends AcsResponse {

	private Float authorityComparisionScore;

	private Integer verifyStatus;

	private String requestId;

	private String verifyToken;

	private Float idCardFaceComparisonScore;

	private Material material;

	public Float getAuthorityComparisionScore() {
		return this.authorityComparisionScore;
	}

	public void setAuthorityComparisionScore(Float authorityComparisionScore) {
		this.authorityComparisionScore = authorityComparisionScore;
	}

	public Integer getVerifyStatus() {
		return this.verifyStatus;
	}

	public void setVerifyStatus(Integer verifyStatus) {
		this.verifyStatus = verifyStatus;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getVerifyToken() {
		return this.verifyToken;
	}

	public void setVerifyToken(String verifyToken) {
		this.verifyToken = verifyToken;
	}

	public Float getIdCardFaceComparisonScore() {
		return this.idCardFaceComparisonScore;
	}

	public void setIdCardFaceComparisonScore(Float idCardFaceComparisonScore) {
		this.idCardFaceComparisonScore = idCardFaceComparisonScore;
	}

	public Material getMaterial() {
		return this.material;
	}

	public void setMaterial(Material material) {
		this.material = material;
	}

	public static class Material {

		private String idCardNumber;

		private String faceGlobalUrl;

		private String faceImageUrl;

		private String faceMask;

		private String idCardName;

		private String faceQuality;

		private IdCardInfo idCardInfo;

		public String getIdCardNumber() {
			return this.idCardNumber;
		}

		public void setIdCardNumber(String idCardNumber) {
			this.idCardNumber = idCardNumber;
		}

		public String getFaceGlobalUrl() {
			return this.faceGlobalUrl;
		}

		public void setFaceGlobalUrl(String faceGlobalUrl) {
			this.faceGlobalUrl = faceGlobalUrl;
		}

		public String getFaceImageUrl() {
			return this.faceImageUrl;
		}

		public void setFaceImageUrl(String faceImageUrl) {
			this.faceImageUrl = faceImageUrl;
		}

		public String getFaceMask() {
			return this.faceMask;
		}

		public void setFaceMask(String faceMask) {
			this.faceMask = faceMask;
		}

		public String getIdCardName() {
			return this.idCardName;
		}

		public void setIdCardName(String idCardName) {
			this.idCardName = idCardName;
		}

		public String getFaceQuality() {
			return this.faceQuality;
		}

		public void setFaceQuality(String faceQuality) {
			this.faceQuality = faceQuality;
		}

		public IdCardInfo getIdCardInfo() {
			return this.idCardInfo;
		}

		public void setIdCardInfo(IdCardInfo idCardInfo) {
			this.idCardInfo = idCardInfo;
		}

		public static class IdCardInfo {

			private String sex;

			private String endDate;

			private String authority;

			private String address;

			private String number;

			private String startDate;

			private String backImageUrl;

			private String nationality;

			private String birth;

			private String name;

			private String frontImageUrl;

			public String getSex() {
				return this.sex;
			}

			public void setSex(String sex) {
				this.sex = sex;
			}

			public String getEndDate() {
				return this.endDate;
			}

			public void setEndDate(String endDate) {
				this.endDate = endDate;
			}

			public String getAuthority() {
				return this.authority;
			}

			public void setAuthority(String authority) {
				this.authority = authority;
			}

			public String getAddress() {
				return this.address;
			}

			public void setAddress(String address) {
				this.address = address;
			}

			public String getNumber() {
				return this.number;
			}

			public void setNumber(String number) {
				this.number = number;
			}

			public String getStartDate() {
				return this.startDate;
			}

			public void setStartDate(String startDate) {
				this.startDate = startDate;
			}

			public String getBackImageUrl() {
				return this.backImageUrl;
			}

			public void setBackImageUrl(String backImageUrl) {
				this.backImageUrl = backImageUrl;
			}

			public String getNationality() {
				return this.nationality;
			}

			public void setNationality(String nationality) {
				this.nationality = nationality;
			}

			public String getBirth() {
				return this.birth;
			}

			public void setBirth(String birth) {
				this.birth = birth;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getFrontImageUrl() {
				return this.frontImageUrl;
			}

			public void setFrontImageUrl(String frontImageUrl) {
				this.frontImageUrl = frontImageUrl;
			}
		}
	}

	@Override
	public VerifyMaterialResponse getInstance(UnmarshallerContext context) {
		return	VerifyMaterialResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
