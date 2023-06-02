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

package com.aliyuncs.ddoscoo.transform.v20200101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ddoscoo.model.v20200101.DescribeInstanceSpecsResponse;
import com.aliyuncs.ddoscoo.model.v20200101.DescribeInstanceSpecsResponse.InstanceSpec;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeInstanceSpecsResponseUnmarshaller {

	public static DescribeInstanceSpecsResponse unmarshall(DescribeInstanceSpecsResponse describeInstanceSpecsResponse, UnmarshallerContext _ctx) {
		
		describeInstanceSpecsResponse.setRequestId(_ctx.stringValue("DescribeInstanceSpecsResponse.RequestId"));

		List<InstanceSpec> instanceSpecs = new ArrayList<InstanceSpec>();
		for (int i = 0; i < _ctx.lengthValue("DescribeInstanceSpecsResponse.InstanceSpecs.Length"); i++) {
			InstanceSpec instanceSpec = new InstanceSpec();
			instanceSpec.setBaseBandwidth(_ctx.integerValue("DescribeInstanceSpecsResponse.InstanceSpecs["+ i +"].BaseBandwidth"));
			instanceSpec.setQpsLimit(_ctx.integerValue("DescribeInstanceSpecsResponse.InstanceSpecs["+ i +"].QpsLimit"));
			instanceSpec.setBandwidthMbps(_ctx.integerValue("DescribeInstanceSpecsResponse.InstanceSpecs["+ i +"].BandwidthMbps"));
			instanceSpec.setElasticBw(_ctx.integerValue("DescribeInstanceSpecsResponse.InstanceSpecs["+ i +"].ElasticBw"));
			instanceSpec.setDefenseCount(_ctx.integerValue("DescribeInstanceSpecsResponse.InstanceSpecs["+ i +"].DefenseCount"));
			instanceSpec.setSiteLimit(_ctx.integerValue("DescribeInstanceSpecsResponse.InstanceSpecs["+ i +"].SiteLimit"));
			instanceSpec.setPortLimit(_ctx.integerValue("DescribeInstanceSpecsResponse.InstanceSpecs["+ i +"].PortLimit"));
			instanceSpec.setElasticBandwidth(_ctx.integerValue("DescribeInstanceSpecsResponse.InstanceSpecs["+ i +"].ElasticBandwidth"));
			instanceSpec.setFunctionVersion(_ctx.stringValue("DescribeInstanceSpecsResponse.InstanceSpecs["+ i +"].FunctionVersion"));
			instanceSpec.setInstanceId(_ctx.stringValue("DescribeInstanceSpecsResponse.InstanceSpecs["+ i +"].InstanceId"));
			instanceSpec.setDomainLimit(_ctx.integerValue("DescribeInstanceSpecsResponse.InstanceSpecs["+ i +"].DomainLimit"));
			instanceSpec.setElasticBwModel(_ctx.stringValue("DescribeInstanceSpecsResponse.InstanceSpecs["+ i +"].ElasticBwModel"));
			instanceSpec.setCpsLimit(_ctx.longValue("DescribeInstanceSpecsResponse.InstanceSpecs["+ i +"].CpsLimit"));
			instanceSpec.setConnLimit(_ctx.longValue("DescribeInstanceSpecsResponse.InstanceSpecs["+ i +"].ConnLimit"));
			instanceSpec.setRealLimitBw(_ctx.longValue("DescribeInstanceSpecsResponse.InstanceSpecs["+ i +"].RealLimitBw"));
			instanceSpec.setElasticQpsMode(_ctx.stringValue("DescribeInstanceSpecsResponse.InstanceSpecs["+ i +"].ElasticQpsMode"));
			instanceSpec.setElasticQps(_ctx.longValue("DescribeInstanceSpecsResponse.InstanceSpecs["+ i +"].ElasticQps"));

			instanceSpecs.add(instanceSpec);
		}
		describeInstanceSpecsResponse.setInstanceSpecs(instanceSpecs);
	 
	 	return describeInstanceSpecsResponse;
	}
}