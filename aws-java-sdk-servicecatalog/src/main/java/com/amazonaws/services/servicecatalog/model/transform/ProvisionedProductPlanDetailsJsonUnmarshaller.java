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
 * ProvisionedProductPlanDetails JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ProvisionedProductPlanDetailsJsonUnmarshaller implements Unmarshaller<ProvisionedProductPlanDetails, JsonUnmarshallerContext> {

    public ProvisionedProductPlanDetails unmarshall(JsonUnmarshallerContext context) throws Exception {
        ProvisionedProductPlanDetails provisionedProductPlanDetails = new ProvisionedProductPlanDetails();

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
                if (context.testExpression("CreatedTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    provisionedProductPlanDetails.setCreatedTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("PathId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    provisionedProductPlanDetails.setPathId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ProductId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    provisionedProductPlanDetails.setProductId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PlanName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    provisionedProductPlanDetails.setPlanName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PlanId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    provisionedProductPlanDetails.setPlanId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ProvisionProductId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    provisionedProductPlanDetails.setProvisionProductId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ProvisionProductName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    provisionedProductPlanDetails.setProvisionProductName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PlanType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    provisionedProductPlanDetails.setPlanType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ProvisioningArtifactId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    provisionedProductPlanDetails.setProvisioningArtifactId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    provisionedProductPlanDetails.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("UpdatedTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    provisionedProductPlanDetails.setUpdatedTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("NotificationArns", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    provisionedProductPlanDetails.setNotificationArns(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("ProvisioningParameters", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    provisionedProductPlanDetails.setProvisioningParameters(new ListUnmarshaller<UpdateProvisioningParameter>(
                            UpdateProvisioningParameterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("Tags", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    provisionedProductPlanDetails.setTags(new ListUnmarshaller<Tag>(TagJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("StatusMessage", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    provisionedProductPlanDetails.setStatusMessage(context.getUnmarshaller(String.class).unmarshall(context));
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

        return provisionedProductPlanDetails;
    }

    private static ProvisionedProductPlanDetailsJsonUnmarshaller instance;

    public static ProvisionedProductPlanDetailsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ProvisionedProductPlanDetailsJsonUnmarshaller();
        return instance;
    }
}
