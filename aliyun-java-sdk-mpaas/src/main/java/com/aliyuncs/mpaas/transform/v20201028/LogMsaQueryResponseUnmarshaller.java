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

package com.aliyuncs.mpaas.transform.v20201028;

import com.aliyuncs.mpaas.model.v20201028.LogMsaQueryResponse;
import com.aliyuncs.mpaas.model.v20201028.LogMsaQueryResponse.ResultContent;
import com.aliyuncs.transform.UnmarshallerContext;


public class LogMsaQueryResponseUnmarshaller {

	public static LogMsaQueryResponse unmarshall(LogMsaQueryResponse logMsaQueryResponse, UnmarshallerContext _ctx) {
		
		logMsaQueryResponse.setRequestId(_ctx.stringValue("LogMsaQueryResponse.RequestId"));
		logMsaQueryResponse.setResultMessage(_ctx.stringValue("LogMsaQueryResponse.ResultMessage"));
		logMsaQueryResponse.setResultCode(_ctx.stringValue("LogMsaQueryResponse.ResultCode"));

		ResultContent resultContent = new ResultContent();
		resultContent.setCode(_ctx.stringValue("LogMsaQueryResponse.ResultContent.Code"));
		resultContent.setMessage(_ctx.stringValue("LogMsaQueryResponse.ResultContent.Message"));
		resultContent.setData(_ctx.stringValue("LogMsaQueryResponse.ResultContent.Data"));
		resultContent.setSuccess(_ctx.booleanValue("LogMsaQueryResponse.ResultContent.Success"));
		logMsaQueryResponse.setResultContent(resultContent);
	 
	 	return logMsaQueryResponse;
	}
}