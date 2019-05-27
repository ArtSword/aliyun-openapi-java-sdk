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

package com.aliyuncs.arms.model.v20190219;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class GetServicesRequest extends RpcAcsRequest<GetServicesResponse> {
	
	public GetServicesRequest() {
		super("ARMS", "2019-02-19", "GetServices");
	}

	private String appType;

	public String getAppType() {
		return this.appType;
	}

	public void setAppType(String appType) {
		this.appType = appType;
		if(appType != null){
			putQueryParameter("AppType", appType);
		}
	}

	@Override
	public Class<GetServicesResponse> getResponseClass() {
		return GetServicesResponse.class;
	}

}
