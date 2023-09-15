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
package com.amazonaws.services.comprehend.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.comprehend.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * PiiEntitiesDetectionJobProperties JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PiiEntitiesDetectionJobPropertiesJsonUnmarshaller implements Unmarshaller<PiiEntitiesDetectionJobProperties, JsonUnmarshallerContext> {

    public PiiEntitiesDetectionJobProperties unmarshall(JsonUnmarshallerContext context) throws Exception {
        PiiEntitiesDetectionJobProperties piiEntitiesDetectionJobProperties = new PiiEntitiesDetectionJobProperties();

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
                if (context.testExpression("JobId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    piiEntitiesDetectionJobProperties.setJobId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("JobArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    piiEntitiesDetectionJobProperties.setJobArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("JobName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    piiEntitiesDetectionJobProperties.setJobName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("JobStatus", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    piiEntitiesDetectionJobProperties.setJobStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Message", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    piiEntitiesDetectionJobProperties.setMessage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SubmitTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    piiEntitiesDetectionJobProperties.setSubmitTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("EndTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    piiEntitiesDetectionJobProperties.setEndTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("InputDataConfig", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    piiEntitiesDetectionJobProperties.setInputDataConfig(InputDataConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("OutputDataConfig", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    piiEntitiesDetectionJobProperties.setOutputDataConfig(PiiOutputDataConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("RedactionConfig", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    piiEntitiesDetectionJobProperties.setRedactionConfig(RedactionConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("LanguageCode", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    piiEntitiesDetectionJobProperties.setLanguageCode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DataAccessRoleArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    piiEntitiesDetectionJobProperties.setDataAccessRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Mode", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    piiEntitiesDetectionJobProperties.setMode(context.getUnmarshaller(String.class).unmarshall(context));
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

        return piiEntitiesDetectionJobProperties;
    }

    private static PiiEntitiesDetectionJobPropertiesJsonUnmarshaller instance;

    public static PiiEntitiesDetectionJobPropertiesJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new PiiEntitiesDetectionJobPropertiesJsonUnmarshaller();
        return instance;
    }
}
