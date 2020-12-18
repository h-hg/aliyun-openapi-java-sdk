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

package com.aliyuncs.cloudgameapi.transform.v20200728;

import com.aliyuncs.cloudgameapi.model.v20200728.SkipTrialPolicyResponse;
import com.aliyuncs.cloudgameapi.model.v20200728.SkipTrialPolicyResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class SkipTrialPolicyResponseUnmarshaller {

	public static SkipTrialPolicyResponse unmarshall(SkipTrialPolicyResponse skipTrialPolicyResponse, UnmarshallerContext _ctx) {
		
		skipTrialPolicyResponse.setRequestId(_ctx.stringValue("SkipTrialPolicyResponse.RequestId"));

		Data data = new Data();
		data.setSkipResult(_ctx.integerValue("SkipTrialPolicyResponse.Data.SkipResult"));
		skipTrialPolicyResponse.setData(data);
	 
	 	return skipTrialPolicyResponse;
	}
}