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
package com.amazonaws.services.sagemaker.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.sagemaker.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * WarmPoolStatus JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class WarmPoolStatusJsonUnmarshaller implements Unmarshaller<WarmPoolStatus, JsonUnmarshallerContext> {

    public WarmPoolStatus unmarshall(JsonUnmarshallerContext context) throws Exception {
        WarmPoolStatus warmPoolStatus = new WarmPoolStatus();

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
                if (context.testExpression("Status", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    warmPoolStatus.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ResourceRetainedBillableTimeInSeconds", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    warmPoolStatus.setResourceRetainedBillableTimeInSeconds(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("ReusedByJob", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    warmPoolStatus.setReusedByJob(context.getUnmarshaller(String.class).unmarshall(context));
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

        return warmPoolStatus;
    }

    private static WarmPoolStatusJsonUnmarshaller instance;

    public static WarmPoolStatusJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new WarmPoolStatusJsonUnmarshaller();
        return instance;
    }
}
