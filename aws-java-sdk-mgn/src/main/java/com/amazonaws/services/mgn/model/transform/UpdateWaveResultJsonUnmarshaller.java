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
package com.amazonaws.services.mgn.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.mgn.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * UpdateWaveResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateWaveResultJsonUnmarshaller implements Unmarshaller<UpdateWaveResult, JsonUnmarshallerContext> {

    public UpdateWaveResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        UpdateWaveResult updateWaveResult = new UpdateWaveResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return updateWaveResult;
        }

        boolean knownMember;

        while (true) {
            if (token == null)
                break;

            knownMember = false;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("arn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    updateWaveResult.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("creationDateTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    updateWaveResult.setCreationDateTime(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("description", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    updateWaveResult.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("isArchived", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    updateWaveResult.setIsArchived(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("lastModifiedDateTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    updateWaveResult.setLastModifiedDateTime(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("name", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    updateWaveResult.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("tags", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    updateWaveResult.setTags(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context.getUnmarshaller(String.class))
                            .unmarshall(context));
                }
                if (context.testExpression("waveAggregatedStatus", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    updateWaveResult.setWaveAggregatedStatus(WaveAggregatedStatusJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("waveID", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    updateWaveResult.setWaveID(context.getUnmarshaller(String.class).unmarshall(context));
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

        return updateWaveResult;
    }

    private static UpdateWaveResultJsonUnmarshaller instance;

    public static UpdateWaveResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new UpdateWaveResultJsonUnmarshaller();
        return instance;
    }
}
