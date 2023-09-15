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
package com.amazonaws.services.macie2.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.macie2.model.*;
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
                if (context.testExpression("accountId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    finding.setAccountId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("archived", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    finding.setArchived(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("category", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    finding.setCategory(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("classificationDetails", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    finding.setClassificationDetails(ClassificationDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("count", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    finding.setCount(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("createdAt", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    finding.setCreatedAt(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("description", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    finding.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("id", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    finding.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("partition", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    finding.setPartition(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("policyDetails", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    finding.setPolicyDetails(PolicyDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("region", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    finding.setRegion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("resourcesAffected", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    finding.setResourcesAffected(ResourcesAffectedJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("sample", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    finding.setSample(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("schemaVersion", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    finding.setSchemaVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("severity", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    finding.setSeverity(SeverityJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("title", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    finding.setTitle(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("type", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    finding.setType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("updatedAt", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    finding.setUpdatedAt(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
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
