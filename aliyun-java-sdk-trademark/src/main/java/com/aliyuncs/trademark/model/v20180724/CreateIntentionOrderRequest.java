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

package com.aliyuncs.trademark.model.v20180724;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class CreateIntentionOrderRequest extends RpcAcsRequest<CreateIntentionOrderResponse> {
	   

	private String channel;

	private String intentionBizId;
	public CreateIntentionOrderRequest() {
		super("Trademark", "2018-07-24", "CreateIntentionOrder");
		setMethod(MethodType.POST);
	}

	public String getChannel() {
		return this.channel;
	}

	public void setChannel(String channel) {
		this.channel = channel;
		if(channel != null){
			putQueryParameter("Channel", channel);
		}
	}

	public String getIntentionBizId() {
		return this.intentionBizId;
	}

	public void setIntentionBizId(String intentionBizId) {
		this.intentionBizId = intentionBizId;
		if(intentionBizId != null){
			putQueryParameter("IntentionBizId", intentionBizId);
		}
	}

	@Override
	public Class<CreateIntentionOrderResponse> getResponseClass() {
		return CreateIntentionOrderResponse.class;
	}

}
