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
package com.amazonaws.services.elasticmapreduce.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.elasticmapreduce.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Studio JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StudioJsonUnmarshaller implements Unmarshaller<Studio, JsonUnmarshallerContext> {

    public Studio unmarshall(JsonUnmarshallerContext context) throws Exception {
        Studio studio = new Studio();

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
                if (context.testExpression("StudioId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    studio.setStudioId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StudioArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    studio.setStudioArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Name", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    studio.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Description", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    studio.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AuthMode", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    studio.setAuthMode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("VpcId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    studio.setVpcId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SubnetIds", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    studio.setSubnetIds(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("ServiceRole", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    studio.setServiceRole(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("UserRole", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    studio.setUserRole(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("WorkspaceSecurityGroupId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    studio.setWorkspaceSecurityGroupId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EngineSecurityGroupId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    studio.setEngineSecurityGroupId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Url", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    studio.setUrl(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreationTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    studio.setCreationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("DefaultS3Location", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    studio.setDefaultS3Location(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("IdpAuthUrl", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    studio.setIdpAuthUrl(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("IdpRelayStateParameterName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    studio.setIdpRelayStateParameterName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Tags", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    studio.setTags(new ListUnmarshaller<Tag>(TagJsonUnmarshaller.getInstance())

                    .unmarshall(context));
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

        return studio;
    }

    private static StudioJsonUnmarshaller instance;

    public static StudioJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new StudioJsonUnmarshaller();
        return instance;
    }
}
