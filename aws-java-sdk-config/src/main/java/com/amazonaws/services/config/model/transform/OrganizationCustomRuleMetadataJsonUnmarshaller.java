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
package com.amazonaws.services.config.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.config.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * OrganizationCustomRuleMetadata JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OrganizationCustomRuleMetadataJsonUnmarshaller implements Unmarshaller<OrganizationCustomRuleMetadata, JsonUnmarshallerContext> {

    public OrganizationCustomRuleMetadata unmarshall(JsonUnmarshallerContext context) throws Exception {
        OrganizationCustomRuleMetadata organizationCustomRuleMetadata = new OrganizationCustomRuleMetadata();

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
                if (context.testExpression("Description", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    organizationCustomRuleMetadata.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LambdaFunctionArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    organizationCustomRuleMetadata.setLambdaFunctionArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("OrganizationConfigRuleTriggerTypes", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    organizationCustomRuleMetadata.setOrganizationConfigRuleTriggerTypes(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("InputParameters", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    organizationCustomRuleMetadata.setInputParameters(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("MaximumExecutionFrequency", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    organizationCustomRuleMetadata.setMaximumExecutionFrequency(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ResourceTypesScope", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    organizationCustomRuleMetadata.setResourceTypesScope(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("ResourceIdScope", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    organizationCustomRuleMetadata.setResourceIdScope(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TagKeyScope", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    organizationCustomRuleMetadata.setTagKeyScope(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TagValueScope", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    organizationCustomRuleMetadata.setTagValueScope(context.getUnmarshaller(String.class).unmarshall(context));
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

        return organizationCustomRuleMetadata;
    }

    private static OrganizationCustomRuleMetadataJsonUnmarshaller instance;

    public static OrganizationCustomRuleMetadataJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new OrganizationCustomRuleMetadataJsonUnmarshaller();
        return instance;
    }
}
