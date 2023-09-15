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
package com.amazonaws.services.mediatailor.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.mediatailor.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DescribeProgramResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeProgramResultJsonUnmarshaller implements Unmarshaller<DescribeProgramResult, JsonUnmarshallerContext> {

    public DescribeProgramResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeProgramResult describeProgramResult = new DescribeProgramResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return describeProgramResult;
        }

        boolean knownMember;

        while (true) {
            if (token == null)
                break;

            knownMember = false;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("AdBreaks", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeProgramResult.setAdBreaks(new ListUnmarshaller<AdBreak>(AdBreakJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("Arn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeProgramResult.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ChannelName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeProgramResult.setChannelName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ClipRange", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeProgramResult.setClipRange(ClipRangeJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("CreationTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeProgramResult.setCreationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("DurationMillis", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeProgramResult.setDurationMillis(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("LiveSourceName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeProgramResult.setLiveSourceName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ProgramName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeProgramResult.setProgramName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ScheduledStartTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeProgramResult.setScheduledStartTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("SourceLocationName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeProgramResult.setSourceLocationName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("VodSourceName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeProgramResult.setVodSourceName(context.getUnmarshaller(String.class).unmarshall(context));
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

        return describeProgramResult;
    }

    private static DescribeProgramResultJsonUnmarshaller instance;

    public static DescribeProgramResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeProgramResultJsonUnmarshaller();
        return instance;
    }
}
