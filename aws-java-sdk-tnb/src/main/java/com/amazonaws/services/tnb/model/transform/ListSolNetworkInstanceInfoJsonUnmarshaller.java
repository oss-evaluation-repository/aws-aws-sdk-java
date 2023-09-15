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
package com.amazonaws.services.tnb.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.tnb.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ListSolNetworkInstanceInfo JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListSolNetworkInstanceInfoJsonUnmarshaller implements Unmarshaller<ListSolNetworkInstanceInfo, JsonUnmarshallerContext> {

    public ListSolNetworkInstanceInfo unmarshall(JsonUnmarshallerContext context) throws Exception {
        ListSolNetworkInstanceInfo listSolNetworkInstanceInfo = new ListSolNetworkInstanceInfo();

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
                if (context.testExpression("arn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    listSolNetworkInstanceInfo.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("id", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    listSolNetworkInstanceInfo.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("metadata", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    listSolNetworkInstanceInfo.setMetadata(ListSolNetworkInstanceMetadataJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("nsInstanceDescription", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    listSolNetworkInstanceInfo.setNsInstanceDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("nsInstanceName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    listSolNetworkInstanceInfo.setNsInstanceName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("nsState", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    listSolNetworkInstanceInfo.setNsState(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("nsdId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    listSolNetworkInstanceInfo.setNsdId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("nsdInfoId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    listSolNetworkInstanceInfo.setNsdInfoId(context.getUnmarshaller(String.class).unmarshall(context));
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

        return listSolNetworkInstanceInfo;
    }

    private static ListSolNetworkInstanceInfoJsonUnmarshaller instance;

    public static ListSolNetworkInstanceInfoJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ListSolNetworkInstanceInfoJsonUnmarshaller();
        return instance;
    }
}
