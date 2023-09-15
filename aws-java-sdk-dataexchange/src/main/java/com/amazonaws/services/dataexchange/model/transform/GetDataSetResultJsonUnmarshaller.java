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
package com.amazonaws.services.dataexchange.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.dataexchange.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * GetDataSetResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetDataSetResultJsonUnmarshaller implements Unmarshaller<GetDataSetResult, JsonUnmarshallerContext> {

    public GetDataSetResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetDataSetResult getDataSetResult = new GetDataSetResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return getDataSetResult;
        }

        boolean knownMember;

        while (true) {
            if (token == null)
                break;

            knownMember = false;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("Arn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getDataSetResult.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AssetType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getDataSetResult.setAssetType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreatedAt", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getDataSetResult.setCreatedAt(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("Description", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getDataSetResult.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Id", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getDataSetResult.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Name", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getDataSetResult.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Origin", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getDataSetResult.setOrigin(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("OriginDetails", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getDataSetResult.setOriginDetails(OriginDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("SourceId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getDataSetResult.setSourceId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Tags", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getDataSetResult.setTags(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context.getUnmarshaller(String.class))
                            .unmarshall(context));
                }
                if (context.testExpression("UpdatedAt", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getDataSetResult.setUpdatedAt(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
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

        return getDataSetResult;
    }

    private static GetDataSetResultJsonUnmarshaller instance;

    public static GetDataSetResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetDataSetResultJsonUnmarshaller();
        return instance;
    }
}
