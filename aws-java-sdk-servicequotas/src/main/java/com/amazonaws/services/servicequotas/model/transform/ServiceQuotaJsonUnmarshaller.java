/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.servicequotas.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.servicequotas.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ServiceQuota JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ServiceQuotaJsonUnmarshaller implements Unmarshaller<ServiceQuota, JsonUnmarshallerContext> {

    public ServiceQuota unmarshall(JsonUnmarshallerContext context) throws Exception {
        ServiceQuota serviceQuota = new ServiceQuota();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return null;
        }

        boolean knownMember;

        while (true) {
            if (token == null)
                break;

            knownMember = false;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("ServiceCode", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    serviceQuota.setServiceCode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ServiceName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    serviceQuota.setServiceName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("QuotaArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    serviceQuota.setQuotaArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("QuotaCode", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    serviceQuota.setQuotaCode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("QuotaName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    serviceQuota.setQuotaName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Value", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    serviceQuota.setValue(context.getUnmarshaller(Double.class).unmarshall(context));
                }
                if (context.testExpression("Unit", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    serviceQuota.setUnit(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Adjustable", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    serviceQuota.setAdjustable(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("GlobalQuota", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    serviceQuota.setGlobalQuota(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("UsageMetric", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    serviceQuota.setUsageMetric(MetricInfoJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Period", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    serviceQuota.setPeriod(QuotaPeriodJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ErrorReason", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    serviceQuota.setErrorReason(ErrorReasonJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("QuotaAppliedAtLevel", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    serviceQuota.setQuotaAppliedAtLevel(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("QuotaContext", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    serviceQuota.setQuotaContext(QuotaContextInfoJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (token == FIELD_NAME && !knownMember) {
                    context.nextToken();
                    com.amazonaws.transform.UnknownMemberJsonUnmarshaller.getInstance().unmarshall(context);
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return serviceQuota;
    }

    private static ServiceQuotaJsonUnmarshaller instance;

    public static ServiceQuotaJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ServiceQuotaJsonUnmarshaller();
        return instance;
    }
}
