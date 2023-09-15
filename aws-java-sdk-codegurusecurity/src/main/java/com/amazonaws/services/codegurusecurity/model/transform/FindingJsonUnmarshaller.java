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
package com.amazonaws.services.codegurusecurity.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.codegurusecurity.model.*;
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
                if (context.testExpression("createdAt", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    finding.setCreatedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("description", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    finding.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("detectorId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    finding.setDetectorId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("detectorName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    finding.setDetectorName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("detectorTags", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    finding.setDetectorTags(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("generatorId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    finding.setGeneratorId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("id", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    finding.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("remediation", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    finding.setRemediation(RemediationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("resource", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    finding.setResource(ResourceJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ruleId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    finding.setRuleId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("severity", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    finding.setSeverity(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    finding.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
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
                    finding.setUpdatedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("vulnerability", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    finding.setVulnerability(VulnerabilityJsonUnmarshaller.getInstance().unmarshall(context));
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
