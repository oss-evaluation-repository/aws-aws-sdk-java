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
package com.amazonaws.services.servicecatalog.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.servicecatalog.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ProvisioningArtifactParameter JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ProvisioningArtifactParameterJsonUnmarshaller implements Unmarshaller<ProvisioningArtifactParameter, JsonUnmarshallerContext> {

    public ProvisioningArtifactParameter unmarshall(JsonUnmarshallerContext context) throws Exception {
        ProvisioningArtifactParameter provisioningArtifactParameter = new ProvisioningArtifactParameter();

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
                if (context.testExpression("ParameterKey", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    provisioningArtifactParameter.setParameterKey(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DefaultValue", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    provisioningArtifactParameter.setDefaultValue(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ParameterType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    provisioningArtifactParameter.setParameterType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("IsNoEcho", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    provisioningArtifactParameter.setIsNoEcho(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("Description", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    provisioningArtifactParameter.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ParameterConstraints", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    provisioningArtifactParameter.setParameterConstraints(ParameterConstraintsJsonUnmarshaller.getInstance().unmarshall(context));
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

        return provisioningArtifactParameter;
    }

    private static ProvisioningArtifactParameterJsonUnmarshaller instance;

    public static ProvisioningArtifactParameterJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ProvisioningArtifactParameterJsonUnmarshaller();
        return instance;
    }
}
