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
package com.amazonaws.services.chimesdkmediapipelines.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.chimesdkmediapipelines.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * MediaConcatenationPipeline JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MediaConcatenationPipelineJsonUnmarshaller implements Unmarshaller<MediaConcatenationPipeline, JsonUnmarshallerContext> {

    public MediaConcatenationPipeline unmarshall(JsonUnmarshallerContext context) throws Exception {
        MediaConcatenationPipeline mediaConcatenationPipeline = new MediaConcatenationPipeline();

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
                if (context.testExpression("MediaPipelineId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    mediaConcatenationPipeline.setMediaPipelineId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("MediaPipelineArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    mediaConcatenationPipeline.setMediaPipelineArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Sources", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    mediaConcatenationPipeline.setSources(new ListUnmarshaller<ConcatenationSource>(ConcatenationSourceJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("Sinks", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    mediaConcatenationPipeline.setSinks(new ListUnmarshaller<ConcatenationSink>(ConcatenationSinkJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    mediaConcatenationPipeline.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreatedTimestamp", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    mediaConcatenationPipeline.setCreatedTimestamp(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("UpdatedTimestamp", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    mediaConcatenationPipeline.setUpdatedTimestamp(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
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

        return mediaConcatenationPipeline;
    }

    private static MediaConcatenationPipelineJsonUnmarshaller instance;

    public static MediaConcatenationPipelineJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new MediaConcatenationPipelineJsonUnmarshaller();
        return instance;
    }
}
