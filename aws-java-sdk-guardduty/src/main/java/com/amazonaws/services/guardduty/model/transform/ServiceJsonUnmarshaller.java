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
package com.amazonaws.services.guardduty.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.guardduty.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Service JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ServiceJsonUnmarshaller implements Unmarshaller<Service, JsonUnmarshallerContext> {

    public Service unmarshall(JsonUnmarshallerContext context) throws Exception {
        Service service = new Service();

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
                if (context.testExpression("action", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    service.setAction(ActionJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("evidence", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    service.setEvidence(EvidenceJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("archived", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    service.setArchived(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("count", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    service.setCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("detectorId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    service.setDetectorId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("eventFirstSeen", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    service.setEventFirstSeen(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("eventLastSeen", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    service.setEventLastSeen(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("resourceRole", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    service.setResourceRole(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("serviceName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    service.setServiceName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("userFeedback", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    service.setUserFeedback(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("additionalInfo", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    service.setAdditionalInfo(ServiceAdditionalInfoJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("featureName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    service.setFeatureName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ebsVolumeScanDetails", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    service.setEbsVolumeScanDetails(EbsVolumeScanDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("runtimeDetails", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    service.setRuntimeDetails(RuntimeDetailsJsonUnmarshaller.getInstance().unmarshall(context));
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

        return service;
    }

    private static ServiceJsonUnmarshaller instance;

    public static ServiceJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ServiceJsonUnmarshaller();
        return instance;
    }
}
