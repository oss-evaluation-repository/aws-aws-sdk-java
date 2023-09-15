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
package com.amazonaws.services.securityhub.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.securityhub.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * StandardsControl JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StandardsControlJsonUnmarshaller implements Unmarshaller<StandardsControl, JsonUnmarshallerContext> {

    public StandardsControl unmarshall(JsonUnmarshallerContext context) throws Exception {
        StandardsControl standardsControl = new StandardsControl();

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
                if (context.testExpression("StandardsControlArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    standardsControl.setStandardsControlArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ControlStatus", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    standardsControl.setControlStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DisabledReason", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    standardsControl.setDisabledReason(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ControlStatusUpdatedAt", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    standardsControl.setControlStatusUpdatedAt(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("ControlId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    standardsControl.setControlId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Title", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    standardsControl.setTitle(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Description", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    standardsControl.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RemediationUrl", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    standardsControl.setRemediationUrl(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SeverityRating", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    standardsControl.setSeverityRating(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RelatedRequirements", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    standardsControl.setRelatedRequirements(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

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

        return standardsControl;
    }

    private static StandardsControlJsonUnmarshaller instance;

    public static StandardsControlJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new StandardsControlJsonUnmarshaller();
        return instance;
    }
}
