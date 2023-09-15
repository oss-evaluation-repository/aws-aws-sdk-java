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
package com.amazonaws.services.kinesisanalyticsv2.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.kinesisanalyticsv2.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * OutputUpdate JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OutputUpdateJsonUnmarshaller implements Unmarshaller<OutputUpdate, JsonUnmarshallerContext> {

    public OutputUpdate unmarshall(JsonUnmarshallerContext context) throws Exception {
        OutputUpdate outputUpdate = new OutputUpdate();

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
                if (context.testExpression("OutputId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    outputUpdate.setOutputId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("NameUpdate", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    outputUpdate.setNameUpdate(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("KinesisStreamsOutputUpdate", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    outputUpdate.setKinesisStreamsOutputUpdate(KinesisStreamsOutputUpdateJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("KinesisFirehoseOutputUpdate", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    outputUpdate.setKinesisFirehoseOutputUpdate(KinesisFirehoseOutputUpdateJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("LambdaOutputUpdate", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    outputUpdate.setLambdaOutputUpdate(LambdaOutputUpdateJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("DestinationSchemaUpdate", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    outputUpdate.setDestinationSchemaUpdate(DestinationSchemaJsonUnmarshaller.getInstance().unmarshall(context));
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

        return outputUpdate;
    }

    private static OutputUpdateJsonUnmarshaller instance;

    public static OutputUpdateJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new OutputUpdateJsonUnmarshaller();
        return instance;
    }
}
