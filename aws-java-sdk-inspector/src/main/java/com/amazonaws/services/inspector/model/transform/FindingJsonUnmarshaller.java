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
package com.amazonaws.services.inspector.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.inspector.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Finding JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FindingJsonUnmarshaller implements Unmarshaller<Finding, JsonUnmarshallerContext> {

    public Finding unmarshall(JsonUnmarshallerContext context) throws Exception {
        Finding finding = new Finding();

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
                    finding.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("schemaVersion", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    finding.setSchemaVersion(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("service", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    finding.setService(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("serviceAttributes", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    finding.setServiceAttributes(InspectorServiceAttributesJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("assetType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    finding.setAssetType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("assetAttributes", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    finding.setAssetAttributes(AssetAttributesJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("id", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    finding.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("title", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    finding.setTitle(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("description", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    finding.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("recommendation", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    finding.setRecommendation(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("severity", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    finding.setSeverity(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("numericSeverity", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    finding.setNumericSeverity(context.getUnmarshaller(Double.class).unmarshall(context));
                }
                if (context.testExpression("confidence", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    finding.setConfidence(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("indicatorOfCompromise", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    finding.setIndicatorOfCompromise(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("attributes", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    finding.setAttributes(new ListUnmarshaller<Attribute>(AttributeJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("userAttributes", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    finding.setUserAttributes(new ListUnmarshaller<Attribute>(AttributeJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("createdAt", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    finding.setCreatedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("updatedAt", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    finding.setUpdatedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
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

        return finding;
    }

    private static FindingJsonUnmarshaller instance;

    public static FindingJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new FindingJsonUnmarshaller();
        return instance;
    }
}
