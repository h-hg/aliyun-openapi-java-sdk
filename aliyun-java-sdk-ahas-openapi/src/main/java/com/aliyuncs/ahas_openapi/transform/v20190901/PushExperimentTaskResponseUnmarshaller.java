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

package com.aliyuncs.ahas_openapi.transform.v20190901;

import com.aliyuncs.ahas_openapi.model.v20190901.PushExperimentTaskResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class PushExperimentTaskResponseUnmarshaller {

	public static PushExperimentTaskResponse unmarshall(PushExperimentTaskResponse pushExperimentTaskResponse, UnmarshallerContext _ctx) {
		
		pushExperimentTaskResponse.setRequestId(_ctx.stringValue("PushExperimentTaskResponse.RequestId"));
		pushExperimentTaskResponse.setMessage(_ctx.stringValue("PushExperimentTaskResponse.Message"));
		pushExperimentTaskResponse.setCode(_ctx.stringValue("PushExperimentTaskResponse.Code"));
		pushExperimentTaskResponse.setSuccess(_ctx.booleanValue("PushExperimentTaskResponse.Success"));
	 
	 	return pushExperimentTaskResponse;
	}
}